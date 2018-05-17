package cn.ixan.elec.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 运行情况
 */
@Data
public class ElecRun implements Serializable{
    /**
     * 主键ID
     */
    private String id;
    /**
     * 站点ID
     */
    private String stationId;
    /**
     * 故障类型
     */
    private String bugType;
    /**
     * 故障发生时间
     */
    private Date occurDate;
    /**
     * 生产厂家
     */
    private String produceHome;
    /**
     * 故障描述
     */
    private String bugDesc;
    /**
     * 处理时间
     */
    private Date resolveDate;
    /**
     * 处理方法
     */
    private String resolveMethod;
    /**
     * 故障原因
     */
    private String bugReason;
    /**
     * 上报月份
     */
    private String sbMonth;
    /**
     * 恢复情况
     */
    private String comment;

}