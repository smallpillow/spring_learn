package com.sun.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.sun.anno.MyPackageScan;
import com.sun.beans.OtherBean;
import com.sun.imports.MyImportBeanDefinitionRegistrar;
import com.sun.imports.MyImportSelector;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration // 标注当前类是一个配置类
// <context:component-scan base-package="com.sun"/>
@ComponentScan("com.sun")
// <context:property-placeholder location="classpath:jdbc.properties"/>
@PropertySource("classpath:jdbc.properties")
// 1.普通类
//@Import(OtherBean.class)
// 2.MyImportSelector
//@Import(MyImportSelector.class)
// 3.ImportBeanDefinitionRegistrar
//@Import(MyImportBeanDefinitionRegistrar.class)
// 4.实现Anno包装
@MyPackageScan()
@MapperScan("com.sun.Mapper")
public class SpringConfig {

    @Bean()
    // 注入属性
    public DataSource dataSource(
            @Value("${jdbc.driverClassName}") String driverClassName,
            @Value("${jdbc.url}") String url,
            @Value("${jdbc.username}") String userName,
            @Value("${jdbc.password}") String password
    ){
        DruidDataSource dataSource = new DruidDataSource();
        // 基本参数
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean SqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

}
