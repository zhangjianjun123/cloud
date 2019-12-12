package pkq.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pkq.com.bean.User;
import pkq.com.service.UserService;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/crud", method = RequestMethod.GET)
    public List<User> getUser() {
        List<User> aBoolean = userService.hello();
        return aBoolean;
    }

}
