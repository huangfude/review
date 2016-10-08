package com.ffcs.service.user;

import com.ffcs.entity.user.User;
import com.ffcs.entity.user.UserCriteria;
import com.ffcs.mapper.user.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户业务实现类
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    public List<User> selectByExample(UserCriteria userCriteria) {
        return userMapper.selectByExample(userCriteria);
    }
    public int insert(User user) {
        return userMapper.insert(user);
    }

    public int update(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    public String selectRoleByUserName(String userName) {
        return userMapper.selectRoleByUserName(userName);
    }

    public List<String> selectPermissionByUserName(String userName) {
        return userMapper.selectPermissionByUserName(userName);
    }
}
