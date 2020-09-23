package com.zoomride.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${swagger2.enable}")
    private boolean enable;

    @Bean
    public Docket createRestApi(){

        /**
         *  Inorder to use JWT as credentials for all request
         */

        List<Parameter> pars = new ArrayList<Parameter>();
        ParameterBuilder accessToken = new ParameterBuilder();
        ParameterBuilder refreshToken = new ParameterBuilder();

        accessToken.name("accessToken").description("accessToken for testing use").modelRef(new ModelRef("string")).parameterType("header").required(false);
        refreshToken.name("refreshToken").description("refreshToken for testing use").modelRef(new ModelRef("string")).parameterType("header").required(false);

        pars.add(accessToken.build());
        pars.add(refreshToken.build());




        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zoomride.controller"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(pars)
                .enable(enable);

    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("zoom ride elite tour back end")
                .description("elite-tour admin user only")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }

}
