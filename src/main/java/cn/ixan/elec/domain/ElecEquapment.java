package cn.ixan.elec.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 仪器设备表
 */
@Data
public class ElecEquapment implements Serializable {
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
     * 所属单位(关联字典表)
     */
    private String jctId;
    /**
     * 设备类型
     */
    private String devType;
    /**
     * 数量
     */
    private Integer quality;
    /**
     *  数量单位
     */
    private String qunit;
    /**
     * 金额
     */
    private Double devExpense;
    /**
     * 使用单位
     */
    private String useUnit;
    /**
     * 配置
     */
    private String configure;
    /**
     * 规格类型
     */
    private String specType;
    /**
     * 品牌
     */
    private String tradeMark;
    /**
     * 设备状态(对应字典表)
     */
    private String devState;
    /**
     * 厂家
     */
    private String produceHome;
    /**
     * 产地
     */
    private String produceArea;
    /**
     * 用途
     */
    private String useness;
    /**
     * 检修周期
     */
    private String repairCycle;
    /**
     *  检修单位
     */
    private String opUnit;
    /**
     * 使用日期
     */
    private Date useDate;
    /**
     * 开始计划时间
     */
    private Date planDate;
    /**
     * 校准周期
     */
    private String adjustPeriod;
    /**
     * 校准单位
     */
    private String apUnit;
    /**
     * 运行描述
     */
    private String runDesc;
    /**
     * 备注
     */
    private String comment;

}