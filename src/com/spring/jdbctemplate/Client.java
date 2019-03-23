package com.spring.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author 刘棋军
 * @date2019-02-28
 */

public class Client {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountDapImpl account = (AccountDapImpl) ac.getBean("accountDao");
      //  System.out.println(account.getJt().getDataSource());
        Account a = account.findById(1);

        System.out.println(a.getId()+a.getUserName()+a.getMoney());
    }

}
