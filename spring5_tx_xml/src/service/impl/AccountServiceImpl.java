package service.impl;

import dao.IAccountDAO;
import lombok.Setter;
import service.IAccountService;

public class AccountServiceImpl implements IAccountService {

    @Setter
    private IAccountDAO dao;

    @Override
    public void trans(long outId, long inId, int money) {
        dao.transOut(outId,money);
        int a = 1 / 0;
        dao.transIn(inId,money);

    }
}
