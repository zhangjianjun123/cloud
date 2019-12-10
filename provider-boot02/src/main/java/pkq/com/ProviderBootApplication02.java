package pkq.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProviderBootApplication02 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderBootApplication02.class, args);
    }

}
