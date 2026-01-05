package com.learning.mysqltest.model.vo;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;


@Data
public class Day7RetentionVO {

    private LocalDate regDate;

    private Integer regUserCnt;

    private Integer day7ActiveCnt;

    private BigDecimal day7RetentionRate;
}