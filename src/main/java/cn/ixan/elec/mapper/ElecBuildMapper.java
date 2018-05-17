package cn.ixan.elec.mapper;

import cn.ixan.elec.domain.ElecBuild;
import cn.ixan.elec.domain.ElecBuildExample;
import cn.ixan.elec.vo.ElecBuildVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ElecBuildMapper {
    /**
     * 模糊查询监测台建筑信息
     * @param elecBuild
     * @return
     */
    List<ElecBuildVo> queryBuildInfoByExample(ElecBuild elecBuild);
    /**
     * 查询所有监测台建筑信息
     * @return
     */
    List<ElecBuild> findAllBuildInfo();
    int countByExample(ElecBuildExample example);

    int deleteByExample(ElecBuildExample example);

    int deleteByPrimaryKey(String id);

    int insert(ElecBuild record);

    int insertSelective(ElecBuild record);

    List<ElecBuild> selectByExample(ElecBuildExample example);

    ElecBuild selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ElecBuild record, @Param("example") ElecBuildExample example);

    int updateByExample(@Param("record") ElecBuild record, @Param("example") ElecBuildExample example);

    int updateByPrimaryKeySelective(ElecBuild record);

    int updateByPrimaryKey(ElecBuild record);

}