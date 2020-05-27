package com.lucid.dream.controller;

import com.lucid.dream.Service.MessageService;
import com.lucid.dream.domain.payload.Message;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequiredArgsConstructor
public class SocketServerController {

    private MessageService messageService;

    @MessageMapping("/test/{number}")
    @SendTo("/topic/{number}")
    public Message chat(@DestinationVariable Integer number, Message message) {
        return messageService.createChat(message);
    }
}
