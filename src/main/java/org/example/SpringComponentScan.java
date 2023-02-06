package org.example;


import org.ComponentScan.ComponentDAO;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("org.ComponentScan")
public class SpringComponentScan {

    public static void main(String[] args) throws Exception{
        ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
//      ApplicationContext factory=SpringApplication.run(SpringScopeApplicationDemo.class, args);


        ComponentDAO obj=  factory.getBean(ComponentDAO.class);
        System.out.println(obj.getObj());

    }
}