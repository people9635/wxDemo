package com.github.binarywang.demo.wx.mp.utils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.github.binarywang.demo.wx.mp.entity.TulingEntity;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Description:
 * @author: shuangxi
 * @create: 2019/2/25下午1:56
 */
@Component
@Data
public class RobetUtil {

    private String apiKey = "c8e4bb39062f4593aeb9796023f6f1f8";
    private String apiUrl = "http://openapi.tuling123.com/openapi/api/v2";

    private static RobetUtil robetUtil;

    public static  RobetUtil getRobet() {
        if (robetUtil == null){
            robetUtil = new RobetUtil();
        }
        return robetUtil;
    }

    public String replyContent(String content) {
        TulingEntity tulingEntity = new TulingEntity();
        tulingEntity.setReqType(0);
        tulingEntity.createUserInfo(apiKey,"123");
        tulingEntity.createPerception(content,null);
        String jsonString  = JSONObject.toJSONString(tulingEntity, SerializerFeature.WriteNullStringAsEmpty, SerializerFeature.WriteNullBooleanAsFalse);
        try {
            String result = HttpUtil.post("http://openapi.tuling123.com/openapi/api/v2",jsonString);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return jsonString;
    }
}
