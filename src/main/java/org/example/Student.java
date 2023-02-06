package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("stud") //another alternative to primary if we have multiple class with same interface then
    //we can usse the quantifer annotation so that which obj has to created at the runnig time by giving the
// writing the quantifier at the autowired
public class Student implements  Human{

//    private Student() {
//        System.out.println("Iam private constructor");
//    }


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


    @Override
    public void motherTongeu() {
        System.out.println("Telugu");
    }

    @Override
    public void anytalents() {
        System.out.println("I've other fast calculation talent");
    }
}
