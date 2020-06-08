package com.lucid.dream.Service;

import com.lucid.dream.domain.payload.response.MessageResponse;
import com.lucid.dream.domain.repository.MessagesRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public final MessagesRepository messagesRepository;

    public MessageService(MessagesRepository messagesRepository) {
        this.messagesRepository = messagesRepository;
    }

    public MessageResponse setMessage(MessageResponse message) {

        return MessageResponse.builder()
                .content(message.getContent())
                .sender(message.getSender())
                .build();
    }

}
