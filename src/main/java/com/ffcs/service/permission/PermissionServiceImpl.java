package com.ffcs.service.permission;

import com.ffcs.entity.permission.Permission;
import com.ffcs.entity.permission.PermissionCriteria;
import com.ffcs.mapper.permission.PermissionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/10/04.
 */
@Service
public class PermissionServiceImpl implements  PermissionService{

    @Resource
    private PermissionMapper permissionMapper;

    public int insert(Permission permission) {
        return permissionMapper.insert(permission);
    }

    public int update(Permission permission) {
        return permissionMapper.updateByPrimaryKeySelective(permission);
    }

    public int delete(Long id) {
        return permissionMapper.deleteByPrimaryKey(id);
    }

    public int deleteByExampler(PermissionCriteria permissionCriteria) {
        return permissionMapper.deleteByExample(permissionCriteria);
    }

    public List<Permission> selectByExampler(PermissionCriteria permissionCriteria) {
        return permissionMapper.selectByExample(permissionCriteria);
    }
}
