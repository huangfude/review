package com.ffcs.service.roleMenu;

import com.ffcs.entity.roleMenu.RoleMenu;
import com.ffcs.entity.roleMenu.RoleMenuCriteria;
import com.ffcs.entity.rolePermission.RolePermissionCriteria;
import com.ffcs.mapper.roleMenu.RoleMenuMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/10/04.
 */
@Service
public class RoleMenuServiceImpl implements RoleMenuService{

    @Resource
    private RoleMenuMapper roleMenuMapper;

    public int insert(RoleMenu roleMenu) {
        return roleMenuMapper.insert(roleMenu);
    }

    public int delete(Long id) {
        return roleMenuMapper.deleteByPrimaryKey(id);
    }

    public int deleteByExampler(RoleMenuCriteria roleMenuCriteria) {
        return roleMenuMapper.deleteByExample(roleMenuCriteria);
    }

    public List<RoleMenu> selectByExample(RoleMenuCriteria roleMenuCriteria) {
        return roleMenuMapper.selectByExample(roleMenuCriteria);
    }
}
