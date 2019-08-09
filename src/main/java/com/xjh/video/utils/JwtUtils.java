/**
 * FileName: JwtUtils
 * Author:   xjh
 * Date:     2019-08-07 12:34
 * Description: jwt加解密生成token校验类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xjh.video.utils;

import com.xjh.video.entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈jwt加解密生成token校验类〉
 *
 * @author xjh
 * @create 2019-08-07
 * @since 1.0.0
 */
public class JwtUtils {

    public static final String SUBJECT = "xdclass";
    //过期时间，毫米，1周
    public static final long EXPIRE = 1000*60*60*24*7;
    //密钥
    public static final String APPSECRET = "xjh666";

    /**
     * jwt生成token
     * @param user
     * @return token,对象不符合条件则返回null
     */
    public static String geneJsonWebToken(User user){

        if(user==null || user.getId()==null || user.getHeadImg()==null || user.getName()==null){
            return null;
        }

        String token = Jwts.builder().setSubject(SUBJECT)
                .claim("id", user.getId())
                .claim("name", user.getName())
                .claim("img", user.getHeadImg())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE))
                .signWith(SignatureAlgorithm.HS256, APPSECRET).compact();
        return token;
    }

    /**
     * 校验token
     * @return
     */
    public static Claims checkJWT(String token){
        try {
            final Claims claims = Jwts.parser().setSigningKey(APPSECRET).parseClaimsJws(token).getBody();
            return  claims;
        }catch (Exception e){
            return null;
        }
    }
}