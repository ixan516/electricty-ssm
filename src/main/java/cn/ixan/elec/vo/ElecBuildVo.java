package cn.ixan.elec.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ElecBuildVo implements Serializable{
    /**
     * 主键ID
     */
    private String id;
    /**
     * 建筑名称
     */
    private String buildName;
    /**
     * 所属单位(对应数据字典)
     */
    private String jctId;
    /**
     * 建筑层数
     */
    private Integer buildLayer;
    /**
     * 造价
     */
    private Double buildExpense;
    /**
     * 建筑类型(对应数据字典)
     */
    private String buildType;
    /**
     * 建筑面积
     */
    private Double buildArea;
    /**
     * 大修时间
     */
    private String dxDate;
    /**
     * 备注
     */
    private String comment;

}
