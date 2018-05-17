package cn.ixan.elec.service;

import cn.ixan.elec.domain.ElecUser;
import cn.ixan.elec.vo.ElecUserVo;
import cn.ixan.elec.vo.ResultBean;

import java.util.List;
import java.util.Map;

public interface ElecUserService {
    ElecUser findByUserName(String username);
    /**
     * 查询所有的用户数据
     * @return
     */
    List<ElecUser> findAll();
    /**
     * 批量添加用户
     * @param allUsers
     */
    void addCustomers(List<ElecUser> allUsers);
    /**
     * 模糊查询用户
     * @param elecUser
     * @return
     */
    ResultBean<ElecUserVo> queryUserByExample(ElecUser elecUser);
    /**
     * 根据主键查询用户
     * @param userId
     * @return
     */
    Map<String, Object> getUserById(String userId);
    /**
     * 删除用户
     * @param ids
     * @return
     */
    Boolean deleteUser(String ids);
    /**
     * 添加用户
     * @param elecUser
     * @return
     */
    Boolean addCustomer(ElecUser elecUser);
    /**
     * 模糊查询所有用户
     * @return
     * @param page
     * @param rows
     */
    ResultBean<ElecUserVo> findAllUser(Integer page, Integer rows);

}
