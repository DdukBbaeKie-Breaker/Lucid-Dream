package com.lucid.dream.domain.payload.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponse {

    private String content;

    private String sender;

}
