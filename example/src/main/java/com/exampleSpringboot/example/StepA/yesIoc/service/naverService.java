package com.exampleSpringboot.example.StepA.yesIoc.service;

import com.exampleSpringboot.example.StepA.yesIoc.MessageService;
import org.springframework.stereotype.Service;

/**
 * SmsService는 MessageService를 구현하여
 * SMS 메시지를 전송하는 기능을 제공합니다.
 */
@Service
// 이 어노테이션을 사용하면 기본으로 주입되는 빈이 됩니다.
//@Primary
public class naverService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("네이버 메시지 : " + message);
    }
}