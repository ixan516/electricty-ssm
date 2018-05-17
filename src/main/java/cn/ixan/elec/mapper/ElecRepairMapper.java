package cn.ixan.elec.mapper;

import cn.ixan.elec.domain.ElecRepair;
import cn.ixan.elec.domain.ElecRepairExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ElecRepairMapper {
    /**
     * 查询所有设备校准检修记录
     * @return
     */
    List<ElecRepair> findAllRepairRecords();
    int countByExample(ElecRepairExample example);

    int deleteByExample(ElecRepairExample example);

    int deleteByPrimaryKey(String id);

    int insert(ElecRepair record);

    int insertSelective(ElecRepair record);

    List<ElecRepair> selectByExample(ElecRepairExample example);

    ElecRepair selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ElecRepair record, @Param("example") ElecRepairExample example);

    int updateByExample(@Param("record") ElecRepair record, @Param("example") ElecRepairExample example);

    int updateByPrimaryKeySelective(ElecRepair record);

    int updateByPrimaryKey(ElecRepair record);

}