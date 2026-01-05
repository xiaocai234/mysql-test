package com.learning.mysqltest.common;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.http.HttpStatus;

@Data
@Accessors(chain = true)
public class Result<T> {
    Integer code;
    String msg;
    T data;
    public Result() {
    }
    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public static <T> Result<T> ok(T data){
        Result<T> result = new Result<>();
result.setCode(HttpStatus.OK.value())
        .setData(data);
        return result;
    }
}
