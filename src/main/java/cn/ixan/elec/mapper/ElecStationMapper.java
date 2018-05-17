package cn.ixan.elec.mapper;

import cn.ixan.elec.domain.ElecStation;
import cn.ixan.elec.domain.ElecStationExample;
import cn.ixan.elec.vo.ElecStationVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ElecStationMapper {
    /**
     * 获取所有站点名称
     * @return
     */
    List<Map<String,String>> getStationNames();
    /**
     * 模糊查询站点基本信息
     * @param elecStation
     * @return
     */
    List<ElecStationVo> querySiteInfoByExample(ElecStation elecStation);
    /**
     * 获取站点基本信息
     * @return
     */
    List<ElecStationVo> getAllSiteInfo();
    int countByExample(ElecStationExample example);

    int deleteByExample(ElecStationExample example);

    int deleteByPrimaryKey(String id);

    int insert(ElecStation record);

    int insertSelective(ElecStation record);

    List<ElecStation> selectByExample(ElecStationExample example);

    ElecStation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ElecStation record, @Param("example") ElecStationExample example);

    int updateByExample(@Param("record") ElecStation record, @Param("example") ElecStationExample example);

    int updateByPrimaryKeySelective(ElecStation record);

    int updateByPrimaryKey(ElecStation record);

}