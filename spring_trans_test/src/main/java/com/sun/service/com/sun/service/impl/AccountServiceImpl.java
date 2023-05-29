package com.sun.service.com.sun.service.impl;

import com.sun.mapper.AccountMapper;
import com.sun.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public void transformMoney(String outAccount, String inAccount, Integer money) {
        accountMapper.decrMoney(outAccount, money);
        accountMapper.incrMoney(inAccount, money);
    }
}
