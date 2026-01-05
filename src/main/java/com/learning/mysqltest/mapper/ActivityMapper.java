package com.learning.mysqltest.mapper;

import com.learning.mysqltest.model.vo.Day7RetentionVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface ActivityMapper{

    @Select("SELECT d.reg_date, d.reg_cnt, IFNULL(a.active_cnt,0) day7_active_cnt, IF(d.reg_cnt=0,0,ROUND(IFNULL(a.active_cnt,0)/d.reg_cnt,4)) day7_retention_rate FROM (SELECT DATE(create_time) reg_date, COUNT(DISTINCT id) reg_cnt FROM t_user GROUP BY reg_date) d " +
            "LEFT JOIN (SELECT DATE(u.create_time) reg_date, COUNT(DISTINCT a.user_id) active_cnt FROM t_user u JOIN t_activity a ON u.id=a.user_id " +
            "WHERE DATE(a.activity_time)=DATE_ADD(DATE(u.create_time),INTERVAL 7 DAY) AND a.activity_type IN (1,2) " +
            "GROUP BY reg_date) a ON d.reg_date=a.reg_date ORDER BY d.reg_date")
    List<Day7RetentionVO> calculateDay7Retention();


}