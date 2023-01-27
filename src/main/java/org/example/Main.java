package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
    LivingThing obj=  factory.getBean(LivingThing.class);
    obj.display();

    }
}