package org.example;


import org.example.scope.personDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringScopeApplicationDemo {

    public static void main(String[] args) throws Exception{
        ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
//      ApplicationContext factory=SpringApplication.run(SpringScopeApplicationDemo.class, args);


        personDAO obj=  factory.getBean(personDAO.class);
        personDAO obj1=  factory.getBean(personDAO.class);
        System.out.println(obj1);
        System.out.println(obj1.getObj());
        System.out.println(obj1.getObj());
        System.out.println(obj);
        System.out.println(obj.getObj());
        System.out.println(obj.getObj());

    }
}