package cn.ixan.elec.service;

import cn.ixan.elec.domain.ElecDict;
import cn.ixan.elec.vo.ElecDictVo;
import cn.ixan.elec.vo.ResultBean;

import java.util.List;
import java.util.Map;

public interface ElecDictService {
    /**
     * 查询字典表中的故障类型
     * @return
     */
    List<ElecDictVo> findDictByBugType();
    /**
     * 查询字典表中所有设备状态
     * @return
     */
    List<ElecDictVo> findDictByDeviceStatus();
    /**
     * 查询字典表中所有设备类型
     * @return
     */
    List<ElecDictVo> findDictByDeviceType();
    /**
     * 查询字典表中所有站点类别
     * @return
     */
    List<ElecDictVo> findDictBySiteType();
    /**
     * 查询字典表中的建筑类型
     * @return
     */
    List<ElecDictVo> findDictByBuildType();
    /**
     * 查询字典表中的在职状态
     * @return
     */
    List<ElecDictVo> findDictByDuty();
    /**
     * 查询字典表中的所有单位
     * @return
     */
    List<ElecDictVo> findDictByRegion();
    /**
     * 查询字典表中的所有职位
     * @return
     */
    List<ElecDictVo> findDictByPosition();
    /**
     * 查询字典表中的所有性别
     * @return
     */
    List<ElecDictVo> findDictBySex();
    /**
     * 获取字典表所有关键字
     * 请求:/dict/getAllKeywords.action
     * 返回值:List<String>
     */
    ResultBean<ElecDict> getDicts();

    /**
     * 增加数据项或类别及数据项到字典表
     * @param map
     */
    void saveOrUpdateDict(Map<String, Object> map);

}
