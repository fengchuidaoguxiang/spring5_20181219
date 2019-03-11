package com.dao;

public interface IAccountDAO {

    public int transOut(long outId, int money);
    public int transIn(long inId, int money);
}
