package com.exampleSpringboot.example.StepA.noIoc.service;

import com.exampleSpringboot.example.StepA.noIoc.MessageService;

public class kakaoService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("카카오 메시지 : " + message);
    }
}
