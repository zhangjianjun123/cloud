package pkq.com.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BengConfig {
    //默认轮训
    @Bean
    @LoadBalanced //负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    /*//随机
    @Bean
    public IRule myIRule(){

        return new RandomRule();
    }*/
   /*
   //当遇到提供者不能正常访问的时候尝试几次之后就不会调用
   @Bean
    public IRule myIRule() {

        return new RetryRule();
    }*/
   /* @Bean
    public IRule myIRule() {

        return new RetryRule();
    }*/
}
