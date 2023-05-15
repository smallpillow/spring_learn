package com.sun.factory;


import com.sun.dao.UserDao;
import com.sun.dao.impl.UserDaoImpl;

public class MyBeanFactory {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDao userDao(){
        return new UserDaoImpl();
    }
}
