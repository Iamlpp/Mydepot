package com.qfedu.mapper.user;

import com.qfedu.domain.user.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/7/24 14:33
 */
public interface UserMapper {
    @Insert("insert into t_user(username,password,phone,uid) values(#{username},#{password},#{phone},#{uid})")
    int insert(User user);
    @Select("select id,username,password,phone,uid from t_user")
    @ResultType(User.class)
    List<User> queryPage(@Param("index") int index,@Param("count") int count);

}
