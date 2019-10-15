package com.example.clientminh.config;

import com.example.clientminh.service.HelloWorld;
import com.example.clientminh.service.HelloWorldServiceLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.rpc.ServiceException;

@Configuration
public class MinhConfig {
    @Bean
    HelloWorld helloWorld() throws ServiceException {
        return new HelloWorldServiceLocator().getHelloWorldPort();
    }
}
