package com.exampleSpringboot.example.StepA.yesIoc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 스프링 부트 애플리케이션의 시작 클래스.
 * 애플리케이션을 실행하고 초기 설정을 수행합니다.
 */
@SpringBootApplication
public class RunApplication {

    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }

    /**
     * 애플리케이션 시작 시 실행되는 CommandLineRunner 빈을 정의합니다.
     * MyApplication 빈을 가져와 메시지를 처리합니다.
     *
     * @param context 스프링 애플리케이션 컨텍스트
     * @return CommandLineRunner 빈
     */
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
        return args -> {
            // 스프링 컨테이너에서 MyApplication 빈을 가져옵니다.
            Application app = context.getBean(Application.class);
            // 메시지를 처리합니다.
            app.processMessage("안녕하세요!!");
        };
    }
}