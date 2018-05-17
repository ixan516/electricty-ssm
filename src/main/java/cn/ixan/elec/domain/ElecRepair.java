package cn.ixan.elec.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 设备校准检修
 */
@Data
public class ElecRepair implements Serializable{
    /**
     * 仪器校准,主键ID
     */
    private String id;
    /**
     * 设备ID
     */
    private String devId;
    /**
     * 所属单位(对应字典表)
     */
    private String jctId;
    /**
     * 校准周期
     */
    private String repairCycle;
    /**
     * 检修单位
     */
    private String opUnit;
    /**
     * 使用日期
     */
    private Date useDate;
    /**
     * 设备类型
     */
    private String devType;
    /**
     * 开始日期
     */
    private Date startDate;
    /**
     * 设备状态
     */
    private String isHaving;
    /**
     * 备注
     */
    private String comment;
    /**
     * 记录
     */
    private String record;

}