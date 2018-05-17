package cn.ixan.elec.mapper;

import cn.ixan.elec.domain.ElecCommonmsg;
import cn.ixan.elec.domain.ElecCommonmsgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ElecCommonmsgMapper {

    /**
     * 查询出运行监控表中的最新数据
     * @return
     */
    public ElecCommonmsg findLatestElecCommonMsg();

    /**
     * 首页返回10条运行监控信息
     * @return
     */
    public List<ElecCommonmsg> findAllElecCommonMsg();

    int countByExample(ElecCommonmsgExample example);

    int deleteByExample(ElecCommonmsgExample example);

    int deleteByPrimaryKey(String comId);

    int insert(ElecCommonmsg record);

    int insertSelective(ElecCommonmsg record);

    List<ElecCommonmsg> selectByExample(ElecCommonmsgExample example);

    ElecCommonmsg selectByPrimaryKey(String comId);

    int updateByExampleSelective(@Param("record") ElecCommonmsg record, @Param("example") ElecCommonmsgExample example);

    int updateByExample(@Param("record") ElecCommonmsg record, @Param("example") ElecCommonmsgExample example);

    int updateByPrimaryKeySelective(ElecCommonmsg record);

    int updateByPrimaryKey(ElecCommonmsg record);
}