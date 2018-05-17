package cn.ixan.elec.service;

import cn.ixan.elec.domain.ElecBuild;
import cn.ixan.elec.vo.ElecBuildVo;
import cn.ixan.elec.vo.ResultBean;

import java.util.Map;

public interface ElecBuildService {
    /**
     * 模糊查询监测台建筑信息
     * @param elecBuild
     * @return
     */
    ResultBean<ElecBuildVo> queryBuildInfoByExample(ElecBuild elecBuild);
    /**
     * 根据主键查询监测台建筑信息
     * @param id
     * @return
     */
    Map<String,Object> getBuildInfoById(String id);
    /**
     * 添加监测台建筑信息
     * @param elecBuild
     * @return
     */
    Boolean addBuildInfo(ElecBuild elecBuild);
    /**
     * 批量删除建筑信息
     * @param ids
     * @return
     */
    Boolean deleteUser(String ids);
    /**
     * 查询所有建筑信息
     * @param page
     * @param rows
     * @return
     */
    ResultBean<ElecBuildVo> findAllBuildInfo(Integer page, Integer rows);

}
