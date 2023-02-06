package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //It has higher priority overthe type mentioned at the object reference in the autowired
@Qualifier("father")
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

    @Override
    public void motherTongeu() {
        System.out.println("Telugu");
    }

    public void extafeatures() {
        System.out.println("I've only few extra qualities");
    }

    

    @Override
    public void anytalents() {
        System.out.println("I don't have any talent");
    }
}
