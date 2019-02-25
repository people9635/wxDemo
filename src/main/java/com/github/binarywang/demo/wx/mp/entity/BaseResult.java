package com.github.binarywang.demo.wx.mp.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResult<T> implements Serializable {

    private String retcode;
    private String retmsg;

    public BaseResult() {

    }

    public static <T> BaseResult<T> create() {
        return new BaseResult<T>();
    }

    public static <T> BaseResult<T> create(String code, String message) {
        BaseResult<T> bizResult = create();
        bizResult.setRetcode(code);
        bizResult.setRetmsg(message);
        return bizResult;
    }
}
