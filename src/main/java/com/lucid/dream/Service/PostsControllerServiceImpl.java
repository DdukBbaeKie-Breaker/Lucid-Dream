package com.lucid.dream.Service;

import com.lucid.dream.domain.posts.Posts;
import com.lucid.dream.domain.posts.payload.PostsResponse;
import com.lucid.dream.domain.posts.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostsControllerServiceImpl implements PostsControllerService{

    @Autowired
    PostsRepository postsRepository;

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
}
