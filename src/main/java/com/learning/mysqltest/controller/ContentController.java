package com.learning.mysqltest.controller;

import com.learning.mysqltest.common.Result;
import com.learning.mysqltest.model.dto.ContentDTO;
import com.learning.mysqltest.service.ContentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/content")
public class ContentController {
    @Autowired
    private ContentService contentService;
    @RequestMapping("/maxlike")
    public Result<String> getDescByAllUserMaxLike(){
        List<ContentDTO> list=contentService.getDescByAllUserMaxLike();
        log.info("list:{}",list);
        return new Result<String>().setData(list.toString());

    }
}
