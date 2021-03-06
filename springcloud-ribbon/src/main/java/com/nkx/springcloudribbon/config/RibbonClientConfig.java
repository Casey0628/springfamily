package com.nkx.springcloudribbon.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonClientConfig {

  @Bean
  @LoadBalanced
  public RestTemplate restTemplat(){
    return new RestTemplate();
  }

  @Bean
  public IRule iRule(){
    return new RandomRule();
  }
}
