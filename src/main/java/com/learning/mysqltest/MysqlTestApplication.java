package com.learning.mysqltest;

import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@MapperScan("com.learning.mysqltest.mapper")
@SpringBootApplication
public class MysqlTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqlTestApplication.class, args);
    }


}
