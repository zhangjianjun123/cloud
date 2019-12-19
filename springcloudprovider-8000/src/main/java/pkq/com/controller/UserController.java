package pkq.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pkq.com.bean.User;
import pkq.com.service.UserService;

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
    public List<User> crud() {
        List<User> hello = userService.hello();
        System.out.println(hello.toString());
        return hello;
    }
}
