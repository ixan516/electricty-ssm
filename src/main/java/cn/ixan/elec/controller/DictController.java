package cn.ixan.elec.controller;

import cn.ixan.elec.domain.ElecDict;
import cn.ixan.elec.service.ElecDictService;
import cn.ixan.elec.vo.ElecDictVo;
import cn.ixan.elec.vo.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dict")
public class DictController {
    private static Logger logger = LoggerFactory.getLogger(SystemController.class);
    @Autowired
    private ElecDictService elecDictService;


    /**
     * 查询字典表中的故障类型
     */
    @RequestMapping("/findDictByBugType")
    public List<ElecDictVo> findDictByBugType(){
        return elecDictService.findDictByBugType();
    }
    /**
     * 查询字典表中的设备状态
     */
    @RequestMapping("/findDictByDeviceStatus")
    public List<ElecDictVo> findDictByDeviceStatus(){
        return elecDictService.findDictByDeviceStatus();
    }
    /**
     * 查询字典表中的设备类型
     */
    @RequestMapping("/findDictByDeviceType")
    public List<ElecDictVo> findDictByDeviceType(){
        return elecDictService.findDictByDeviceType();
    }
    /**
     * 查询字典表中的站点类别
     */
    @RequestMapping("/findDictBySiteType")
    public List<ElecDictVo> findDictBySiteType(){
        return elecDictService.findDictBySiteType();
    }
    /**
     * 查询字典表中的建筑类型
     */
    @RequestMapping("/findDictByBuildType")
    public List<ElecDictVo> findDictByBuildType(){
        return elecDictService.findDictByBuildType();
    }
    /**
     * 查询字典表中的在职状态
     */
    @RequestMapping("/findDictByDuty")
    public List<ElecDictVo> findDictByDuty(){
        return elecDictService.findDictByDuty();
    }
    /**
     * 查询字典表中的所有单位
     */
    @RequestMapping("/findDictByRegion")
    public List<ElecDictVo> findDictByRegion(){
        return elecDictService.findDictByRegion();
    }
    /**
     * 查询字典表中的所有职位
     */
    @RequestMapping("/findDictByPosition")
    public List<ElecDictVo> findDictByPosition(){
        return elecDictService.findDictByPosition();
    }
    /**
     * 查询字典表中的所有性别
     */
    @RequestMapping("/findDictBySex")
    public List<ElecDictVo> findDictBySex(){
        return elecDictService.findDictBySex();
    }
    /**
     * 获取字典表所有关键字
     * 请求:/dict/getDicts.action
     * 返回值:List<ElecDict>
     */
    @RequestMapping(value = "/getDicts",method = RequestMethod.GET)
    public ResultBean<ElecDict> getDicts() {
        return elecDictService.getDicts();
    }
}
