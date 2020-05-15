package com.lucid.dream.controller;

import com.lucid.dream.domain.posts.repository.PostsRepository;
import com.lucid.dream.dto.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;

    @GetMapping("/dream")
    public String hello() {

        return "hello my dream";
    }
    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto ) {
        postsRepository.save(dto.toEntity());

    }
}
