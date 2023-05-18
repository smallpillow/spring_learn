package com.sun.service.impl;

import com.sun.mapper.UserMapper;
import com.sun.pojo.Account;
import com.sun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void show() {
        List<Account> all = userMapper.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }

}
