package com.ioc.anntation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 刘棋军
 * @date2019-02-26
 */
@ComponentScan({"com.ioc.anntation"})
public class SpingConfig {

    @Bean("customerDao1")
    public CustomerDao createDao(){
        return new CustomerDao();
    }
    @Bean("customerServer1")
    public CustomerServer createServer(){
        return new CustomerServerImp();
    }
}
