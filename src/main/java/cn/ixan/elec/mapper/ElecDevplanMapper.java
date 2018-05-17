package cn.ixan.elec.mapper;

import cn.ixan.elec.domain.ElecDevplan;
import cn.ixan.elec.domain.ElecDevplanExample;
import cn.ixan.elec.vo.ElecDevPlanVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ElecDevplanMapper {
    /**
     * 查询所有的设备购置计划
     * @return
     */
    List<ElecDevPlanVo> findAllDevPlan();
    int countByExample(ElecDevplanExample example);

    int deleteByExample(ElecDevplanExample example);

    int deleteByPrimaryKey(String id);

    int insert(ElecDevplan record);

    int insertSelective(ElecDevplan record);

    List<ElecDevplan> selectByExample(ElecDevplanExample example);

    ElecDevplan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ElecDevplan record, @Param("example") ElecDevplanExample example);

    int updateByExample(@Param("record") ElecDevplan record, @Param("example") ElecDevplanExample example);

    int updateByPrimaryKeySelective(ElecDevplan record);

    int updateByPrimaryKey(ElecDevplan record);
}