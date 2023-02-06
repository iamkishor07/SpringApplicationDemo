package org.example.Basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
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

    @Override
    public void Gender() {
        System.out.println("Female");
    }

    @Override
    public void motherTongeu() {
        System.out.println("Telugu");
    }


    @Override
    public void anytalents() {
        System.out.println("My other talents are stocks");
    }


    public void extafeatures() {
        System.out.println("I don't have any extra qualities");
    }

}
