package com.shopping.demo.common.config;

import com.shopping.demo.common.model.ResultData;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Log4j2
@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultData exceptionHandler(Exception e) {
        log.error("系统异常",e);
        return ResultData.fail(ResultData.ERROR_CODE, e.getMessage());
    }

}
