package com.spring.jdbctemplate;

/**
 * @author 刘棋军
 * @date2019-02-28
 */

public interface AccountDap {
    public Account findById(int id);
    public Account findByName(String name);
    public void update(Account account);
}
