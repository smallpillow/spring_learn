package com.sun.mapper;

import com.sun.pojo.Account;

import java.util.List;

public interface UserMapper {
    List<Account> findAll();
}
