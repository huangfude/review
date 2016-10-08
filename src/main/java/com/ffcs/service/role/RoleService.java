package com.ffcs.service.role;

import com.ffcs.entity.role.Role;
import com.ffcs.entity.role.RoleCriteria;

import java.util.List;

/**
 * Created by Administrator on 2016/10/04.
 */
public interface RoleService {

    int addRole(Role role);

    int updateRole(Role role);

    int delete(Long id);

    List<Role> selectExample(RoleCriteria roleCriteria);
}
