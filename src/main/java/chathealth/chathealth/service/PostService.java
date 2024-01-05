package chathealth.chathealth.service;


import chathealth.chathealth.dto.request.PostSearch;
import chathealth.chathealth.dto.response.PostResponse;
import chathealth.chathealth.entity.post.Post;
import chathealth.chathealth.repository.PicturePostRepository;
import chathealth.chathealth.repository.post.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final PicturePostRepository picturePostRepository;

    // public Post insertPost(){}

    // 포스트 목록 조회
    public List<PostResponse> getPosts(PostSearch postSearch) {

        Long count = postRepository.getPostsCount(postSearch);

        // 페이지가 존재하지 않을 경우 마지막 페이지로 이동
        if (count / postSearch.getSize() < postSearch.getPage()) {
            postSearch.setPage((int) (count / postSearch.getSize()));
        }

        return postRepository.getPosts(postSearch).stream()
                .map(post ->
                        PostResponse.builder()
                                .id(post.getId())
                                .title(post.getTitle())
                                .createdDate(post.getCreatedDate())
                                .company(post.getMember().getCompany())
                                .representativeImg(getRepresentativeImg(post))
                                .count(count)
                                .build())
                .toList();
    }

    private String getRepresentativeImg(Post post) {
        return picturePostRepository.findAllByPostIdOrderByOrders(post.getId()).get(0).getPictureUrl();
    }

}