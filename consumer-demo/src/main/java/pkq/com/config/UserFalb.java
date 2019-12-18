package pkq.com.config;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import pkq.com.bean.User;
import pkq.com.service.UserService;

import java.util.Arrays;
import java.util.List;
@Component
public class UserFalb implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public List<User> hello() {
                User us = new User();
                us.setName("当前用户没有id");
                return  Arrays.asList(us);
            }
        };
    }
}
