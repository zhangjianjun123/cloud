package pkq.com.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.FacesRequestAttributes;
import pkq.com.bean.User;
import pkq.com.service.UserService;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {

        return "Hello World ";
    }
    @RequestMapping(value = "/crud", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "getError")
    public List<User> crud() {
        List<User> hello = userService.hello();
        for (User user : hello) {
            if(user.getPwd()==null || "".equals(user.getPwd())){
                throw  new RuntimeException("用户名为"+ user.getName()+"没有id");
            }
        }
        System.out.println(hello.toString());
        return hello;
    }
    public List<User> getError(){
        User us = new User();
        us.setName("当前用户没有id");
        return  Arrays.asList(us);
    }
}
