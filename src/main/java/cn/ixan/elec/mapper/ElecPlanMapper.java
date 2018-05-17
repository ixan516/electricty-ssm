package cn.ixan.elec.mapper;

import cn.ixan.elec.domain.ElecPlan;
import cn.ixan.elec.domain.ElecPlanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ElecPlanMapper {
    int countByExample(ElecPlanExample example);

    int deleteByExample(ElecPlanExample example);

    int deleteByPrimaryKey(String planId);

    int insert(ElecPlan record);

    int insertSelective(ElecPlan record);

    List<ElecPlan> selectByExample(ElecPlanExample example);

    ElecPlan selectByPrimaryKey(String planId);

    int updateByExampleSelective(@Param("record") ElecPlan record, @Param("example") ElecPlanExample example);

    int updateByExample(@Param("record") ElecPlan record, @Param("example") ElecPlanExample example);

    int updateByPrimaryKeySelective(ElecPlan record);

    int updateByPrimaryKey(ElecPlan record);
}