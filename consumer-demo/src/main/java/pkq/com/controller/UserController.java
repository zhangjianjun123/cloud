package pkq.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pkq.com.bean.User;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@RestController
public class UserController {



    @GetMapping("/user")
    public List<User> getUser(){
        List<User> aBoolean = template.getForObject(URL_Rest+"/crud", List.class);
        return aBoolean;
    }

}
