package chathealth.chathealth.entity.post;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;

import static lombok.AccessLevel.PROTECTED;


@Entity
@ToString
@Setter
@Getter
@SuperBuilder

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor(access = PROTECTED)
@DynamicUpdate

@Table(name = "PicturePost")
public class PicturePost {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "picture_id")
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "post_id")
    private Post postId;

    @Column(name = "picture_url")
    private String pictureUrl;

    private Integer orders;

}
