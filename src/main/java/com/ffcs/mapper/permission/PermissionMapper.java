package com.ffcs.mapper.permission;

import com.ffcs.common.superpage.MapperSuper;
import com.ffcs.entity.permission.Permission;
import com.ffcs.entity.permission.PermissionCriteria;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PermissionMapper extends MapperSuper {
    int countByExample(PermissionCriteria example);

    int deleteByExample(PermissionCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByExample(PermissionCriteria example);

    Permission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionCriteria example);

    int updateByExample(@Param("record") Permission record, @Param("example") PermissionCriteria example);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}