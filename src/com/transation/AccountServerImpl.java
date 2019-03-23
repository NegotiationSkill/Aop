package com.transation;

import com.ioc.anntation.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 刘棋军
 * @date2019-03-02
 */
@Service("accountService")
public class AccountServerImpl implements AccountServer {
    @Autowired
    private AccountDap accountDao;

    @Override
    public Account findById(int id) {
        return accountDao.findById(id);
    }

    @Override
    public Account findByName(String name) {

       return accountDao.findByName(name);
    }
    @Transactional
    @Override
    public void transfer(int source,int target,float money) {
        //查询出账户信息
        Account sourceUser = findById(source);
        Account targetUser = findById(target);

        //转账
        sourceUser.setMoney(sourceUser.getMoney()-money);

        targetUser.setMoney(targetUser.getMoney()+money);

        accountDao.update(sourceUser);
       //int a=1/0;
        accountDao.update(targetUser);
    }
}
