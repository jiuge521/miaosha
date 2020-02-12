package com.jiuge.dao;

import com.jiuge.pojo.MiaoshaUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MiaoshaUserDao {
    @Select("select * from miaosha_user where id=#{id}")
     MiaoshaUser getById(@Param("id")Long id);
    @Update("update miaosha_user set password = #{password} where id = #{id}")
    public void update(MiaoshaUser toBeUpdate);
}
