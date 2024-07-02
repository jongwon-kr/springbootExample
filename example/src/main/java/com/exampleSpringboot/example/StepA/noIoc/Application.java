package com.exampleSpringboot.example.StepA.noIoc;

import com.exampleSpringboot.example.StepA.noIoc.service.naverService;

public class Application {
    private MessageService messageService;

    public Application() {
        this.messageService = new naverService(); // 직접 객체를 생성하고 의존성을 주입함
    }

    public void processMessage(String message) {
        messageService.sendMessage(message);
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.processMessage("안녕하세요!!");
    }
}
