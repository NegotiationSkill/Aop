package com.liuqijun.spring;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.stereotype.Service;

/**
 * @author 刘棋军
 * @date2019-02-21
 */
@Service("customerServer")
public class CustomerServerImp implements CustomerServer {
    @Override
    public void save() {
        System.out.println("保存客户");
    }

    @Override
    public int delete() {
       System.out.println("删除客户");
        return 0;
    }

    @Override
    public void update(int i) {
        System.out.println("更新客户");
       // int t= 1/0;

    }

}
