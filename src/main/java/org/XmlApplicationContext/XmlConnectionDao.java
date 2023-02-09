package org.XmlApplicationContext;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component public class XmlConnectionDao {
    public XmlJdbcConnection getObj() {
        return this.obj;
    }

    public void setObj(XmlJdbcConnection obj) {
        this.obj = obj;
    }
//
    @Autowired private  XmlJdbcConnection obj;



    public void display(){
        System.out.println("Iam a method in the xmlconnection class");
    }



}
