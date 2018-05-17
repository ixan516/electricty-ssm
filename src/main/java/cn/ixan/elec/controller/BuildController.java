package cn.ixan.elec.controller;

import cn.ixan.elec.domain.ElecBuild;
import cn.ixan.elec.service.ElecBuildService;
import cn.ixan.elec.vo.ElecBuildVo;
import cn.ixan.elec.vo.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 监测台建筑管理
 */
@RestController
@RequestMapping("/build")
public class BuildController {
    private static Logger logger = LoggerFactory.getLogger(SystemController.class);

    @Autowired
    private ElecBuildService elecBuildService;

    /**
     * 模糊查询监测台建筑信息
     * @param elecBuild
     * @return
     */
    @RequestMapping(value = "/queryBuildInfoByExample", method = RequestMethod.POST)
    public ResultBean<ElecBuildVo> queryBuildInfoByExample(@RequestBody ElecBuild elecBuild) {
        return elecBuildService.queryBuildInfoByExample(elecBuild);
    }
    /**
     * 根据主键查询监测台建筑信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/getBuildInfoById", method = RequestMethod.GET)
    public Map<String, Object> getBuildInfoById(@RequestParam(value = "id",required = false) String id) {
        return elecBuildService.getBuildInfoById(id);
    }
    /**
     * 添加监测台建筑信息
     */
    @RequestMapping(value = "/addBuildInfo", method = RequestMethod.POST)
    public Boolean addBuildInfo(@RequestBody ElecBuild elecBuild) {
        return elecBuildService.addBuildInfo(elecBuild);
    }
    /**
     * 批量删除建筑信息
     */
    @RequestMapping(value = "/deleteBuild", method = RequestMethod.GET)
    public Boolean deleteUser(@RequestParam(value = "ids",required = false) String ids) {
        return elecBuildService.deleteUser(ids);
    }

    /**
     * 查询所有建筑信息
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping(value = "/findAllBuildInfo", method = RequestMethod.GET)
    public ResultBean<ElecBuildVo> findAllBuildInfo(@RequestParam(value = "page") Integer page,
                                                    @RequestParam(value = "rows") Integer rows){
        return elecBuildService.findAllBuildInfo(page, rows);
    }

}
