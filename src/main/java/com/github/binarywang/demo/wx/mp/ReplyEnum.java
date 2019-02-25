package com.github.binarywang.demo.wx.mp;

/**
 * @Description:
 * @author: shuangxi
 * @create: 2019/2/25下午4:17
 */
public enum ReplyEnum {
    S1("徐佳炜","是个大傻蛋😊"),
    S2("高洁茹","是个小可爱🌹"),
    S3("老徐","老徐是我的主人,他长得很帅(被胁迫中...)"),
    S4("老高","光听到这名字 ,就知道老高是个大美人了,🌹"),
    S5("在吗","在你麻痹,起来嗨"),
    S6("卧槽","卧槽焉知好🐴"),
    S7("我操","LOL"),
    S8("我草","我爱吃草皮肤好好"),
    S9("徐佳炜的","我不知道");


    private String code;
    private String msg;

    ReplyEnum(String code, String msg) {
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
        for (ReplyEnum s : ReplyEnum.values()){
            if (content.contains(s.code)){
                return  s.msg;
            }
        }
        return  "";
    }



}
