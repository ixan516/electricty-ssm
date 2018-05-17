package cn.ixan.elec.service.impl;

import cn.ixan.elec.domain.ElecPopedom;
import cn.ixan.elec.mapper.ElecPopedomMapper;
import cn.ixan.elec.service.ElecPopedomService;
import cn.ixan.elec.utils.UUIDUtils;
import cn.ixan.elec.vo.MenuVo;
import cn.ixan.elec.vo.ResultBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class ElecPopedomServiceImpl implements ElecPopedomService {

    @Autowired
    private ElecPopedomMapper elecPopedomMapper;

    /**
     * 添加节点数
     * @param elecPopedom
     * @return
     */
    @Override
    public Boolean addMenuTree(ElecPopedom elecPopedom) {
        // 判断用户是否选择父节点
        if(StringUtils.isBlank(elecPopedom.getpId())){
            elecPopedom.setIsParent(true);
            elecPopedom.setId(UUIDUtils.getUUID());
        }else{
            elecPopedom.setIsParent(false);
            elecPopedom.setId(UUIDUtils.getUUID());
        }
        int result = elecPopedomMapper.insertSelective(elecPopedom);
        return result == 1;
    }

    /**
     * 批量插入
     * @return
     * @param menus
     */
    @Override
    @Transactional(readOnly = false)
    public Boolean addMenus(List<ElecPopedom> menus) {
        try {
            menus.stream().forEach(elecPopedom -> {
                elecPopedomMapper.insertSelective(elecPopedom);
            });
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 获取菜单节点树
     * @return
     */
    @Override
    public List<ElecPopedom> getMenuTree() {
        return elecPopedomMapper.getMenuTree();
    }

    /**
     * 获取所有菜单
     * @return
     * @param page
     * @param rows
     */
    @Override
    public ResultBean<MenuVo> getMenus(Integer page, Integer rows) {
        ResultBean<MenuVo> resultBean = new ResultBean<>();
        // 开启分页
        PageHelper.startPage(page, rows);
        List<MenuVo> menus = elecPopedomMapper.getMenus();
        // 获取其他数据
        PageInfo<MenuVo> info=new PageInfo<>(menus);
        //封装结果
        Long total = info.getTotal();
        resultBean.setTotal(total.intValue());
        resultBean.setRows(menus);
        return resultBean;
    }
}
