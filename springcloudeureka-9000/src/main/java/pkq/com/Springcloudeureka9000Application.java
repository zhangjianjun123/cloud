package pkq.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springcloudeureka9000Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcloudeureka9000Application.class, args);
    }

}
