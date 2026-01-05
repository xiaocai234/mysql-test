package com.learning.mysqltest.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("t_content")
public class Content {
    @TableId("id")
    private Integer id;
    @TableId("user_id")
    private long userId;
    @TableId("like_count")
    private int likeCount;
    @TableId("content_title")
    private String contentTitle;
    @TableId("content_desc")
    private String contentDesc;
    @TableId("create_time")
    private LocalDateTime createTime;
    @TableId("update_time")
    private LocalDateTime updateTime;

}
