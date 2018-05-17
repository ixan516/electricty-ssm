package cn.ixan.elec.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ElecStationVo implements Serializable{
    /**
     * 站点ID,主键ID
     */
    private String id;
    /**
     * 所属单位(对应字典表)
     */
    private String jctId;
    /**
     * 归属地
     */
    private String attributeGround;
    /**
     * 站点代号
     */
    private String stationCode;
    /**
     * 站点名称
     */
    private String stationName;
    /**
     * 站点类别(对应字典表)
     */
    private String stationType;
    /**
     * 通讯方式
     */
    private String contacType;
    /**
     * 安装地点
     */
    private String installAddress;
    /**
     * 备注
     */
    private String comment;
}
