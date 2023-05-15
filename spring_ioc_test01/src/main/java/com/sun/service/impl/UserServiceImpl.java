package com.sun.service.impl;

import com.sun.pojo.User;
import com.sun.dao.impl.UserDaoImpl;
import com.sun.mapper.UserMapper;
import com.sun.service.UserService;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public class UserServiceImpl implements UserService, InitializingBean {

    // 注入List
    private UserDaoImpl userDao;
    private String username;
    private UserMapper userMapper;


    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserDaoImpl getUserDao() {
        return userDao;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public UserServiceImpl(){
        System.out.println("无参数构造");
    }

    public UserServiceImpl(String username){
        System.out.println("有参数构造");
    }

    public void init(){
        System.out.println("创建方法...");
    }

    public void destroy(){
        System.out.println("销毁方法...");
    }
    // BeanFactory调用方法，将userDao设置在此处

    public void setUserDao(UserDaoImpl userDao){
        this.userDao = userDao;
        System.out.println("属性设置完毕...");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet执行");
    }

    @Override
    public void show() {
        List<User> all = userMapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }
}
