package chathealth.chathealth.repository.post;

import chathealth.chathealth.dto.request.PostSearch;
import chathealth.chathealth.entity.post.Post;
import chathealth.chathealth.entity.post.SymptomType;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

import static chathealth.chathealth.entity.member.QEnt.ent;
import static chathealth.chathealth.entity.post.QMaterial.material;
import static chathealth.chathealth.entity.post.QMaterialPost.materialPost;
import static chathealth.chathealth.entity.post.QPost.post;
import static chathealth.chathealth.entity.post.QSymptom.symptom;

@RequiredArgsConstructor
public class PostRepositoryImpl implements PostRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<Post> getPosts(PostSearch postSearch) {
        return queryFactory.selectFrom(post)
                .where(post.deletedDate.isNull(),
                        titleContains(postSearch.getTitle()),
                        companyEq(postSearch.getCompany()),
                        symptomTypeEq(postSearch.getSymptomType()),
                        materialIn(postSearch.getMaterialName())
                        )
                .innerJoin(post.member, ent)
                .fetchJoin()
                .leftJoin(post.symptom, symptom)
                .fetchJoin()
                .rightJoin(materialPost).on(materialPost.post.eq(post))
                .fetchJoin()
                .leftJoin(materialPost).on(materialPost.material.eq(material))
                .fetchJoin()
                .orderBy(getOrderSpecifier(postSearch))
                .limit(postSearch.getSize())
                .offset(postSearch.getOffset())
                .fetch();
    }

    @Override
    public Long getPostsCount(PostSearch postSearch) {
        return queryFactory
                .select(post.count())
                .from(post)
                .where(post.deletedDate.isNull(),
                        titleContains(postSearch.getTitle()),
                        symptomTypeEq(postSearch.getSymptomType()),
                        materialIn(postSearch.getMaterialName())
                )
                .leftJoin(post.symptom, symptom)
                .rightJoin(materialPost).on(materialPost.post.eq(post))
                .leftJoin(materialPost).on(materialPost.material.eq(material))
                .fetchOne();
    }

    private static BooleanExpression materialIn(List<String> materialName) {
        if (materialName == null || materialName.isEmpty()) {
            return null;
        }
        return material.materialName.in(materialName);
    }

    private static BooleanExpression symptomTypeEq(SymptomType symptomType) {
        if (symptomType == null) {
            return null;
        }
        return symptom.symptomName.eq(symptomType);
    }

    private static BooleanExpression titleContains(String title) {
        if (title == null) {
            return null;
        }
        return post.title.contains(title);
    }

    private static BooleanExpression companyEq(String company) {
        if(company == null){
            return null;
        }
        return ent.company.eq(company);
    }

    private static OrderSpecifier<LocalDateTime> getOrderSpecifier(PostSearch postSearch) {
        switch (postSearch.getOrdercondition()){
            case RECENT -> {
                return post.createdDate.desc();
            }
            case OLD -> {
                return post.createdDate.asc();
            }
        }
        return post.createdDate.desc();
    }
}
