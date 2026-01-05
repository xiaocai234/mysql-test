package com.learning.mysqltest.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ContentDTO {
    private Integer id;
    private Integer userId;
    private Integer likeCount;
    private String contentTitle;
    private String contentDesc;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

}
