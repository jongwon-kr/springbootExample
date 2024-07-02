package com.exampleSpringboot.example.StepA.yesIoc;

/**
 * 메시지 서비스를 위한 인터페이스.
 * 구현 클래스는 메시지 전송 기능을 제공해야 합니다.
 */
public interface MessageService {
    void sendMessage(String message);
}