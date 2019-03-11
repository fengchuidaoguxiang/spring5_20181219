package com.service.impl;

import com.dao.IAccountDAO;
import com.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements IAccountService {

    @Autowired
    IAccountDAO dao;

    @Override
    public void trans(long outId, long inId, int money) {
        dao.transOut(outId,money);
        int t = 1/0;
        dao.transIn(inId,money);
        System.out.println("转账完成");
    }
    @Transactional(readOnly = true)
    public void queryXxx(){

    }
}
