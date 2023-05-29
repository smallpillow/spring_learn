package com.sun.dao.impl;

import com.sun.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("userDao2")
public class UserDaoImpl2 implements UserDao {

    @Value("${jdbc.driverClassName}")
    private String username;

    @Override
    public void show() {
        System.out.println("UserDaoImpl2" + username);
    }

}
