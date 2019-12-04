package pkq.com.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BengConfig {

    @Bean
    @LoadBalanced //负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
