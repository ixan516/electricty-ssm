package cn.ixan.elec.controller;

import cn.ixan.elec.domain.ElecEquapment;
import cn.ixan.elec.domain.ElecRepair;
import cn.ixan.elec.service.EquapmentService;
import cn.ixan.elec.vo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 仪器设备管理
 */
@RestController
@RequestMapping("/equapment")
public class EquapmentController {
    private static Logger logger = LoggerFactory.getLogger(SystemController.class);

    @Autowired
    private EquapmentService equapmentService;


    /**
     * 查询所有设备名称
     */
    @RequestMapping("/findDevices")
    public List<Map<String,String>> findDevices(){
        return equapmentService.findDevices();
    }
    /**
     * 模糊查询仪器设备
     * @param map
     * @return
     */
    @RequestMapping(value = "/queryEquapmentInfoByExample", method = RequestMethod.POST)
    public ResultBean<ElecEquapmentVo> queryEquapmentInfoByExample(@RequestBody Map<String,Object> map) {
        return equapmentService.queryEquapmentInfoByExample(map);
    }

    /**
     * 根据主键查询仪器设备信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/getEquapmentById", method = RequestMethod.GET)
    public Map<String, Object> getEquapmentById(@RequestParam(value = "id",required = false) String id) {
        return equapmentService.getEquapmentById(id);
    }
    /**
     * 添加仪器设备信息
     */
    @RequestMapping(value = "/addEquapment", method = RequestMethod.POST)
    public Boolean addEquapment(@RequestBody ElecEquapment elecEquapment) {
        return equapmentService.addEquapment(elecEquapment);
    }
    /**
     * 批量删除仪器设备
     */
    @RequestMapping(value = "/deleteEquapment", method = RequestMethod.GET)
    public Boolean deleteEquapment(@RequestParam(value = "ids",required = false) String ids) {
        return equapmentService.deleteEquapment(ids);
    }
    /**
     * 查询所有的仪器设备
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping(value="/findAllDev", method = RequestMethod.GET)
    public ResultBean<ElecEquapmentVo> findAllDev(@RequestParam(value = "page") Integer page,
                                                  @RequestParam(value = "rows") Integer rows){
        return equapmentService.findAllDev(page, rows);
    }


    /**
     * 根据主键查询设备校准检修记录
     * @param id
     * @return
     */
    @RequestMapping(value = "/getRepairRecordById", method = RequestMethod.GET)
    public Map<String, Object> getRepairRecordById(@RequestParam(value = "id",required = false) String id) {
        return equapmentService.getRepairRecordById(id);
    }
    /**
     * 添加仪器校准检修记录
     */
    @RequestMapping(value = "/addRepairInfo", method = RequestMethod.POST)
    public Boolean addRepairInfo(@RequestBody ElecRepair elecRepair) {
        return equapmentService.addRepairInfo(elecRepair);
    }
    /**
     * 批量删除设备校准记录
     */
    @RequestMapping(value = "/deleteRepairRecord", method = RequestMethod.GET)
    public Boolean deleteRepairRecord(@RequestParam(value = "ids",required = false) String ids) {
        return equapmentService.deleteRepairRecord(ids);
    }
    /**
     * 查询所有设备校准检修记录
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping(value="/findAllRepairRecords", method = RequestMethod.GET)
    public ResultBean<ElecRepairVo > findAllRepairRecords(@RequestParam(value = "page") Integer page,
                                                          @RequestParam(value = "rows") Integer rows){
        return equapmentService.findAllRepairRecords(page, rows);
    }

    /**
     * 批量删除设备购置计划
     * @param ids
     * @return
     */
    @RequestMapping(value = "/deleteDevicePlan", method = RequestMethod.GET)
    public Boolean deleteDevicePlan(@RequestParam(value = "ids",required = false) String ids) {
        return equapmentService.deleteDevicePlan(ids);
    }
    /**
     * 查询所有的设备购置计划
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping(value="/findAllDevPlan", method = RequestMethod.GET)
    public ResultBean<ElecDevPlanVo> findAllDevPlan(@RequestParam(value = "page") Integer page,
                                                    @RequestParam(value = "rows") Integer rows){
        return equapmentService.findAllDevPlan(page, rows);

    }


}
