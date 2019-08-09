/**
 * FileName: WeChatConfig
 * Author:   xjh
 * Date:     2019-08-06 17:53
 * Description: 微信配置类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xjh.video.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br> 
 * 〈微信配置类〉
 *
 * @author xjh
 * @create 2019-08-06
 * @since 1.0.0
 */
@Configuration
/**
 * 默认加载classpath:application.properties,也可以手动指定配置文件路径
 * @PropertySource(value = "classpath:application.properties")
 */
public class WeChatConfig {


    //公众号appid
    @Value("${wxpay.appid}")
    private String appId;

    //公众号密钥
    @Value("${wxpay.appsecret}")
    private String appsecret;

    /**
     * 开放平台appid
     */
    @Value("${wxopen.appid}")
    private String openAppid;

    /**
     * 开放平台appsecret
     */
    @Value("${wxopen.appsecret}")
    private String openAppsecret;


    /**
     * 开放平台回调url
     */
    @Value("${wxopen.redirect_url}")
    private String openRedirectUrl;

    /**
     * 微信开放平台二维码连接
     */
    private final static String OPEN_QRCODE_URL= "https://open.weixin.qq.com/connect/qrconnect?appid=%s&redirect_uri=%s&response_type=code&scope=snsapi_login&state=%s#wechat_redirect";

    public static String getOpenQrcodeUrl() {
        return OPEN_QRCODE_URL;
    }

    public String getOpenAppid() {
        return openAppid;
    }

    public void setOpenAppid(String openAppid) {
        this.openAppid = openAppid;
    }

    public String getOpenAppsecret() {
        return openAppsecret;
    }

    public void setOpenAppsecret(String openAppsecret) {
        this.openAppsecret = openAppsecret;
    }

    public String getOpenRedirectUrl() {
        return openRedirectUrl;
    }

    public void setOpenRedirectUrl(String openRedirectUrl) {
        this.openRedirectUrl = openRedirectUrl;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }

}