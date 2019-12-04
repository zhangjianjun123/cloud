package pkq.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Register03Application {

    public static void main(String[] args) {
        SpringApplication.run(Register03Application.class, args);
    }

}
