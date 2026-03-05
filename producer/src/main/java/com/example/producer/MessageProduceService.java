package com.example.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessageProduceService {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessasge(String topic, String message){
        log.debug("MessageProducer - sendMessage : {}, {}",topic,message);
        kafkaTemplate.send(topic, message);
    }
}
