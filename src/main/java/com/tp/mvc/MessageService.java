package com.tp.mvc;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String process(String msg) {
        // mettre en majuscules
        return msg.toUpperCase();
    }
}