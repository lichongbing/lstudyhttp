package com.lichongbing.lstudyhttp.config;
import com.lichongbing.lswagger.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author lichongbing
 * @version V1.0
 * @desc swagger3配置类
 * @copyright &copy; DYH
 * @date 2021-09-13-21:00
 * @address 成都
 */
@Configuration
@EnableOpenApi // 开始swagger
@EnableKnife4j // 开启knife4j
public class Swagger3Config {
    @Bean
    public Docket systemDocket() {
        return new Docket(DocumentationType.OAS_30)
                .groupName("系统管理")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.huaxiaozhuo.admin.modules.sys.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket monitorDocket() {
        return new Docket(DocumentationType.OAS_30)
                .groupName("系统监控")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.huaxiaozhuo.admin.modules.monitor.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("第三方接口管理系统swagger文档")
                .description("李崇兵swagger文档")
                .version("1.0.0")
                .contact(new Contact("GITEE", "https://gitee.com/lichongbing", "873610008@qq.com"))
                .termsOfServiceUrl("https://blog.csdn.net/weixin_45481406")
                .build();
    }
}
