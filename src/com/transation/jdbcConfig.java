package com.transation;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author 刘棋军
 * @date2019-03-03
 */

public class jdbcConfig {
    @Bean(name="jdbcTemplate")
    public JdbcTemplate creeatJbbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
