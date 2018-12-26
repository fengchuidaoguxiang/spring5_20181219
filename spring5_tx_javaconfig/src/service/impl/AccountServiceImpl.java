package service.impl;

import dao.IAccountDAO;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.IAccountService;

@Service
@Transactional
public class AccountServiceImpl implements IAccountService {
    @Autowired
    @Setter
    private IAccountDAO dao;

    @Override
    public void trans(long outId, long inId, int money) {
        dao.transOut(outId,money);
        int a = 1 / 0;
        dao.transIn(inId,money);
    }
//    @Transactional(readOnly = true)
//    public List listXXX(){
//
//    }
}
