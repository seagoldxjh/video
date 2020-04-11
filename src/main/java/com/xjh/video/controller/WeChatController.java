/**
 * FileName: WeChatController
 * Author:   xjh
 * Date:     2019-08-07 13:45
 * Description: 微信
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xjh.video.controller;

import com.xjh.video.config.WeChatConfig;
import com.xjh.video.entity.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 〈一句话功能简述〉<br> 
 * 〈微信〉
 *
 * @author xjh
 * @create 2019-08-07
 * @since 1.0.0
 */

@Controller
@RequestMapping("/api/v1/wechat")
public class WeChatController {
    @Autowired
    private WeChatConfig weChatConfig;

    /**
     * 拼装微信扫一扫登录url
     * @return
     */
    @GetMapping("login_url")
    @ResponseBody
    public JsonData loginUrl(@RequestParam(value = "access_page",required = true)String accessPage)
            throws UnsupportedEncodingException {

        String redirectUrl = weChatConfig.getOpenRedirectUrl(); //获取开放平台重定向地址

        String callbackUrl = URLEncoder.encode(redirectUrl,"GBK"); //进行编码

        String qrcodeUrl = String.format(WeChatConfig.getOpenQrcodeUrl(),weChatConfig.getOpenAppid(),callbackUrl,accessPage);

        return JsonData.buildSuccess(qrcodeUrl);
    }
    /**
     * 微信扫码登录，回调地址
     * @param code
     * @param state
     * @param response
     * @throws IOException
     */
    @GetMapping("/user/callback")
    public void wechatUserCallback(@RequestParam(value = "code",required = true) String code,
                                   String state, HttpServletResponse response) throws IOException {

//
//        User user = userService.saveWeChatUser(code);
//        if(user != null){
//            //生成jwt
//            String token = JwtUtils.geneJsonWebToken(user);
//            // state 当前用户的页面地址，需要拼接 http://  这样才不会站内跳转
//
//            response.sendRedirect(state+"?token="+token+"&head_img="+user.getHeadImg()+"&name="+URLEncoder.encode(user.getName(),"UTF-8"));
        }



}