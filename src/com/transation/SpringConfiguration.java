package com.transation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 刘棋军
 * @date2019-03-03
 */
@Configuration
@ComponentScan({"com.transation"})     //配置扫描的包
@EnableTransactionManagement(proxyTargetClass = true)           //使spring 支持注解
@Import({DaoConfig.class,jdbcConfig.class,TransaationConfig.class})
public class SpringConfiguration {

}
