package com.lucid.dream.Service;

import com.lucid.dream.domain.payload.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public Message createChat(Message message) {

        return Message.builder()
                .userName(message.getUserName())
                .message(message.getMessage())
                .build();
    }
}
