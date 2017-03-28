package up_vams.user.service.impl;

import com.up_vams.user.dao.UserMapper;
import com.up_vams.user.entity.User;
import com.up_vams.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 隽 on 2017/3/28.
 */
@Service("userService")
public class UserServiceImpl implements UserService
{

    @Resource
    private UserMapper userMapper;

    @Override
    public String findUserById(String id)
    {
        String str=userMapper.findByPrimaryKey();
        System.out.println(str);
        return str;
    }

}
