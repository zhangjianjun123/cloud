package pkq.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import pkq.RibbonMy.Config;

@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name = "PROVIDERBOOT",configuration = Config.class)
public class ConsumerDemoApplication {
   /* @Bean
    @LoadBalanced
        //负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }*/
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDemoApplication.class, args);
    }

}
