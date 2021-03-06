package com.example.salesforce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Ashkan Amiri
 * Date:  2021-04-13
 * Time:  22:35
 * Project: webshop-backend
 * Copyright: MIT
 * Class that removes the need for every class to have the CrossConfig notation.
 * Makes that all websites have access to this back-end.
 */
@Configuration
public class CrossConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("GET","POST","PUT","DELETE")
                        .allowedHeaders("*")
                        .allowedOrigins("*");
            }
        };
}
}
