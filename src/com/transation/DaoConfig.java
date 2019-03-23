package com.transation;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author 刘棋军
 * @date2019-03-03
 */

public class DaoConfig {

    @Bean(name = "dataSource")
    public DriverManagerDataSource creatDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/template");
        ds.setUsername("root");
        ds.setPassword("1602liuqijun");
        return ds;
    }
}
