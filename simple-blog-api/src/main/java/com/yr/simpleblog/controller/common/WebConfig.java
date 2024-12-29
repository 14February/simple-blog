package com.yr.simpleblog.controller.common;

import com.yr.simpleblog.common.utils.FileUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @author yurui
 * @date 2024-12-28 00:09
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 提供Url访问文件，有以下三种方式：
        // 1. 将文件放到/src/main/resources/static/或/src/main/resources/public/目录下，访问路径为：http://localhost:8080/文件名
        //    1.1 只写相对路径，默认是/src/main/resources
        // 2. 通过控制器将Url映射到文件，访问路径为：http://localhost:8080/file/文件名
        // 3. 使用 Spring Boot 提供的 ResourceHandler 配置，来映射上传目录到 URL 路径
        // 映射上传的文件目录为 URL 路径
        // 这里访问路径必须和文件系统中的路径一样，如果需要动态查询file指定目录下的子目录，需要手写controller来处理
        registry.addResourceHandler("/uploads/**")
            .addResourceLocations("file:" + FileUtils.getFilePath() + "/");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 所有路径都支持跨域
        registry.addMapping("/**")
                // 允许来自 http://localhost:3000 的跨域请求
                .allowedOrigins("http://localhost:5173")
                // 允许的 HTTP 方法
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                // 允许所有的请求头
                .allowedHeaders("*")
                // 允许发送凭据（cookies）
                .allowCredentials(true)
                // 预检请求的缓存时间，单位秒
                .maxAge(3600);
    }
}
