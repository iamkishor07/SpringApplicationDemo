package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component public class LivingThing {
    @Autowired
    Human obj;
    public  void display(){
        System.out.println("These are the following Details of an ");
        obj.name();
        obj.age();
        obj.Gender();
        obj.bloodGroup();
        obj.profession();
        obj.salaries();

    }
}
