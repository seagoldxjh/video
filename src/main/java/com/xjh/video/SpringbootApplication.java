/**
 * FileName: SpringbootApplication
 * Author:   xjh
 * Date:     2019-08-06 17:03
 * Description: 启动类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xjh.video;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 〈一句话功能简述〉<br> 
 * 〈启动类〉
 *
 * @author xjh
 * @create 2019-08-06
 * @since 1.0.0
 */
@SpringBootApplication
@MapperScan(value = "com.xjh.video.mapper",basePackages = "com.xjh.video.mapper")
//@EnableTransactionManagement
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class,args);
    }
}