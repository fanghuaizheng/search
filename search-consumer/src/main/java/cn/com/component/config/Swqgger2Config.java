package cn.com.component.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Created by hzfang on 2018/1/31.
 */
@Configuration
public class Swqgger2Config {

    @Bean
    public Docket createRestAPI(){
        return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select().apis(RequestHandlerSelectors.basePackage("cn.com.component.controller"))
                    .paths(PathSelectors.any())
                    .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("消费者的接口文件")
                .description("接口描述")
                .termsOfServiceUrl("http://blog.csdn.net/saytime")
                .contact(new Contact("方怀正","","fang101056@outlook.com"))
                .version("1.0")
                .build();
    }

}
