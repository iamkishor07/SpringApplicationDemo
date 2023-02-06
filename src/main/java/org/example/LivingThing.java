package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //By default, everything is singleton scope so,that we've to define the scope to prototype
//the it creates new bean for every request from the container/application context
public class LivingThing {
    @Autowired
    @Qualifier("father") ///uses to call specific class obj ,if it has multiple classes
    private Human obj;//It has the less priority over the primary over the type that is given in the reference

    public  void display(){
        System.out.println("These are the following Details");
        obj.name();
        obj.profession();
        obj.age();
        obj.Gender();
        obj.motherTongeu();
        obj.anytalents();

    }
}
