package com.devkingdom.householdmedicaltrackingsystem.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Configuration for swagger.
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    /**
     * The build properties.
     */
    @Autowired
    private BuildProperties buildProperties;

    /**
     * Gets the documentation instance.
     * @return The docket instance.
     */
    @Bean
    public Docket api() {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any()).build();
    }

    /**
     * Gets the API information.
     * @return The API info.
     */
    private ApiInfo apiInfo() {

        return new ApiInfoBuilder()
                .title("")
                .description("This is the service layer for HMTS")
                .version(buildProperties.getVersion())
                .contact(new Contact("Steve Paulin", "http://github.com/devkingdom",
                        "paulin@spextreme.com"))
                .build();
    }
}
