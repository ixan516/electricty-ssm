package cn.ixan.elec.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 运行情况
 */
@Data
public class ElecRunVo implements Serializable{
    /**
     * 运行情况,主键ID
     */
    private String id;
    /**
     * 所属单位
     */
    private String jctId;
    /**
     * 站点名称
     */
    private String stationName;
    /**
     * 故障类型(对应字典表)
     */
    private String bugType;
    /**
     * 故障发生时间
     */
    private Date occurDate;
    /**
     * 故障原因
     */
    private String bugReason;
    /**
     * 上报年月
     */
    private String sbmonth;
    /**
     * 备注，恢复情况
     */
    private String comment;
}
