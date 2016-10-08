package com.ffcs.mapper.menu;

import com.ffcs.common.superpage.MapperSuper;
import com.ffcs.entity.menu.Menu;
import com.ffcs.entity.menu.MenuCriteria;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("menuMapper")
public interface MenuMapper extends MapperSuper {

    List<Menu> selectByUserName(String userName);

    int countByExample(MenuCriteria example);

    int deleteByExample(MenuCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuCriteria example);

    Menu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuCriteria example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuCriteria example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}