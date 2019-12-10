package pkq.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProviderBootApplication03 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderBootApplication03.class, args);
    }

}
