package com.lucid.dream.domain.posts.payload;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostsResponse {

    private String author;

    private String title;

}
