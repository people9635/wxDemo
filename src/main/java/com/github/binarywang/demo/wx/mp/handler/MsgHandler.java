package com.github.binarywang.demo.wx.mp.handler;

import com.github.binarywang.demo.wx.mp.ReplyEnum;
import com.github.binarywang.demo.wx.mp.builder.TextBuilder;
import com.github.binarywang.demo.wx.mp.utils.JsonUtils;
import com.github.binarywang.demo.wx.mp.utils.RobetUtil;
import com.github.binarywang.demo.wx.mp.utils.TulingRobot;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Map;

import static me.chanjar.weixin.common.api.WxConsts.XmlMsgType;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
@Component
public class MsgHandler extends AbstractHandler {

    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage,
                                    Map<String, Object> context, WxMpService weixinService,
                                    WxSessionManager sessionManager) {

        if (!wxMessage.getMsgType().equals(XmlMsgType.EVENT)) {
            //TODO 可以选择将消息保存到本地
        }

        //文本内容回复
        String respContent = "";
        respContent = ReplyEnum.ContentFilter(wxMessage.getContent());

        if (StringUtils.isNotEmpty(respContent)){}
        else if (wxMessage.getMsgType().equals("text")){
            respContent = TulingRobot.instance().chat(wxMessage.getFromUser(), wxMessage.getContent());
        }
        //其余内容回复
        else{
            respContent = "图片已接收,正在识别中";
        }
        return new TextBuilder().build(respContent, wxMessage, weixinService);

    }

}
