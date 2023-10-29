// AppConfig.java (Configuration class)
package com.bhuwan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
@Configuration
@ComponentScan(basePackages = "com.bhuwan.beans") // alternet to  <context:component-scan />
public class AppConfig {
    @Bean(name = "ltd")
    public LocalDateTime createLocalDateTime(){
        LocalDateTime localDateTime = LocalDateTime.now(); // gives system date and time
        return localDateTime;
    }
}
