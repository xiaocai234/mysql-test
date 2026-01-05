package com.learning.mysqltest.controller;

import com.learning.mysqltest.common.Result;
import com.learning.mysqltest.model.vo.Day7RetentionVO;
import com.learning.mysqltest.service.RetentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/retention")
public class RetentionController {

    @Autowired
    private RetentionService retentionService;

    @GetMapping("/day7")
    public Result<List<Day7RetentionVO>> getDay7Retention() {
        List<Day7RetentionVO> result = retentionService.calculateDay7Retention();
        return Result.ok(result);
    }


}