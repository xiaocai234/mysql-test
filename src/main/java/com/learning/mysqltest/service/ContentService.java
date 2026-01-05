package com.learning.mysqltest.service;

import com.learning.mysqltest.model.dto.ContentDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ContentService {
    List<ContentDTO> getDescByAllUserMaxLike();
}
