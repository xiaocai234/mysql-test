package com.learning.mysqltest.service.impl;

import com.learning.mysqltest.mapper.ActivityMapper;
import com.learning.mysqltest.model.vo.Day7RetentionVO;
import com.learning.mysqltest.service.RetentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class RetentionServiceImpl implements RetentionService {

    @Autowired
    private ActivityMapper activityMapper;

    @Override
    public List<Day7RetentionVO> calculateDay7Retention() {

        return activityMapper.calculateDay7Retention();
    }
}