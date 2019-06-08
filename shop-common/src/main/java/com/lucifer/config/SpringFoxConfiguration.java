package com.lucifer.config;

import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.lucifer.model.AppInfo;
import com.xiaobangtouzi.insurance.common.config.Profiles;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * @Author : wangdi
 * @Date : creat in 2019/5/21 21:52
 * Swagger配置
 * 每个web端的项目都要有这个配置
 */
@Configuration
@EnableSwagger2
@Profile("!production")
public class SpringFoxConfiguration {

    @Bean
    public Docket swaggerSpringMvcPlugin(AppInfo appInfo) {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(Predicates.not(regex("/manage.*")))
                .build()
                .protocols(Sets.newHashSet("http"))
                .globalOperationParameters(
                        Lists.newArrayList(new ParameterBuilder()
                                .name("X-Request-Token")
                                .description("Token of header")
                                .modelRef(new ModelRef("string"))
                                .parameterType("header")
                                .required(false)
                                .build()))
                .apiInfo(new ApiInfoBuilder()
                        .title(appInfo.getName())
                        .description("Api Documentation")
                        .version("1.0")
                        .contact(ApiInfo.DEFAULT_CONTACT)
                        .build()
                );
    }
}
