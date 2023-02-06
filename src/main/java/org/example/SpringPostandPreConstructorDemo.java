package org.example;


import org.Constructor.PostConstructor_PreDestroyDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class SpringPostandPreConstructorDemo {
    public static void main(String[] args) throws Exception{
        ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
//      ApplicationContext factory=SpringApplication.run(SpringScopeApplicationDemo.class, args);


        PostConstructor_PreDestroyDemo obj=  factory.getBean(PostConstructor_PreDestroyDemo.class);
        obj.getObj();

    }
}