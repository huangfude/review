package com.ffcs.service.rolePermission;

import com.ffcs.entity.role.RoleCriteria;
import com.ffcs.entity.rolePermission.RolePermission;
import com.ffcs.entity.rolePermission.RolePermissionCriteria;
import com.ffcs.mapper.rolePermission.RolePermissionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/10/04.
 */
@Service
public class RolePermissionServiceImpl implements RolePermissionService{

    @Resource
    private RolePermissionMapper rolePermissionMapper;

    public int insertRolePermission(RolePermission rolePermission) {
        return rolePermissionMapper.insert(rolePermission);
    }

    public int delete(Long id) {
        return rolePermissionMapper.deleteByPrimaryKey(id);
    }

    public int deleteByExampler(RolePermissionCriteria rolePermissionCriteria) {
        return rolePermissionMapper.deleteByExample(rolePermissionCriteria);
    }

    public List<RolePermission> selectByExampler(RolePermissionCriteria rolePermissionCriteria) {
        return rolePermissionMapper.selectByExample(rolePermissionCriteria);
    }
}
