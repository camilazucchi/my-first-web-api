package com.zucchicamila.myfirstwebapi.doc;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class SwaggerConfig implements WebMvcConfigurer {

    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("my-api")
                .packagesToScan("com.zucchicamila.myfirstwebapi.controller")
                .build();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/swagger-ui/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/springdoc-openapi-ui/")
                .resourceChain(false);
    }

}
