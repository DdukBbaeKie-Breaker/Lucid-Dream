package com.lucid.dream.controller;

import com.lucid.dream.Service.PostsControllerServiceImpl;
import com.lucid.dream.domain.payload.response.PostsResponse;
import com.lucid.dream.domain.repository.PostsRepository;
import com.lucid.dream.dto.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class WebRestController {

    private final PostsControllerServiceImpl post;

    private PostsRepository postsRepository;

    @Autowired
    public WebRestController(PostsControllerServiceImpl post) {
        this.post = post;
    }

    @GetMapping("/dream")
    public String hello() {

        return "hello my dream";
    }

    @GetMapping("jisu")
    public String jisu() {
        return "안.녕.안.녕.나.는.지.수.야↗\n헬.륨.가.스.먹.었.더.니.요.로.케.됐.지~";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto) {
        postsRepository.save(dto.toEntity());

    }

    return 

    @PostMapping("/list")
    public List<PostsResponse> postsList() {
        return post.viewPostList();

    }

    @GetMapping("/choice")
    public String choice(@RequestParam Integer postNumber) throws Exception {

        return post.viewContent(postNumber);
    }

}