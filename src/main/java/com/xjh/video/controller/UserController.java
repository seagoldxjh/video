/**
 * FileName: UserController
 * Author:   xjh
 * Date:     2019-08-06 17:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xjh.video.controller;

import com.xjh.video.config.WeChatConfig;
import com.xjh.video.entity.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xjh
 * @create 2019-08-06
 * @since 1.0.0
 */
@Controller
public class UserController {

    @Autowired
    WeChatConfig weChatConfig;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello!";
    }

    @RequestMapping("/config")
    @ResponseBody
    public JsonData config(){
        return JsonData.buildSuccess(weChatConfig.getAppId()+weChatConfig.getAppsecret());
    }



}