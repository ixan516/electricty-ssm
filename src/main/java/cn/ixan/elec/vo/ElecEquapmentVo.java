package cn.ixan.elec.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 仪器设备表
 */
@Data
public class ElecEquapmentVo implements Serializable {
    /**
     * 主键ID
     * 仪器设备表
     */
    private String id;
    /**
     * 设备名称
     */
    private String devName;
    /**
     * 规格类型
     */
    private String specType;
    /**
     * 设备状态(对应字典表)
     */
    private String devState;
    /**
     * 使用日期
     */
    private String useDate;
    /**
     * 检修周期
     */
    private String repairCycle;
    /**
     * 所属单位(关联字典表)
     */
    private String jctId;
}
