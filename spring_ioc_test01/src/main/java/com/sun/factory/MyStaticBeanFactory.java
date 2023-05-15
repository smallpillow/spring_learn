package com.sun.factory;

import com.sun.dao.UserDao;
import com.sun.dao.impl.UserDaoImpl;

public class MyStaticBeanFactory {

    public static UserDao userDao(){
        return new UserDaoImpl();
    }
}
