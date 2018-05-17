package cn.ixan.elec.mapper;

import cn.ixan.elec.domain.ElecRun;
import cn.ixan.elec.domain.ElecRunExample;
import cn.ixan.elec.vo.ElecRunVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ElecRunMapper {
    /**
     * 模糊查询运行情况
     * @param elecRun
     * @return
     */
    List<ElecRunVo> queryRunInfoByExample(Map<String, String> elecRun);
    /**
     * 获取运行情况
     * @return
     */
    List<ElecRunVo> getAllRunInfo();
    int countByExample(ElecRunExample example);

    int deleteByExample(ElecRunExample example);

    int deleteByPrimaryKey(String id);

    int insert(ElecRun record);

    int insertSelective(ElecRun record);

    List<ElecRun> selectByExample(ElecRunExample example);

    ElecRun selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ElecRun record, @Param("example") ElecRunExample example);

    int updateByExample(@Param("record") ElecRun record, @Param("example") ElecRunExample example);

    int updateByPrimaryKeySelective(ElecRun record);

    int updateByPrimaryKey(ElecRun record);

}