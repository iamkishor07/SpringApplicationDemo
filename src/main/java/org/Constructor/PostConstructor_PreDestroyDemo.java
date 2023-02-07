package org.Constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
    public class PostConstructor_PreDestroyDemo {
    @Autowired
    PostConstructor_PreDestroyJdbcConnection obj;

    public PostConstructor_PreDestroyJdbcConnection getObj() {
        return obj;
    }

    public void setObj(PostConstructor_PreDestroyJdbcConnection obj) {
        this.obj = obj;
    }
    @PostConstruct
    //Spring calls the methods annotated with @PostConstruct only once, just after the initialization of bean properties
    //hat these methods will run even if there's nothing to initialize
    //One possible use of @PostConstruct is populating a database. For instance, during development,
    // we might want to create some default users
    public void postConstruct(){
        obj.save("Kishor","123456789");
        //The above is the default intialization of the user and password
        System.out.println("Iam a postConstructor ");
    }
    @PreDestroy
    //@PreDestroy runs only once, just before Spring removes our bean from the application context.
    //Same as with @PostConstruct, the methods annotated with @PreDestroy can have any access level, but can't be static.
    //purpose of this method should be to release resources or perform other cleanup tasks, such as closing a database connection,
    // before the bean gets destroyed.
    public  void preDestroy(){
        System.out.println("Iam a PreDestroy Method ");
        obj.Close();
    }



}
