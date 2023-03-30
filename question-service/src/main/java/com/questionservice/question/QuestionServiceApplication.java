package com.questionservice.question;

import com.questionservice.question.config.ConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
public class QuestionServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuestionServiceApplication.class, args);
    }
}
