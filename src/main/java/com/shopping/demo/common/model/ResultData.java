package com.shopping.demo.common.model;

import lombok.Data;

@Data
public class ResultData<T> {

    public static final int SUCCESS_CODE = 200;
    public static final String SUCCESS_MSG = "请求成功";
    public static final int ERROR_CODE = 500;

    private T data;
    private String message;
    private int status;

    public static <T> ResultData<T> success(T data) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setStatus(SUCCESS_CODE);
        resultData.setMessage(SUCCESS_MSG);
        resultData.setData(data);
        return resultData;
    }

    public static <T> ResultData<T> fail(int code, String message) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setStatus(code);
        resultData.setMessage(message);
        return resultData;
    }

}
