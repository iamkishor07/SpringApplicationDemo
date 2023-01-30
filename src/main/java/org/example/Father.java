package org.example;

import org.springframework.stereotype.Component;

@Component
public class Father implements  Human{
    public void name(){
        System.out.println("My name is Srinivas");
    }

    @Override
    public void profession() {
        System.out.println("I am a School Teacher");
    }

    @Override
    public void age() {
        System.out.println("Iam 25 years old");
    }

    @Override
    public void Gender() {
        System.out.println("Male");
    }
}
