package cn.ixan.elec.mapper;

import cn.ixan.elec.domain.ElecDict;
import cn.ixan.elec.domain.ElecDictExample;
import cn.ixan.elec.vo.ElecDictVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ElecSystemddlMapper {
    /**
     * 查询字典表
     * @param input
     * @return
     */
    List<ElecDictVo> findDictBypId(Map<String, Object> input);
    /**
     * 使用keyword，查询对应数据类型的对应的集合
     * 请求：dict/findByKeyword.action
     * 参数：keyword saveitem
     * @param keyword
     */
    List<ElecDict> findByKeyword(Map<String, String> keyword);
    /**
     * 获取字典表所有关键字
     * 请求:/dict/getAllKeywords.action
     * 返回值:List<String>
     */
    List<ElecDict> getDicts();

    int countByExample(ElecDictExample example);

    int deleteByExample(ElecDictExample example);

    int deleteByPrimaryKey(String dictId);

    int insert(ElecDict record);

    int insertSelective(ElecDict record);

    List<ElecDict> selectByExample(ElecDictExample example);

    ElecDict selectByPrimaryKey(String dictId);

    int updateByExampleSelective(@Param("record") ElecDict record, @Param("example") ElecDictExample example);

    int updateByExample(@Param("record") ElecDict record, @Param("example") ElecDictExample example);

    int updateByPrimaryKeySelective(ElecDict record);

    int updateByPrimaryKey(ElecDict record);

}