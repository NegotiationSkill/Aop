package com.spring.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author 刘棋军
 * @date2019-03-01
 */

public class Support {
    private JdbcTemplate jt;

    public void setJt(JdbcTemplate jt){
        this.jt = jt;
    }

    public void setData(DataSource dataSource){
        if(jt == null){
            createTemplate(dataSource);
        }
    }

    private void createTemplate(DataSource dataSource) {
        jt = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getJt(){
        return jt;
    }
}
