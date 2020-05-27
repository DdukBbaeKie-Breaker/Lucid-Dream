package com.lucid.dream.controller;

import com.lucid.dream.Service.PostsControllerServiceImpl;
import com.lucid.dream.domain.payload.response.PostsResponse;
import com.lucid.dream.domain.repository.PostsRepository;
import com.lucid.dream.dto.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class WebRestController {

    @Autowired
    PostsControllerServiceImpl post;

    private PostsRepository postsRepository;

    @GetMapping("/dream")
    public String hello() {

        return "hello my dream";
    }
    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto ) {
        postsRepository.save(dto.toEntity());

    }

    @PostMapping("/postslist")
    public List<PostsResponse> postsList() {

        return post.viewPostList();
    }
}
