package com.sun.dao.impl;

import com.sun.dao.UserDao;
import com.sun.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("userDao")
@Scope("single")
public class  UserDaoImpl implements UserDao, InitializingBean {

    private String username;
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserDaoImpl() {
        System.out.println("对象创建");
    }

    private void init(){
        System.out.println("Init 初始化执行");
    }

    public void show() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("show...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("属性设置之后执行");
    }
}
