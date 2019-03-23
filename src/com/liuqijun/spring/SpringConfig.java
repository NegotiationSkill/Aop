package com.liuqijun.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 刘棋军
 * @date2019-02-26
 */
@Configuration
@ComponentScan({"com.liuqijun.spring","Util"})
@EnableAspectJAutoProxy
public class SpringConfig {

}
