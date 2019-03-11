package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class B {

    @Bean
    public C getC(){
        return new C();
    }
}
