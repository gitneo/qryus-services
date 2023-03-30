package com.questionservice.question.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("data.mongodb")
public record ConfigProperties(
        String database,
        String host,
        String port,
        String username,
        String password,
        String authenticationDatabase
        ) {
}
