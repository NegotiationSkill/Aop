package com.ioc.anntation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 刘棋军
 * @date2019-02-26
 */
@Service("customerServer")
public class CustomerServerImp implements CustomerServer {
    @Value(value = "服务层")
    private  String name;
   /* @Autowired
    @Qualifier("customerDao")*/
   @Resource(name = "customerDao")
    private  CustomerDao customerDao = null;

    @Override
    public void save() {
        System.out.println("保存");
    }

    @Override
    public void delete() {
        customerDao.say();
        System.out.println("删除"+name);
    }

    @Override
    public void update(User user) {
        System.out.println("更新");
    }
}
