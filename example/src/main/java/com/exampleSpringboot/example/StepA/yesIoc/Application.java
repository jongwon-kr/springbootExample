package com.exampleSpringboot.example.StepA.yesIoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Application 클래스는 MessageService를 사용하여
 * 메시지 처리 기능을 제공합니다.
 */
@Component
public class Application {
    private final MessageService messageService;

    /**
     * 생성자를 통해 MessageService의 구현체를 주입받습니다.
     * 스프링이 자동으로 서비스 Bean을 주입
     */
    @Autowired
    public Application(MessageService messageService) {
        this.messageService = messageService;
    }

    /**
     * 메시지를 처리하는 메서드.
     * 주입받은 MessageService의 sendMessage 메서드를 호출합니다.
     */
    public void processMessage(String message) {
        messageService.sendMessage(message);
    }
}