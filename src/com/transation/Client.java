package com.transation;

import com.liuqijun.spring.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 刘棋军
 * @date2019-02-28
 */

public class Client {
    public static void main(String[] args){
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        /*AccountDapImpl dao = (AccountDapImpl) ac.getBean("accountServerDao");
        System.out.println(dao);*/
        AccountServerImpl account = (AccountServerImpl) ac.getBean("accountService");
        account.transfer(5,6,100);
        Account a = account.findById(1);
        System.out.println( a.getId()+a.getMoney()+a.getUserName());
    }

}
