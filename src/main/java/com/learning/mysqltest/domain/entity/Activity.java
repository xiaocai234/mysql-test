package com.learning.mysqltest.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@TableName("t_activity")
public class Activity {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer userId;
    private Integer activityType;
    private LocalDateTime activityTime;
    private Integer contentId;
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}