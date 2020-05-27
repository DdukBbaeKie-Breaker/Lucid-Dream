package com.lucid.dream.Service;

import com.lucid.dream.domain.payload.response.PostsResponse;

import java.util.List;

public interface PostsControllerService {

    List<PostsResponse> viewPostList();
}
