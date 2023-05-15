package com.sun.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import java.lang.reflect.Proxy;
import java.util.Date;

public class TimeLogBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return Proxy.newProxyInstance(
                bean.getClass().getClassLoader(),
                bean.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    // 输出开始时间
                    System.out.println("方法:" + method.getName() + "-开始时间" + new Date());
                    // 执行方法
                    Object result = method.invoke(bean, args);
                    // 输出结束时间
                    System.out.println("方法:" + method.getName() + "-开始时间" + new Date());
                    return result;
                }
        );
    }
}
