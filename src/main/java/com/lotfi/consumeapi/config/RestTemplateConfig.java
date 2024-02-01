package com.lotfi.consumeapi.config;

import com.lotfi.consumeapi.exception.CustomErrorHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;


@Configuration
@PropertySource("classpath:application.properties")
public class RestTemplateConfig {

    @Value("${gbfs.baseurl.api}")
    private String url;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
       return builder
               .rootUri(url)
               .errorHandler(new CustomErrorHandler())
               .build();
    }
}
