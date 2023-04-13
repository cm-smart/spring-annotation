package com.chen;

import com.chen.bean.Person;
import com.chen.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);

        String[] namesForType = applicationContext.getBeanDefinitionNames();
        for(String name:namesForType){
            System.out.println(name);
        }
    }
}
