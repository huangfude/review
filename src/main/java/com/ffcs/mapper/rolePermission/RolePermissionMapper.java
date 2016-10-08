package com.ffcs.mapper.rolePermission;

import com.ffcs.common.superpage.MapperSuper;
import com.ffcs.entity.rolePermission.RolePermission;
import com.ffcs.entity.rolePermission.RolePermissionCriteria;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RolePermissionMapper extends MapperSuper {
    int countByExample(RolePermissionCriteria example);

    int deleteByExample(RolePermissionCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    List<RolePermission> selectByExample(RolePermissionCriteria example);

    RolePermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RolePermission record, @Param("example") RolePermissionCriteria example);

    int updateByExample(@Param("record") RolePermission record, @Param("example") RolePermissionCriteria example);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}