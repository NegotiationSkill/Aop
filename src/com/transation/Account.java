package com.transation;

import java.io.Serializable;

/**
 * @author 刘棋军
 * @date2019-02-28
 */

public class Account implements Serializable {
    private  int id;
    private  String UserName;
    private  float money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}
