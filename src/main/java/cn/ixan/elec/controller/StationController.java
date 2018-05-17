package cn.ixan.elec.controller;

import cn.ixan.elec.domain.ElecRun;
import cn.ixan.elec.domain.ElecStation;
import cn.ixan.elec.service.ElecStationService;
import cn.ixan.elec.vo.ElecRunVo;
import cn.ixan.elec.vo.ElecStationVo;
import cn.ixan.elec.vo.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 站点设备运行管理
 */
@RestController
@RequestMapping("/station")
public class StationController {
    private static Logger logger = LoggerFactory.getLogger(SystemController.class);

    @Autowired
    private ElecStationService elecStationService;


    /**
     * 模糊查询站点信息
     * @param elecStation
     * @return
     */
    @RequestMapping(value = "/querySiteInfoByExample", method = RequestMethod.POST)
    public ResultBean<ElecStationVo> querySiteInfoByExample(@RequestBody ElecStation elecStation) {
        return elecStationService.querySiteInfoByExample(elecStation);
    }

    /**
     * 根据主键查询站点信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/getSiteInfoById", method = RequestMethod.GET)
    public Map<String,Object> getSiteInfoById(@RequestParam(value = "id",required = false) String id) {
        return elecStationService.getSiteInfoById(id);
    }
    /**
     * 添加站点信息
     */
    @RequestMapping(value = "/addSiteInfo", method = RequestMethod.POST)
    public Boolean addSiteInfo(@RequestBody ElecStation elecStation) {
        return elecStationService.addSiteInfo(elecStation);
    }
    /**
     * 获取所有站点名称
     */
    @RequestMapping(value = "/getStationNames", method = RequestMethod.POST)
    public List<Map<String,String>> getStationNames() {
        return elecStationService.getStationNames();
    }


    /**
     * 模糊查询运行情况
     * @param map
     * @return
     */
    @RequestMapping(value = "/queryRunInfoByExample", method = RequestMethod.POST)
    public ResultBean<ElecRunVo> queryRunInfoByExample(@RequestBody Map<String,String> map) {
        return elecStationService.queryRunInfoByExample(map);
    }
    /**
     * 根据主键查询运行情况
     * @param id
     * @return
     */
    @RequestMapping(value = "/getStationById", method = RequestMethod.GET)
    public Map<String,Object> getStationById(@RequestParam(value = "id",required = false) String id) {
        return elecStationService.getStationById(id);
    }
    /**
     * 添加运行情况
     */
    @RequestMapping(value = "/addRunInfo", method = RequestMethod.POST)
    public Boolean addRunInfo(@RequestBody ElecRun elecRun) {
        return elecStationService.addRunInfo(elecRun);
    }
    /**
     * 批量删除运行情况
     * @param ids
     * @return
     */
    @RequestMapping(value = "/deleteRunInfo", method = RequestMethod.GET)
    public Boolean deleteRunInfo(@RequestParam(value = "ids",required = false) String ids) {
        return elecStationService.deleteRunInfo(ids);
    }

    /**
     * 获取所有运行情况
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping(value = "/getAllRunInfo", method = RequestMethod.GET)
    public ResultBean<Map<String, Object>> getAllRunInfo(@RequestParam(value = "page") Integer page,
                                                         @RequestParam(value = "rows") Integer rows){
        return elecStationService.getAllRunInfo(page, rows);
    }


    /**
     * 批量删除站点信息
     */
    @RequestMapping(value = "/deleteStationInfo", method = RequestMethod.GET)
    public Boolean deleteStationInfo(@RequestParam(value = "ids",required = false) String ids) {
        return elecStationService.deleteStationInfo(ids);
    }
    /**
     * 获取站点基本信息
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping(value = "/getAllSiteInfo", method = RequestMethod.GET)
    public ResultBean<ElecStationVo> getAllSiteInfo(@RequestParam(value = "page") Integer page,
                                                    @RequestParam(value = "rows") Integer rows){
        return elecStationService.getAllSiteInfo(page, rows);
    }

}
