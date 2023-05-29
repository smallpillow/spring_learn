package com.sun.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface AccountMapper {

    @Update("update tb_account set money=money+#{Money} where account_name=#{AccountName}")
    public void incrMoney(@Param("AccountName") String AccountName,@Param("Money") Integer Money);

    @Update("update tb_account set money=money-#{Money} where account_name=#{AccountName}")
    public void decrMoney(@Param("AccountName") String AccountName,@Param("Money") Integer Money);

}
