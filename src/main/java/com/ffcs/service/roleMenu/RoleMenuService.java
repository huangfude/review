package com.ffcs.service.roleMenu;

import com.ffcs.entity.roleMenu.RoleMenu;
import com.ffcs.entity.roleMenu.RoleMenuCriteria;
import com.ffcs.entity.rolePermission.RolePermissionCriteria;

import java.util.List;

/**
 * Created by Administrator on 2016/10/04.
 */
public interface RoleMenuService {

    int insert(RoleMenu roleMenu);

    int delete(Long id);

    int deleteByExampler(RoleMenuCriteria roleMenuCriteria);

    List<RoleMenu> selectByExample(RoleMenuCriteria roleMenuCriteria);
}
