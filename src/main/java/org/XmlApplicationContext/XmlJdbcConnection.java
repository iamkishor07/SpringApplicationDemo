package org.XmlApplicationContext;

//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
//In jdbc class we've the scope of it is prototype,even though the depedency in the personDAO is by default its use the
//singleton scope that doesn't know about its dependency its class,, by externally we need to use proxymode
//to tell the class which uses dependencies of the other classes which is their scope is defined as the prototype
//we need to use the proxy mode =Target class so that every time it creates  different  dependency obj  of the same singleton class

import org.springframework.stereotype.Component;

@Component
public class XmlJdbcConnection {
    public XmlJdbcConnection() {
        System.out.println("Iam jdbc constructor");
    }
     public void display(){
         System.out.println("Iam a method in the connection class");
     }
}
