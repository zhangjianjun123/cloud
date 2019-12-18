package pkq.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import pkq.RibbonMy.Config;

@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name = "PROVIDERBOOT", configuration = Config.class)
public class ConsumerDemoApplication01 {
    /* @Bean
     @LoadBalanced
         //负载均衡
     RestTemplate restTemplate(){
         return new RestTemplate();
     }*/
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDemoApplication01.class, args);
    }

}
