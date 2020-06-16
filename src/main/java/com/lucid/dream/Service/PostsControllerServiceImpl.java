package com.lucid.dream.Service;

import com.lucid.dream.domain.Posts;
import com.lucid.dream.domain.payload.response.PostsResponse;
import com.lucid.dream.domain.repository.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostsControllerServiceImpl implements PostsControllerService{

    private final PostsRepository postsRepository;

    @Override
    public List<PostsResponse> viewPostList() {

        List<PostsResponse> list = new ArrayList<>();

        List<Posts> posts = postsRepository.findAll();

        for (Posts post : posts ) {
            list.add(
                    PostsResponse.builder()
                    .title(post.getTitle())
                    .author(post.getAuthor())
                    .build()
            );
        }

        return list;
    }

    public String viewContent(Integer id) throws Exception {

        Posts content = postsRepository.findById(id).orElseThrow(Exception::new);

         return content.getContent();

    }
}
