package cn.ixan.elec.service;

import cn.ixan.elec.domain.ElecEquapment;
import cn.ixan.elec.domain.ElecRepair;
import cn.ixan.elec.vo.ElecDevPlanVo;
import cn.ixan.elec.vo.ElecEquapmentVo;
import cn.ixan.elec.vo.ElecRepairVo;
import cn.ixan.elec.vo.ResultBean;

import java.util.List;
import java.util.Map;

public interface EquapmentService {
    /**
     * 查询所有的设备名称
     * @return
     */
    List<Map<String,String>> findDevices();
    /**
     * 模糊查询仪器设备
     * @param elecEquapment
     * @return
     */
    ResultBean<ElecEquapmentVo> queryEquapmentInfoByExample(Map<String, Object> elecEquapment);

    /**
     * 根据主键查询仪器设备信息
     * @param id
     * @return
     */
    Map<String,Object> getEquapmentById(String id);
    /**
     * 添加仪器设备
     * @param elecEquapment
     * @return
     */
    Boolean addEquapment(ElecEquapment elecEquapment);
    /**
     * 批量删除仪器设备
     * @param ids
     * @return
     */
    Boolean deleteEquapment(String ids);
    /***
     * 查询所有的仪器设备
     * @param page
     * @param rows
     * @return
     */
    ResultBean<ElecEquapmentVo> findAllDev(Integer page, Integer rows);
    /**
     * 根据主键查询设备检修记录
     * @param id
     * @return
     */
    Map<String,Object> getRepairRecordById(String id);
    /**
     * 添加设备校准记录
     * @param elecRepair
     * @return
     */
    Boolean addRepairInfo(ElecRepair elecRepair);
    /**
     * 批量删除设备校准记录
     * @param ids
     * @return
     */
    Boolean deleteRepairRecord(String ids);
    /**
     * 查询所有设备校准检修记录
     * @param page
     * @param rows
     * @return
     */
    ResultBean<ElecRepairVo> findAllRepairRecords(Integer page, Integer rows);

    /**
     * 批量删除设备购置计划
     * @param ids
     * @return
     */
    Boolean deleteDevicePlan(String ids);

    /**
     * 查询所有的设备购置计划
     * @param page
     * @param rows
     * @return
     */
    ResultBean<ElecDevPlanVo> findAllDevPlan(Integer page, Integer rows);

}
