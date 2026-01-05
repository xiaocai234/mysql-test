package com.learning.mysqltest.mapper;

import com.learning.mysqltest.model.dto.ContentDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ContentMapper {

    @Select("select * from t_content c inner join t_user u on c.user_id = u.id" +
            " where c.like_count = (select max(like_count) from t_content)" +
            "order by c.like_count desc")
    List<ContentDTO> getDescByAllUserMaxLike();

}
