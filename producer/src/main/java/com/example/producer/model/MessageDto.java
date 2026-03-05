package com.example.producer.model;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

public class MessageDto {
    @Getter
    public static class Abcd{
        private Long idx;
        private String abcd01;
        private String abcd02;
    }
}
