package pkq.com.mapper;

import org.apache.ibatis.annotations.Mapper;
import pkq.com.bean.User;

import java.util.List;
@Mapper
public interface UserMapper {

    public List<User> hello();
}