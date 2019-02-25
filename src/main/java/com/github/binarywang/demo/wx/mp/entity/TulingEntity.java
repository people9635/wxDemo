package com.github.binarywang.demo.wx.mp.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: shuangxi
 * @create: 2019/2/25下午2:31
 */
@Data
public class TulingEntity {
    /**
     * 消息类型
     */
    Integer reqType;
    /**
     * 输入信息
     */
    Perception perception;
    /**
     * 用户信息
     */
    UserInfo userInfo;

    public void createPerception(String inputText,String inputImage){
        Map mapinputText = new HashMap();
        mapinputText.put("text",inputText);
        Map mapinputImage = new HashMap();
        mapinputImage.put("url",inputImage);
        Perception perception = new Perception();
        perception.setInputImage(mapinputImage);
        perception.setInputText(mapinputText);
        this.perception = perception;
    }
    public void createUserInfo(String apiKey,String userId){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userId);
        userInfo.setApiKey(apiKey);
        this.userInfo = userInfo;
    }
}

@Data
class UserInfo{
    String apiKey;

    String userId;
}

@Data
class Perception{
    Map inputText;

    Map inputImage;

    Map selfInfo;
}


