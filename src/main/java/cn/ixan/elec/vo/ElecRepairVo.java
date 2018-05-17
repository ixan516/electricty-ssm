package cn.ixan.elec.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 设备校准检修
 */
@Data
public class ElecRepairVo implements Serializable{
    /**
     * 仪器校准,主键ID
     */
    private String id;
    /**
     * 设备名称
     */
    private String devId;
    /**
     * 检修周期
     */
    private String repairCycle;
    /**
     * 使用日期
     */
    private String useDate;
    /**
     * 是否检修，0未检修，1已检修
     */
    private String isHaving;
    /**
     * 开始日期
     */
    private String startDate;
    /**
     * 所属单位(对应字典表)
     */
    private String jctId;
}