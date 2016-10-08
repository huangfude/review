package com.ffcs.service.menu;

import com.ffcs.entity.menu.Menu;
import com.ffcs.entity.menu.MenuCriteria;

import java.util.List;

/**
 * 菜单业务接口
 */
public interface MenuService {

    int addRootMenu(Menu menu);

    int updateMenu(Menu menu);

    int deleteMenu(Long id);

    List<Menu> selectByExample(MenuCriteria menuCriteria);

    List<Menu> selectByUserName(String userName);

}
