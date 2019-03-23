package com.ioc.anntation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.aspectj.SpringConfiguredConfiguration;

/**
 * @author 刘棋军
 * @date2019-02-26
 */

public class Client {
    @Test
    public void test(){
        String xmlPath = "com/ioc/anntation/Application.xml";
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguredConfiguration.class);
        CustomerServer cs = (CustomerServer) ac.getBean("customerServer");
        cs.delete();
    }
}
