package com.lucid.dream.domain.payload;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {

    private String userName;
    private String message;
}
