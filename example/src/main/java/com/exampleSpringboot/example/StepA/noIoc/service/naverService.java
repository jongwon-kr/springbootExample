package com.exampleSpringboot.example.StepA.noIoc.service;

import com.exampleSpringboot.example.StepA.noIoc.MessageService;

public class naverService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("네이버 메시지 : " + message);
    }
}
