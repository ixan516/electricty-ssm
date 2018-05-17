package cn.ixan.elec.controller;

import cn.ixan.elec.domain.ElecPopedom;
import cn.ixan.elec.service.ElecPopedomService;
import cn.ixan.elec.service.ElecSystemService;
import cn.ixan.elec.vo.ElecCommonMsgVo;
import cn.ixan.elec.vo.MenuVo;
import cn.ixan.elec.vo.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {
    private static final Logger logger = LoggerFactory.getLogger(MenuController.class);
    @Autowired
    private ElecSystemService elecCommonMsgService;
    @Autowired
    private ElecPopedomService elecPopedomService;

    /**
     * 添加节点树
     */
    @RequestMapping(value = "/addMenuTree", method = RequestMethod.POST)
    public Boolean addMenuTree(@RequestBody ElecPopedom elecPopedom) {
        return elecPopedomService.addMenuTree(elecPopedom);
    }

    /**
     * 批量插入所有结点树
     * @return
     */
    @RequestMapping(value = "/addMenus", method = RequestMethod.POST)
    @ResponseBody
    public Boolean addMenus(@RequestBody List<ElecPopedom> menus) {
        return elecPopedomService.addMenus(menus);
    }
    /**
     * 获取菜单树
     * @return
     */
    @RequestMapping(value = "/getMenuTree", method = RequestMethod.POST)
    @ResponseBody
    public List<ElecPopedom> getMenuTree() {
        return elecPopedomService.getMenuTree();
    }
    /**
     * 获取所有菜单(带分页)
     * @return
     */
    @RequestMapping(value = "/getMenus", method = RequestMethod.POST)
    @ResponseBody
    public ResultBean<MenuVo> getMenus(@RequestParam(value = "page") Integer page,
                                       @RequestParam(value = "rows") Integer rows) {
        return elecPopedomService.getMenus(page,rows);
    }
    /**
     * 跳转到menu/alermStation.jsp
     *
     * @return
     */
    @RequestMapping("/alermStation")
    public ModelAndView alermStation() {
        ModelAndView modelAndView = new ModelAndView();
        // 查询运行监控表，获取运行监控表中的数据
        List<ElecCommonMsgVo> commonMsgVos = null;
        try {
            commonMsgVos = elecCommonMsgService.findAllElecCommonMsg();
        } catch (Exception e) {
            logger.error("获取运行监控表中的数据失败", e);
        }
        // 格式化数据
        List<String> list = getCommonMsgFormat(commonMsgVos);
        // 设置页面返回的数据
        modelAndView.addObject("list", list);
        // 指定页面返回的地址
        modelAndView.setViewName("/menu/alermStation");
        return modelAndView;
    }

    private List<String> getCommonMsgFormat(List<ElecCommonMsgVo> commonMsgVos) {
        List<String> list = new ArrayList<>();
        if (null != commonMsgVos && commonMsgVos.size() > 0) {
            for (ElecCommonMsgVo elecCommonMsgVo : commonMsgVos) {
                String str = elecCommonMsgVo.getCreateDate() + "--" + elecCommonMsgVo.getStationRun() + "<br/>";
                list.add(str);
            }
        }
        return list;
    }

    /**
     * 跳转到menu/alermDevice.jsp
     *
     * @return
     */
    @RequestMapping("/alermDevice")
    public ModelAndView alermDevice() {
        ModelAndView modelAndView = new ModelAndView();
        // 查询运行监控表，获取运行监控表中的数据
        List<ElecCommonMsgVo> commonMsgVos = null;
        try {
            commonMsgVos = elecCommonMsgService.findAllElecCommonMsg();
        } catch (Exception e) {
            logger.error("获取运行监控表中的数据", e);
        }
        List<String> list = new ArrayList<>();
        if (null != commonMsgVos && commonMsgVos.size() > 0) {
            for (ElecCommonMsgVo elecCommonMsgVo : commonMsgVos) {
                String str = elecCommonMsgVo.getCreateDate() + "--" + elecCommonMsgVo.getDevRun() + "<br/>";
                list.add(str);
            }
        }
        // 设置页面返回的数据
        modelAndView.addObject("list", list);
        // 指定页面返回的地址
        modelAndView.setViewName("/menu/alermDevice");
        return modelAndView;
    }

}
