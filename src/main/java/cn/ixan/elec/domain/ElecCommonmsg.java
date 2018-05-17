package cn.ixan.elec.domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 运行监控信息
 */
public class ElecCommonmsg implements Serializable{
    private String comId;

    private String stationRun;

    private String devRun;

    private Timestamp createDate;

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId == null ? null : comId.trim();
    }

    public String getStationRun() {
        return stationRun;
    }

    public void setStationRun(String stationRun) {
        this.stationRun = stationRun == null ? null : stationRun.trim();
    }

    public String getDevRun() {
        return devRun;
    }

    public void setDevRun(String devRun) {
        this.devRun = devRun == null ? null : devRun.trim();
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }
}