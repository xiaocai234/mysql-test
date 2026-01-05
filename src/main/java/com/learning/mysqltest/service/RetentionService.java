package com.learning.mysqltest.service;

import com.learning.mysqltest.model.vo.Day7RetentionVO;
import java.util.List;


public interface RetentionService {

    List<Day7RetentionVO> calculateDay7Retention();
}