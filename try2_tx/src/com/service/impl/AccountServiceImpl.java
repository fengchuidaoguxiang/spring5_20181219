package com.service.impl;

import com.dao.IAccountDao;
import com.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Transactional
public class AccountServiceImpl implements IAccountService {

    @Autowired
    IAccountDao dao;

    @Override
//    @Transactional(readOnly = true)
    public void trans(int outId, int inId, int money) {
        dao.tranout(outId,money);
        int t = 1/0;
        dao.tranint(inId,money);
        System.out.println("转账完成");
    }
}
