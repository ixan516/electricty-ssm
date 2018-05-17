package cn.ixan.elec.service;

import cn.ixan.elec.domain.ElecRun;
import cn.ixan.elec.domain.ElecStation;
import cn.ixan.elec.vo.ElecRunVo;
import cn.ixan.elec.vo.ElecStationVo;
import cn.ixan.elec.vo.ResultBean;

import java.util.List;
import java.util.Map;

public interface ElecStationService {
    /**
     * 模糊查询运行情况
     * @param map
     * @return
     */
    ResultBean<ElecRunVo> queryRunInfoByExample(Map<String,String> map);
    /**
     * 根据主键查询运行情况
     * @param id
     * @return
     */
    Map<String,Object> getStationById(String id);
    /**
     * 添加运行情况
     * @param elecRun
     * @return
     */
    Boolean addRunInfo(ElecRun elecRun);
    /**
     * 批量删除运行情况
     * @param ids
     * @return
     */
    Boolean deleteRunInfo(String ids);
    /**
     * 获取运行情况
     * @param page
     * @param rows
     * @return
     */
    ResultBean<Map<String, Object>> getAllRunInfo(Integer page, Integer rows);

    /**
     * 查询所有站点名称
     * @return
     */
    List<Map<String,String>> getStationNames();
    /**
     * 模糊查询站点信息
     * @param elecStation
     * @return
     */
    ResultBean<ElecStationVo> querySiteInfoByExample(ElecStation elecStation);
    /**
     * 根据主键查询站点信息
     * @param id
     * @return
     */
    Map<String, Object> getSiteInfoById(String id);
    /**
     * 添加站点信息
     * @param elecStation
     * @return
     */
    Boolean addSiteInfo(ElecStation elecStation);
    /**
     * 批量删除站点信息
     * @param ids
     * @return
     */
    Boolean deleteStationInfo(String ids);
    /**
     * 获取站点基本信息
     * @param page
     * @param rows
     * @return
     */
    ResultBean<ElecStationVo> getAllSiteInfo(Integer page, Integer rows);

}
