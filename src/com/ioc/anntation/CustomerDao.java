package com.ioc.anntation;

import org.springframework.stereotype.Repository;

/**
 * @author 刘棋军
 * @date2019-02-26
 */
@Repository
public class CustomerDao {
    public void say(){
        System.out.println("0101这里是dao");
    }
}
