package com.ffcs.service.permission;

import com.ffcs.entity.permission.Permission;
import com.ffcs.entity.permission.PermissionCriteria;

import java.util.List;

/**
 * Created by Administrator on 2016/10/04.
 */
public interface PermissionService {

    int insert(Permission permission);

    int update(Permission permission);

    int delete(Long id);

    int deleteByExampler(PermissionCriteria permissionCriteria);

    List<Permission> selectByExampler(PermissionCriteria permissionCriteria);
}
