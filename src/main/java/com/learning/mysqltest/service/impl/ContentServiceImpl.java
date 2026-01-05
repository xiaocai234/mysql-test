package com.learning.mysqltest.service.impl;

import com.learning.mysqltest.mapper.ContentMapper;
import com.learning.mysqltest.model.dto.ContentDTO;
import com.learning.mysqltest.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContentServiceImpl implements ContentService {
@Autowired
private ContentMapper contentMapper;
    @Override
    public List<ContentDTO> getDescByAllUserMaxLike() {
List<ContentDTO> descByAllUserMaxLike=contentMapper.getDescByAllUserMaxLike();

        return descByAllUserMaxLike;

    }
}
