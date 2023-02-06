package org.example.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.lang.annotation.Target;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
//In jdbc class we've the scope of it is prototype,even though the depedency in the personDAO is by default its use the
//singleton scope that doesn't know about its dependency its class,, by externally we need to use proxymode
//to tell the class which uses dependencies of the other classes which is their scope is defined as the prototype
//we need to use the proxymode =Target class so that every time it creates  different  dependency obj  of the same singleton class

public class JdbcConnection {
    public JdbcConnection() {
        System.out.println("Iam jdbc constructor");
    }
}
