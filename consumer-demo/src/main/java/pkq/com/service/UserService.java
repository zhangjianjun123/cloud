package pkq.com.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pkq.com.bean.User;

import java.util.List;

@FeignClient(value = "PROVIDERBOOT")
public interface UserService {
    @RequestMapping(value = "/crud", method = RequestMethod.GET)
    public List<User> hello();
}
