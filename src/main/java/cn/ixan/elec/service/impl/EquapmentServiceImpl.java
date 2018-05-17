package cn.ixan.elec.service.impl;

import cn.ixan.elec.domain.ElecEquapment;
import cn.ixan.elec.domain.ElecRepair;
import cn.ixan.elec.mapper.ElecDevplanMapper;
import cn.ixan.elec.mapper.ElecEquapmentMapper;
import cn.ixan.elec.mapper.ElecRepairMapper;
import cn.ixan.elec.service.EquapmentService;
import cn.ixan.elec.utils.DateUtils;
import cn.ixan.elec.vo.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class EquapmentServiceImpl implements EquapmentService {

    @Inject
    private ElecEquapmentMapper elecEquapmentMapper;
    @Inject
    private ElecDevplanMapper elecDevplanMapper;
    @Inject
    private ElecRepairMapper elecRepairMapper;

    /**
     * 查询所有设备校准检修记录
     * @param page
     * @param rows
     * @return
     */
    @Override
    public ResultBean<ElecRepairVo> findAllRepairRecords(Integer page, Integer rows) {
        ResultBean<ElecRepairVo> resultBean = new ResultBean<>();
        // 开启分页
        PageHelper.startPage(page, rows);
        List<ElecRepair> list = elecRepairMapper.findAllRepairRecords();
        List<ElecRepairVo> elecRepairVos = new ArrayList<>();
        if(null != list&& list.size()>0){
            for(ElecRepair elecRepair:list){
                ElecRepairVo repairVo = new ElecRepairVo();
                repairVo.setId(elecRepair.getId());
                repairVo.setDevId(elecRepair.getDevId());
                repairVo.setRepairCycle(elecRepair.getRepairCycle());
                repairVo.setUseDate(DateUtils.date2String(elecRepair.getUseDate()));
                repairVo.setIsHaving(elecRepair.getIsHaving());
                repairVo.setStartDate(DateUtils.date2String(elecRepair.getStartDate()));
                repairVo.setJctId(elecRepair.getJctId());
                elecRepairVos.add(repairVo);
            }
        }
        // 获取其他数据
        PageInfo<ElecRepair> info = new PageInfo<ElecRepair>(list);
        //封装结果
        Long total = info.getTotal();
        resultBean.setTotal(total.intValue());
        resultBean.setRows(elecRepairVos);
        return resultBean;
    }

    /**
     * 查询所有设备名称
     * @return
     */
    @Override
    public List<Map<String, String>> findDevices() {
        return elecEquapmentMapper.findDevices();
    }

    /**
     * 模糊查询仪器设备
     * @param map
     * @return
     */
    @Override
    public ResultBean<ElecEquapmentVo> queryEquapmentInfoByExample(Map<String, Object> map) {
        ResultBean<ElecEquapmentVo> resultBean = new ResultBean<>();
        // 查询
        List<ElecEquapment> list = elecEquapmentMapper.queryEquapmentInfoByExample(map);
        List<ElecEquapmentVo> elecEquapmentVos = new ArrayList<>();
        if(null !=list && list.size()>0){
            for(ElecEquapment equapment:list){
                ElecEquapmentVo elecEquapmentVo = new ElecEquapmentVo();
                elecEquapmentVo.setId(equapment.getId());
                elecEquapmentVo.setDevName(equapment.getDevName());
                elecEquapmentVo.setSpecType(equapment.getSpecType());
                elecEquapmentVo.setDevState(equapment.getDevState());
                elecEquapmentVo.setUseDate(DateUtils.date2String(equapment.getUseDate()));
                elecEquapmentVo.setRepairCycle(equapment.getRepairCycle());
                elecEquapmentVo.setJctId(equapment.getJctId());
                elecEquapmentVos.add(elecEquapmentVo);
            }
        }
        resultBean.setRows(elecEquapmentVos);
        resultBean.setTotal(list.size());
        return resultBean;
    }

    /**
     * 根据主键查询仪器设备信息
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> getEquapmentById(String id) {
        ElecEquapment equapment = elecEquapmentMapper.selectByPrimaryKey(id);
        Map<String,Object> map = new HashMap<>();
        map.put("id",equapment.getId());
        map.put("devName",equapment.getDevName());
        map.put("jctId",equapment.getJctId());
        map.put("devType",equapment.getDevType());
        map.put("quality",equapment.getQuality());
        map.put("devExpense",equapment.getDevExpense());
        map.put("configure",equapment.getConfigure());
        map.put("specType",equapment.getSpecType());
        map.put("tradeMark",equapment.getTradeMark());
        map.put("devState",equapment.getDevState());
        map.put("produceHome",equapment.getProduceHome());
        map.put("produceArea",equapment.getProduceArea());
        map.put("useness",equapment.getUseness());
        map.put("useUnit",equapment.getUseUnit());
        map.put("repairCycle",equapment.getRepairCycle());
        map.put("useDate",DateUtils.date2String(equapment.getUseDate()));
        map.put("adjustPeriod",equapment.getAdjustPeriod());
        map.put("runDesc",equapment.getRunDesc());
        map.put("comment",equapment.getComment());
        return map;
    }

    /**
     * 添加仪器设备
     * @param elecEquapment
     * @return
     */
    @Override
    public Boolean addEquapment(ElecEquapment elecEquapment) {
        Integer result = null;
        String buildId = elecEquapment.getId();
        // 更新
        if(StringUtils.isNotBlank(buildId)){
            result = elecEquapmentMapper.updateByPrimaryKey(elecEquapment);
        }else{
            result = elecEquapmentMapper.insertSelective(elecEquapment);
        }
        return result == 1;
    }

    /**
     * 批量删除仪器设备
     * @param ids
     * @return
     */
    @Override
    public Boolean deleteEquapment(String ids) {
        Boolean result = false;
        if(StringUtils.isNotBlank(ids)){
            String[] userIds = ids.split(",");
            for(int i = 0; i<userIds.length;i++){
                elecEquapmentMapper.deleteByPrimaryKey(userIds[i]);
            }
            result = true;
        }
        return result;
    }

    /**
     * 查询所有的仪器设备
     * @param page
     * @param rows
     * @return
     */
    @Override
    public ResultBean<ElecEquapmentVo> findAllDev(Integer page, Integer rows) {
        ResultBean<ElecEquapmentVo> resultBean = new ResultBean<>();
        // 开启分页
        PageHelper.startPage(page, rows);
        List<ElecEquapment> list = elecEquapmentMapper.findAllDev();
        List<ElecEquapmentVo> elecEquapmentVos = new ArrayList<>();
        if(null !=list && list.size()>0){
            for(ElecEquapment equapment:list){
                ElecEquapmentVo elecEquapmentVo = new ElecEquapmentVo();
                elecEquapmentVo.setId(equapment.getId());
                elecEquapmentVo.setDevName(equapment.getDevName());
                elecEquapmentVo.setSpecType(equapment.getSpecType());
                elecEquapmentVo.setDevState(equapment.getDevState());
                elecEquapmentVo.setUseDate(DateUtils.date2String(equapment.getUseDate()));
                elecEquapmentVo.setRepairCycle(equapment.getRepairCycle());
                elecEquapmentVo.setJctId(equapment.getJctId());
                elecEquapmentVos.add(elecEquapmentVo);
            }
        }
        // 获取其他数据
        PageInfo<ElecEquapment> info = new PageInfo<ElecEquapment>(list);
        //封装结果
        Long total = info.getTotal();
        resultBean.setTotal(total.intValue());
        resultBean.setRows(elecEquapmentVos);
        return resultBean;
    }

    /**
     * 根据主键查询设备检修记录
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> getRepairRecordById(String id) {
        ElecRepair repair = elecRepairMapper.selectByPrimaryKey(id);
        Map<String, Object> map = new HashMap<>();
        map.put("devId", repair.getDevId());
        map.put("jctId", repair.getJctId());
        map.put("repairCycle", repair.getRepairCycle());
        map.put("useDate", DateUtils.date2String(repair.getUseDate()));
        map.put("isHaving", repair.getIsHaving());
        map.put("startDate", DateUtils.date2String(repair.getStartDate()));
        map.put("record", repair.getRecord());
        map.put("comment", repair.getComment());
        return map;
    }

    /**
     * 添加设备校准记录
     * @param elecRepair
     * @return
     */
    @Override
    public Boolean addRepairInfo(ElecRepair elecRepair) {
        Integer result = null;
        String buildId = elecRepair.getId();
        // 更新
        if(StringUtils.isNotBlank(buildId)){
            result = elecRepairMapper.updateByPrimaryKey(elecRepair);
        }else{
            result = elecRepairMapper.insertSelective(elecRepair);
        }
        return result == 1;
    }

    /**
     * 批量删除设备校准记录
     * @param ids
     * @return
     */
    @Override
    public Boolean deleteRepairRecord(String ids) {
        Boolean result = false;
        if(StringUtils.isNotBlank(ids)){
            String[] userIds = ids.split(",");
            for(int i = 0; i<userIds.length;i++){
                elecRepairMapper.deleteByPrimaryKey(userIds[i]);
            }
            result = true;
        }
        return result;
    }
    /**
     * 批量删除设备购置计划
     * @param ids
     * @return
     */
    @Override
    public Boolean deleteDevicePlan(String ids) {
        Boolean result = false;
        if(StringUtils.isNotBlank(ids)){
            String[] userIds = ids.split(",");
            for(int i = 0; i<userIds.length;i++){
                elecDevplanMapper.deleteByPrimaryKey(userIds[i]);
            }
            result = true;
        }
        return result;
    }
    /**
     * 查询所有的设备购置计划
     * @param page
     * @param rows
     * @return
     */
    @Override
    public ResultBean<ElecDevPlanVo> findAllDevPlan(Integer page, Integer rows) {
        ResultBean<ElecDevPlanVo> resultBean = new ResultBean<>();
        // 开启分页
        PageHelper.startPage(page, rows);
        List<ElecDevPlanVo> list = elecDevplanMapper.findAllDevPlan();
        // 获取其他数据
        PageInfo<ElecDevPlanVo> info = new PageInfo<ElecDevPlanVo>(list);
        //封装结果
        Long total = info.getTotal();
        resultBean.setTotal(total.intValue());
        resultBean.setRows(list);
        return resultBean;
    }
}
