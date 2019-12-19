package pkq.com.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pkq.com.bean.User;
import pkq.com.mapper.UserMapper;
import pkq.com.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> hello() {
        String s = userMapper.toString();
        System.out.println(s);
        System.out.println(userMapper);
        return userMapper.hello();
    }
}
