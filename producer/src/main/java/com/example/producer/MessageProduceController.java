package com.example.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/kafka")
public class MessageProduceController {
    private final MessageProduceService messageProduceService;

    @GetMapping("/send")
    public void send(String topic, String message){
        messageProduceService.sendMessasge(topic, message);
    }
}
