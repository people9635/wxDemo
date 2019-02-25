package com.github.binarywang.demo.wx.mp.controller;

import com.github.binarywang.demo.wx.mp.config.WxMpConfiguration;
import com.github.binarywang.demo.wx.mp.entity.BaseResult;
import me.chanjar.weixin.common.bean.menu.WxMenu;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @author: shuangxi
 * @create: 2019/2/25上午10:14
 */
@RestController
public class NormalController {
    /**
     * 测试接口
     */
    @GetMapping("/testIml")
    public BaseResult<String> testIml() throws WxErrorException {

        return  BaseResult.create("123","321");
    }

}
