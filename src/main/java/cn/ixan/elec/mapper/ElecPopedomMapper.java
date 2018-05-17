package cn.ixan.elec.mapper;

import cn.ixan.elec.domain.ElecPopedom;
import cn.ixan.elec.domain.ElecPopedomExample;
import cn.ixan.elec.domain.ElecPopedomKey;
import cn.ixan.elec.vo.MenuVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ElecPopedomMapper {
    /**
     * 获取菜单节点树
     * @return
     */
    List<ElecPopedom> getMenuTree();
    /**
     * 获取所有结点树
     * @return
     */
    List<MenuVo> getMenus();
    int countByExample(ElecPopedomExample example);

    int deleteByExample(ElecPopedomExample example);

    int deleteByPrimaryKey(ElecPopedomKey key);

    int insert(ElecPopedom record);

    int insertSelective(ElecPopedom record);

    List<ElecPopedom> selectByExample(ElecPopedomExample example);

    ElecPopedom selectByPrimaryKey(ElecPopedomKey key);

    int updateByExampleSelective(@Param("record") ElecPopedom record, @Param("example") ElecPopedomExample example);

    int updateByExample(@Param("record") ElecPopedom record, @Param("example") ElecPopedomExample example);

    int updateByPrimaryKeySelective(ElecPopedom record);

    int updateByPrimaryKey(ElecPopedom record);

}