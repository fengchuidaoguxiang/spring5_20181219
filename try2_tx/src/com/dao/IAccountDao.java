package com.dao;

public interface IAccountDao {

    public int tranout(int outid,long money);

    public int tranint(int intid,long money);
}
