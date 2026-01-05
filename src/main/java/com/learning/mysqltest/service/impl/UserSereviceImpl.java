package com.learning.mysqltest.service.impl;

import com.learning.mysqltest.mapper.UserMapper;
import com.learning.mysqltest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSereviceImpl implements UserService {
@Autowired
private UserMapper userMapper;

    @Override
    public String getNameById(Integer id) {
        return userMapper.getNameById(id);
    }
}
