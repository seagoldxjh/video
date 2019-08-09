/**
 * FileName: CommonTest
 * Author:   xjh
 * Date:     2019-08-07 12:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import com.xjh.video.entity.User;
import com.xjh.video.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import org.junit.Test;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xjh
 * @create 2019-08-07
 * @since 1.0.0
 */
public class CommonTest {
    @Test
    public void testGeneJWT(){
        User user = new User();
        user.setId(1);
        user.setName("xjh");
        user.setHeadImg("tx");
        String token = JwtUtils.geneJsonWebToken(user);
        System.out.println(token);
    }

    @Test
    public void testCheck(){
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ4ZGNsYXNzIiwiaWQiOjEsIm5hbWUiOiJ4amgiLCJpbWciOiJ0eCIsImlhdCI6MTU2NTE1NDExMywiZXhwIjoxNTY1NzU4OTEzfQ.e2EEHosjZ01jIenCDnuJtvJDQgujUyVSZOsQZTMkZTA";
        Claims claims = JwtUtils.checkJWT(token);
        if (claims != null) {
            String name = (String) claims.get("name");
            int id = (Integer) claims.get("id");
            String img = (String) claims.get("img");
            System.out.println(name);
            System.out.println(id);
            System.out.println(img);
            System.out.println("-----------");
        }else {
            System.out.println("非法token");
        }
    }
}