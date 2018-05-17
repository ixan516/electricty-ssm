package cn.ixan.elec.mapper;

import cn.ixan.elec.domain.ElecDict;
import cn.ixan.elec.domain.ElecUser;
import cn.ixan.elec.domain.ElecUserExample;
import cn.ixan.elec.vo.ElecUserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ElecUserMapper {
    /**
     * 根据登录名查询用户
     * @param username
     * @return
     */
    List<ElecUser> findByLogonName(String username);
    /**
     * 查询所有用户，用于报表导出
     * @return
     */
    List<ElecUser> findAll();
    /**
     * 模糊查询用户
     * @return
     * @param
     */
    List<ElecUserVo> queryUserByExample(ElecUser elecUser);
    /**
     * 查询所有用户
     * @return
     * @param
     */
    List<ElecUserVo> findAllUser();
    /**
     * 获取所有区域信息
     * @return
     */
    List<ElecDict> getRegions(String region);

    int countByExample(ElecUserExample example);

    int deleteByExample(ElecUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(ElecUser record);

    int insertSelective(ElecUser record);

    List<ElecUser> selectByExample(ElecUserExample example);

    ElecUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") ElecUser record, @Param("example") ElecUserExample example);

    int updateByExample(@Param("record") ElecUser record, @Param("example") ElecUserExample example);

    int updateByPrimaryKeySelective(ElecUser record);

    int updateByPrimaryKey(ElecUser record);

}