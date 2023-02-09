package org.propertyFileDI;


import org.example.AppConfig;
import org.example.Basic.LivingThing;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan
@PropertySource("add.properties")
//The above annotation added to scan the property file in defined path (By default its search in the resources
//and provides the necessary info or load primitive values through runtime
//It helps in providing default values and helps in add multiple property values and can change it dynamically for
//differnet stages different property files
public class SpringPropertyFileDI {
    public static void main(String[] args) {
        ApplicationContext factory=new AnnotationConfigApplicationContext(SpringPropertyFileDI.class);

        propertyFile_DI obj=  factory.getBean(propertyFile_DI.class);
        obj.getConnection();

    }
}