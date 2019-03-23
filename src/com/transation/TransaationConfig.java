package com.transation;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author 刘棋军
 * @date2019-03-03
 */

public class TransaationConfig {
    @Bean(name="txManger")                //是此方法的返回值在spring的容器中
    public DataSourceTransactionManager creatTxManager(DataSource dataSource){
        return  new DataSourceTransactionManager(dataSource);
    }
}
