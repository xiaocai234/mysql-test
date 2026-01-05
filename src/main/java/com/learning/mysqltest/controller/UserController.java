package com.learning.mysqltest.controller;

import com.learning.mysqltest.common.Result;
import com.learning.mysqltest.domain.entity.User;
import com.learning.mysqltest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;;

    @GetMapping("/{id}")
    public Result<String> getName(@PathVariable("id") Integer id) {
        String name=userService.getNameById(id);
        return new Result<String>().setData(name);
    }

}
