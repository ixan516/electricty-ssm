package cn.ixan.elec.service.impl;

import cn.ixan.elec.domain.ElecUser;
import cn.ixan.elec.mapper.ElecUserMapper;
import cn.ixan.elec.service.ElecUserService;
import cn.ixan.elec.utils.DateUtils;
import cn.ixan.elec.vo.ElecUserVo;
import cn.ixan.elec.vo.ResultBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class ElecUserServiceImpl implements ElecUserService {

    @Autowired
    private ElecUserMapper elecUserMapper;


    @Override
    public ElecUser findByUserName(String username) {
        List<ElecUser> list = elecUserMapper.findByLogonName(username);
        if(null != list && list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    /**
     * 查询所有的用户数据
     * @return
     */
    @Override
    public List<ElecUser> findAll() {
        return elecUserMapper.findAll();
    }

    /**
     * 批量添加
     * @param allUsers
     */
    @Override
    public void addCustomers(List<ElecUser> allUsers) {
        allUsers.stream().forEach(elecUser -> {
            elecUserMapper.insertSelective(elecUser);
        });
    }

    /**
     * 模糊查询用户
     * @param elecUser
     * @return
     */
    @Override
    public ResultBean<ElecUserVo> queryUserByExample(ElecUser elecUser) {
        List<ElecUserVo> list = elecUserMapper.queryUserByExample(elecUser);
        ResultBean<ElecUserVo> resultBean = new ResultBean<>();
        resultBean.setRows(list);
        resultBean.setTotal(list.size());
        return resultBean;
    }

    /**
     * 根据主键查询用户
     * @param userId
     * @return
     */
    @Override
    public Map<String, Object> getUserById(String userId) {
        ElecUser user = elecUserMapper.selectByPrimaryKey(userId);
        Map<String,Object> map = new HashMap<>();
        map.put("userId",user.getUserId());
        map.put("jctId",user.getJctId());
        map.put("userName",user.getUserName());
        map.put("logonName",user.getLogonName());
        map.put("logonPwd",user.getLogonPwd());
        map.put("sexId",user.getSexId());
        map.put("birthday", DateUtils.date2String(user.getBirthday()));
        map.put("address",user.getAddress());
        map.put("contactTel",user.getContactTel());
        map.put("email",user.getEmail());
        map.put("isDuty",user.getIsDuty());
        map.put("postId",user.getPostId());
        map.put("onDutyDate",DateUtils.date2String(user.getOnDutyDate()));
        map.put("offDutyDate","");
        map.put("remark",user.getRemark());
        return map;
    }

    /**
     * 删除用户
     * @param ids
     * @return
     */
    @Override
    public Boolean deleteUser(String ids) {
        Boolean result = false;
        if(StringUtils.isNotBlank(ids)){
            String[] userIds = ids.split(",");
            for(int i = 0; i<userIds.length;i++){
                elecUserMapper.deleteByPrimaryKey(userIds[i]);
            }
            result = true;
        }
        return result;
    }

    /**
     * 添加用户
     * @param elecUser
     * @return
     */
    @Override
    public Boolean addCustomer(ElecUser elecUser) {
        Integer result = null;
        String userId = elecUser.getUserId();
        // 更新
        if(StringUtils.isNotBlank(userId)){
            result = elecUserMapper.updateByPrimaryKey(elecUser);
        }else{
            result = elecUserMapper.insertSelective(elecUser);
        }
        return result == 1;
    }

    /**
     * 查询所有用户
     * @param page
     * @param rows
     * @return
     */
    @Override
    public ResultBean<ElecUserVo> findAllUser(Integer page, Integer rows) {
        ResultBean<ElecUserVo> resultBean = new ResultBean<>();
        // 开启分页
        PageHelper.startPage(page, rows);
        List<ElecUserVo> list = elecUserMapper.findAllUser();
        // 获取其他数据
        PageInfo<ElecUserVo> info=new PageInfo<ElecUserVo>(list);
        //封装结果
        long total = info.getTotal();
        resultBean.setTotal(Math.toIntExact(total));
        resultBean.setRows(list);
        return resultBean;
    }

}
