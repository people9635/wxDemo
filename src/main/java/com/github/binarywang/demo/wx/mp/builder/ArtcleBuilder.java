package com.github.binarywang.demo.wx.mp.builder;

import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutNewsMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutTextMessage;

/**
 * @Description:
 * @author: shuangxi
 * @create: 2019/2/25下午5:32
 */
public class ArtcleBuilder extends AbstractBuilder {

    @Override
    public WxMpXmlOutMessage build(String content, WxMpXmlMessage wxMessage,
                                   WxMpService service) {
        WxMpXmlOutNewsMessage.Item item1 = new WxMpXmlOutNewsMessage.Item();
        item1.setTitle("旅游文化: 那里旅游风景最好? 中国有哪些风景好的旅游胜地?");
        item1.setDescription("九华山（Jiuhua Mountain），古称陵阳山、九子山，为“中国佛教四大名山”之一，位于安徽省池州市青阳县境内，素有“东南第一山”之称，传说因唐朝李白《望九华赠青阳韦仲堪》诗：“昔在九江上，遥望九华峰。天河挂绿水，秀出九芙蓉。”而更名为“九华山”。");
        item1.setPicUrl("https://image.uc.cn/o/wemedia/s/upload/2018/de74fa6cfd8cf14870edb9220f87f159x543x381x36.jpeg;,4,jpegx;3,700x.jpg");
        item1.setUrl("https://mparticle.uc.cn/article.html?uc_param_str=frdnsnpfvecpntnwprdssskt&btifl=100&app=smds-iflow&title_type=1&wm_id=a2961add6d3444a3b4bd02fbaa4b1948&wm_cid=221749728189877248&pagetype=share&client=&uc_share_depth=1");

        WxMpXmlOutNewsMessage.Item item2 = new WxMpXmlOutNewsMessage.Item();
        item2.setTitle("娱乐圈的消息为啥被叫做八卦消息？");
        item2.setDescription("曾几何时，诸位看官是否想过这个问题，整天大家七嘴八舌讨论的娱乐圈头条，为什么被称为八卦消息？它怎么就不叫“易筋经”消息，“易经”消息，“四书五经”消息呢？（请原谅小编的脑洞太大，我控制不住我“寄几个儿”啊）");
        item2.setPicUrl("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=2503278411,2775033769&fm=173&s=CDE5BF46CA913DE91A8F477E0300F07F&w=538&h=424&img.JPEG");
        item2.setUrl("https://baijiahao.baidu.com/s?id=1581444487434558864");

        WxMpXmlOutNewsMessage.Item item3 = new WxMpXmlOutNewsMessage.Item();
        item3.setTitle("《小女花不弃》林依晨演少女可爱，《独孤皇后》陈乔恩扮嫩遭嫌弃");
        item3.setDescription("虽然陈乔恩林依晨两位女星没合作过，现实中也没什么交集，但总感觉两人有些相似处，仔细分析，好像确实有。比如两人都是台湾女星，年龄差距也不大，感觉都是差不多时候出道影视圈走红，而且还一直当红，又都是不容易显老的娃娃脸，所以给人印象比较好也比较深刻。");
        item3.setPicUrl("https://image.uc.cn/o/wemedia/s/upload/2019/3cde4ce305650be3732d39e5d3920577.jpg;,4,jpegx;3,700x.jpg");
        item3.setUrl("https://mparticle.uc.cn/article.html?uc_param_str=frdnsnpfvecpntnwprdssskt&btifl=100&app=smds-iflow&title_type=1&wm_id=27bd6e1ee96c4d8c9d529d11b585cc39&wm_cid=274811142024200192&pagetype=share&client=&uc_share_depth=1");
        WxMpXmlOutNewsMessage m = WxMpXmlOutMessage.NEWS().addArticle(item1,item2,item3)
                .fromUser(wxMessage.getToUser()).toUser(wxMessage.getFromUser())
                .build();
        return m;
    }
}
