package com.lucid.dream.domain.payload.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostsResponse {

    private String author;

    private String title;

}
