package com.transation;

/**
 * @author 刘棋军
 * @date2019-03-02
 */

public interface AccountServer {
    Account findById(int id);
    Account findByName(String name);
    void transfer(int source,int target,float money);

}
