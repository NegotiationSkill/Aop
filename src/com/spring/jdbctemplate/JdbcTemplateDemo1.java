package com.spring.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

/**
 * @author 刘棋军
 * @date2019-02-27
 *
 * jdbcTemplate的基本使用。
 */

public class JdbcTemplateDemo1 {
    public static void main(String[] args){
    /*
        //数据源绑定
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/template?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false");
        ds.setUsername("root");
        ds.setPassword("123");
        //创建对象
        JdbcTemplate jt = new JdbcTemplate();
        jt.setDataSource(ds);
        //操作
        jt.execute("INSERT into account(UserName,money) VALUES('zhangcong',500)");*/

        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
        //jt.execute("INSERT into account(UserName,money) VALUES('liuqijun',500)");
        //保存客户
       // jt.update("INSERT into account(UserName,money) VALUES(?,?)","tenjing",30);

        //jt.update("update account set money=? where id=?",500,7);

        //jt.update("delete from account where id=?",7);
        //查询多个
       List<Account> accounts = jt.query("select * from account where money>?",new BeanPropertyRowMapper<Account>(Account.class),200);
       for(Account a:accounts){
            System.out.println(a);
       }
       //查询一个

    }
}
