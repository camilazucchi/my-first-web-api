package com.zucchicamila.myfirstwebapi.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class SwaggerConfig implements WebMvcConfigurer {

    @Value("${springdoc.swagger-ui.title}")
    private String swaggerUiTitle;

    @Value("${springdoc.swagger-ui.description}")
    private String swaggerUiDescription;

    @Value("${springdoc.version}")
    private String version;

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

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title(swaggerUiTitle)
                        .description(swaggerUiDescription)
                        .version(version));
    }

}
