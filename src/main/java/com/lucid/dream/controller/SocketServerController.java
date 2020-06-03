package com.lucid.dream.controller;

import com.lucid.dream.Service.MessageService;
import com.lucid.dream.domain.payload.message.Message;
import com.lucid.dream.domain.payload.response.MessageResponse;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequiredArgsConstructor
public class SocketServerController {

    private MessageService messageService;


    @MessageMapping("/chat.sendMessage")
    @SendTo("topic/public")
    public Message sendMessage(Message message) {
        return message;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public MessageResponse addUser(MessageResponse message) {
        messageService.setMessage(message);
        return message;
    }
}
