package cn.nchfly.swagger2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * @Author xtq
 * @Date 2020/5/4 21:30
 * @Description
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Spring Boot 项目集成 Swagger2 实例文档",
                "我的网站：http://nchfly.cn ，欢迎大家访问。",
                "API V1.0",
                "微信公众【Java程序员技术栈】",
                new Contact("一支程序猿", "http://nchfly.cn", "xtq1917@foxmail.com"),
                "联系xtq", "tencent://message/?uin=906404488&Site=admin5.com&Menu=ye", Collections.emptyList());
    }
}
