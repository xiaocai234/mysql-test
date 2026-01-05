package com.learning.mysqltest.domain.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@TableName("t_user")
public class User {

    @TableId("id")
    private Integer id;
@TableId("user_id")
private Long userId;
    @TableId("name")
    private String name;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
   @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

}
