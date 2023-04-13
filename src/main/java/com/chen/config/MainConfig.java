package com.chen.config;

import com.chen.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {
    @Bean("person")
    public Person person01(){
        return new Person("lisi",20);
    }
}
