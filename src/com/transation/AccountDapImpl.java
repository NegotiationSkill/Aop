package com.transation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 刘棋军
 * @date2019-02-28
 */
@Repository("accountServerDao")
public class AccountDapImpl  implements AccountDap {
    @Autowired
    private  JdbcTemplate jt;
    public AccountDapImpl(JdbcTemplate jt){
        this.jt = jt;
    }
    @Override
    public Account findById(int id) {
        List<Account> list = jt.query("SELECT * from account where id=?", new BeanPropertyRowMapper<Account>(Account.class), id);
       return list.isEmpty()?null:list.get(0);
    }

    @Override
    public Account findByName(String name) {
        List<Account> list = jt.query("SELECT * from account where UserName=?", new BeanPropertyRowMapper<Account>(Account.class), name);
        if (list.size()==0){
            return null;
        }
        if (list.size()>1){
            new RuntimeException("数据不对请检查数据");
        }
        return list.get(0);
    }

    @Override
    public void update(Account account) {
        jt.update("update account set UserName=?,money=? where id=?",account.getUserName(),account.getMoney(),account.getId());
    }
}
