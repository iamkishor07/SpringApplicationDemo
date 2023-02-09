package org.XmlApplicationContext;


import org.ComponentScan.ComponentDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlApplicationContext {

    public static void main(String[] args) {
        ApplicationContext factory= new ClassPathXmlApplicationContext("XmlApplicationContext.xml");
//        ApplicationContext factory=new AnnotationConfigApplicationContext(SpringPostandPreConstructorDemo.class);
        XmlConnectionDao obj= (XmlConnectionDao) factory.getBean(XmlConnectionDao.class);

//        System.out.println((Object)factory.getBeanDefinitionNames());
        obj.getObj().display();
        obj.display();

    }
}