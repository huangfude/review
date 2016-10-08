package com.ffcs.service.user;

import com.ffcs.entity.user.User;
import com.ffcs.entity.user.UserCriteria;

import java.util.List;

/**
 * 用户业务接口
 */
public interface UserService {

    List<User> selectByExample(UserCriteria userCriteria);

    int insert(User user);

    int update(User user);

    String selectRoleByUserName(String userName);

    List<String> selectPermissionByUserName(String userName);
}
