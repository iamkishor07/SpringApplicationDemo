package org.example;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.ComponentScan")
//It is used to specify the path to the container in which it needs to search for the beans or components
//in the specified directory
//if it is not set properly it may throws bean not found exception

//While using the @SpringBootApplication annotation, it takes the default path/directory of that class
//for searching beans in that specified path
//if at all we need to change thepath that is been taken by the Default SpringBOotAPplication annotaion
//we use ComponentScan to again specify subpackages or any other  path/Directory to the container to search for the beans

public class AppConfig {


}
