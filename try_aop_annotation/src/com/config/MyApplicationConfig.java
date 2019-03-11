package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MyApplicationConfig {

}
