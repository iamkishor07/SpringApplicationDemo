package org.example;

import org.springframework.stereotype.Component;

@Component
public class Employee implements  Human{
    @Override
    public void age() {
        System.out.println("Iam 35 years old");
    }

    @Override
    public void name() {
        System.out.println("Iam Mahesh");
    }

    @Override
    public void profession() {
        System.out.println("Iam a senior Software Developer");
    }
}
