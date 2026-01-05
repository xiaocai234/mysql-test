package com.learning.mysqltest.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper {
    @Select("select name from t_user where id = #{id} ")
    String getNameById(Integer id);

}
