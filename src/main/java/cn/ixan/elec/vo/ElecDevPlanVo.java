package cn.ixan.elec.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 设备购置计划
 */
@Data
public class ElecDevPlanVo implements Serializable{
    /**
     * 购置计划ID,主键ID
     */
    private String id;
    /**
     * 计划购置设备名称
     */
    private String devName;
    /**
     * 数量
     */
    private Integer quality;
    /**
     * 金额
     */
    private Double devExpense;
    /**
     * 规格型号
     */
    private String specType;
    /**
     * 用途
     */
    private String useness;
    /**
     * 使用单位
     */
    private String useUnit;
    /**
     * 配置
     */
    private String configure;
}
