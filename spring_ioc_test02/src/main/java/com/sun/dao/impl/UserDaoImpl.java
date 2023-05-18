package com.sun.dao.impl;

import com.sun.dao.UserDao;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Value;

@Repository("userDao")
@Profile("test")
public class UserDaoImpl implements UserDao {

    @Value("${jdbc.driverClassName}")
    private String username;

    @Override
    public void show() {
        System.out.println("UserDaoImpl1" + username);
    }

    /*
    public UserDaoImpl(){
        System.out.println("UserServiceImpl 创建");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("UserServiceImpl 销毁之前");
    }

    @PostConstruct
    public void init(){
        System.out.println("UserServiceImpl 创建完成之后");
    }*/
}
