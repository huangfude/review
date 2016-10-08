package com.ffcs.service.menu;

import com.ffcs.entity.menu.Menu;
import com.ffcs.entity.menu.MenuCriteria;
import com.ffcs.mapper.menu.MenuMapper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 菜单业务实现类.
 */
@Service
public class MenuServiceImpl  implements  MenuService{

    @Resource
    private MenuMapper menuMapper;

    public int addRootMenu(Menu menu) {
        return menuMapper.insert(menu);
    }

    public int updateMenu(Menu menu) {
        return menuMapper.updateByPrimaryKeySelective(menu);
    }

    public int deleteMenu(Long id) {
        return menuMapper.deleteByPrimaryKey(id);
    }

    public List<Menu> selectByExample(MenuCriteria menuCriteria) {
        return menuMapper.selectByExample(menuCriteria);
    }
    @Cacheable(value="common",key="'userName_'+#userName")
    public List<Menu> selectByUserName(String userName) {
        return menuMapper.selectByUserName(userName);
    }
}
