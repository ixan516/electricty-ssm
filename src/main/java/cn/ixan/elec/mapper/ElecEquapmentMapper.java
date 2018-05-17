package cn.ixan.elec.mapper;

import cn.ixan.elec.domain.ElecEquapment;
import cn.ixan.elec.domain.ElecEquapmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ElecEquapmentMapper {
    /**
     * 查询所有设备名称
     * @return
     */
    List<Map<String,String>> findDevices();
    /**
     * 模糊查询仪器设备
     * @param elecEquapment
     * @return
     */
    List<ElecEquapment> queryEquapmentInfoByExample(Map<String, Object> elecEquapment);
    /**
     * 查询所有的仪器设备
     * @return
     */
    List<ElecEquapment> findAllDev();
    int countByExample(ElecEquapmentExample example);

    int deleteByExample(ElecEquapmentExample example);

    int deleteByPrimaryKey(String id);

    int insert(ElecEquapment record);

    int insertSelective(ElecEquapment record);

    List<ElecEquapment> selectByExample(ElecEquapmentExample example);

    ElecEquapment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ElecEquapment record, @Param("example") ElecEquapmentExample example);

    int updateByExample(@Param("record") ElecEquapment record, @Param("example") ElecEquapmentExample example);

    int updateByPrimaryKeySelective(ElecEquapment record);

    int updateByPrimaryKey(ElecEquapment record);

}