package com.liuqijun.spring;

import com.ioc.anntation.SpingConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.aspectj.SpringConfiguredConfiguration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 刘棋军
 * @date2019-02-21
 */

public class Client {
 public static void main(String[] args){


       ApplicationContext ac = new AnnotationConfigApplicationContext(SpingConfig.class);

       CustomerServer customer = (CustomerServer) ac.getBean("customerServer");
       System.out.println("-------------------------------");
       customer.save();

   }
}