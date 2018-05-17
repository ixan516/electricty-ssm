package cn.ixan.elec.service;

import cn.ixan.elec.domain.ElecPopedom;
import cn.ixan.elec.vo.MenuVo;
import cn.ixan.elec.vo.ResultBean;

import java.util.List;

public interface ElecPopedomService {
    /**
     * 添加节点树
     * @param elecPopedom
     * @return
     */
    Boolean addMenuTree(ElecPopedom elecPopedom);
    /**
     * 批量插入节点树
     * @return
     * @param menus
     */
    Boolean addMenus(List<ElecPopedom> menus);
    /**
     * 获取菜单节点
     * @return
     */
    List<ElecPopedom> getMenuTree();
    /**
     * 获取所有菜单(分页)
     * @return
     * @param page
     * @param rows
     */
    ResultBean<MenuVo> getMenus(Integer page, Integer rows);

}
