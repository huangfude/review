package com.ffcs.controller;

import com.ffcs.common.enums.StatusEnum;
import com.ffcs.common.util.ViewResult;
import com.ffcs.entity.role.Role;
import com.ffcs.entity.role.RoleCriteria;
import com.ffcs.service.role.RoleService;
//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/10/01.
 */
@Controller
public class RoleController {

    @Resource
    private RoleService roleService;

    @RequestMapping("role")
//    @RequiresPermissions("visit:role")
    public String toRole(){
        return "role";
    }

    @RequestMapping("selectRole")
    @ResponseBody
    public String selectRole(){
        List<Role> list = roleService.selectExample(new RoleCriteria());
        return ViewResult.newInstance().rows(list).json();
    }

    @RequestMapping("insertRole")
    @ResponseBody
    public String insertRole(Role role){
        role.setStatus(StatusEnum.ENABLE);
        roleService.addRole(role);
        return ViewResult.newInstance().json();
    }

    @RequestMapping("updateRole")
    @ResponseBody
    public String updateRole(Role role){
        roleService.updateRole(role);
        return ViewResult.newInstance().json();
    }

    @RequestMapping("deleteRole")
    @ResponseBody
    public String deleteRole(Long id){
        roleService.delete(id);
        return ViewResult.newInstance().json();
    }
}
