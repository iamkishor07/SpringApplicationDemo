package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Student implements  Human{
    @Override
    public void age() {
        System.out.println("Iam 16 Years old");
    }

    @Override
    public void name() {
        System.out.println("Iam Kishor");
    }

    @Override
    public void profession() {
        System.out.println("Iam a Student");
    }

    @Override
    public void Gender() {
        System.out.println("male");
    }
    public void extafeatures() {
        System.out.println("I've extra qualities");
    }

    @Override
    public void motherTongeu() {
        System.out.println("Telugu");
    }
}
