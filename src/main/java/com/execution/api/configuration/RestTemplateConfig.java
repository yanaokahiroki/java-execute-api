package com.execution.api.configuration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplateのBean定義
 */
@Configuration
public class RestTemplateConfig {
  @Bean
  public RestTemplate restTemplate(){
    RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
    return restTemplateBuilder.build();
  }
}
