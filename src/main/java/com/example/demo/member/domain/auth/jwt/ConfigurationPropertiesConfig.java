package com.example.demo.member.domain.auth.jwt;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(JWTProperties.class)
public class ConfigurationPropertiesConfig {
}
