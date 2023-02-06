package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);

        LivingThing obj=  factory.getBean(LivingThing.class);
        LivingThing obj1=  factory.getBean(LivingThing.class);
        obj.display();
        System.out.println(obj1==obj);

    }
}