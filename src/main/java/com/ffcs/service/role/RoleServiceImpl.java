package com.ffcs.service.role;

import com.ffcs.entity.role.Role;
import com.ffcs.entity.role.RoleCriteria;
import com.ffcs.mapper.role.RoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/10/04.
 */
@Service
public class RoleServiceImpl implements RoleService{

    @Resource
    private RoleMapper roleMapper;

    public int addRole(Role role) {
        return roleMapper.insert(role);
    }

    public int updateRole(Role role) {
        return roleMapper.updateByPrimaryKeySelective(role);
    }

    public int delete(Long id) {
        return roleMapper.deleteByPrimaryKey(id);
    }

    public List<Role> selectExample(RoleCriteria roleCriteria) {
        return roleMapper.selectByExample(roleCriteria);
    }
}
