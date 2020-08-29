package com.demo.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
            /*
             * addMapping : 配置可以跨域的路径，可以任意配置，可以具体到请求路径
             * allowedMethods：允许请求的方式
             *    get： 向服务器提交数据，请求在地址栏中
             *    post：向服务器提交数据
             *    put：发送修改数据的请求，需要数据全部更新
             *    patch：发送修改数据的请求，需要数据部分更新
             *    delete：发送删除数据的请求
             * allowedOrigins：允许访问的url，可以固定单条或者多条内容
             * allowedHeaders:允许请求的header，可以定义设置任意请求头信息
             * maxAge：配置预检请求的有效时间
             *
             * */
            registry.addMapping("/**")
                    .allowedOrigins("*")
                    .allowedMethods("PUT", "POST", "GET", "DELETE", "OPTIONS")
                    .allowedHeaders("*")
                    .allowCredentials(true)
                    .maxAge(3600);
    }
}
