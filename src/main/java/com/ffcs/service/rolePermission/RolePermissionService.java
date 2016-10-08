package com.ffcs.service.rolePermission;

import com.ffcs.entity.role.RoleCriteria;
import com.ffcs.entity.rolePermission.RolePermission;
import com.ffcs.entity.rolePermission.RolePermissionCriteria;

import java.util.List;

/**
 * Created by Administrator on 2016/10/04.
 */
public interface RolePermissionService {

    int insertRolePermission(RolePermission rolePermission);

    int delete(Long id);

    int deleteByExampler(RolePermissionCriteria rolePermissionCriteria);

    List<RolePermission> selectByExampler(RolePermissionCriteria rolePermissionCriteria);
}
