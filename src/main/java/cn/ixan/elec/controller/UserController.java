package cn.ixan.elec.controller;

import cn.ixan.elec.domain.ElecUser;
import cn.ixan.elec.service.ElecUserService;
import cn.ixan.elec.vo.ElecUserVo;
import cn.ixan.elec.vo.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(SystemController.class);
    @Autowired
    private ElecUserService elecUserService;

    /**
     * 模糊查询用户
     * @param elecUser
     * @return
     */
    @RequestMapping(value = "/queryUserByExample", method = RequestMethod.POST)
    public ResultBean<ElecUserVo> queryUserByExample(@RequestBody ElecUser elecUser) {
        return elecUserService.queryUserByExample(elecUser);
    }
    /**
     * 根据主键查询用户
     * @param userId
     * @return
     */
    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    public Map<String, Object> getUserById(@RequestParam(value = "userId",required = false) String userId) {
        return elecUserService.getUserById(userId);
    }
    /**
     * 删除用户
     */
    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    public Boolean deleteUser(@RequestParam(value = "ids",required = false) String ids) {
        return elecUserService.deleteUser(ids);
    }
    /**
     * 添加用户
     */
    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
    public Boolean addCustomer(@RequestBody ElecUser elecUser) {
        return elecUserService.addCustomer(elecUser);
    }

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping(value = "/findAllUser", method = RequestMethod.POST)
    public ResultBean<ElecUserVo> findAllUser(@RequestParam(value = "page") Integer page,
                                              @RequestParam(value = "rows") Integer rows) {
        return elecUserService.findAllUser(page, rows);
    }

}
