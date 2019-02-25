package com.github.binarywang.demo.wx.mp.entity;

import com.github.binarywang.demo.wx.mp.ReplyEnum;

/**
 * @Description:
 * @author: shuangxi
 * @create: 2019/2/25下午5:19
 */
public enum PicArtEnum {
    S1("1","2😊");


    private String code;
    private String msg;

    PicArtEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }




    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


    public static String ContentFilter(String content) {
        for (PicArtEnum s : PicArtEnum.values()){
            if (content.contains(s.code)){
                return  s.msg;
            }
        }
        return  "";
    }

}
