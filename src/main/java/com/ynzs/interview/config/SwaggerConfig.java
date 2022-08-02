package com.ynzs.interview.config;


import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author myk
 * @create 2022-07-14 16:55
 * 整合swagger进行接口测试
 */

@Configuration //配置类
@EnableSwagger2 //swagger整合的注解
public class SwaggerConfig {

    @Bean
    public Docket webApiConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webApi")
                .apiInfo(webApiInfo())
                .select()
                .paths(Predicates.not(PathSelectors.regex("/admin/.*")))
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build();
    }


    private ApiInfo webApiInfo(){
        return new ApiInfoBuilder()
                .title("网站-面试中心API文档")
                .description("本文档描述了面试评分系统接口定义")
                .version("1.0")
                .contact(new Contact("interview", "http://atguigu.com",
                        "18147@qq.com"))
                .build();
    }
}
