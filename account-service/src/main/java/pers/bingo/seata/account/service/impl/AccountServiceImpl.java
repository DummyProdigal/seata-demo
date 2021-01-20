package pers.bingo.seata.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.bingo.seata.account.dao.AccountDAO;
import pers.bingo.seata.account.service.AccountService;

/**
 * @Author GouBin
 * @Date 2021/1/13
 * @Version 1.0
 * @Modified_By
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDAO accountDAO;

    @Override
    public void debit(String userId, int money) {

    }
}
