package cn.ixan.elec.vo;

import java.io.Serializable;
import java.sql.Timestamp;

public class ElecCommonMsgVo implements Serializable{

    private String comId;

    private String stationRun;

    private String devRun;

    private String createDate;

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getStationRun() {
        return stationRun;
    }

    public void setStationRun(String stationRun) {
        this.stationRun = stationRun;
    }

    public String getDevRun() {
        return devRun;
    }

    public void setDevRun(String devRun) {
        this.devRun = devRun;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "ElecCommonMsgVo{" +
                "comId='" + comId + '\'' +
                ", stationRun='" + stationRun + '\'' +
                ", devRun='" + devRun + '\'' +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
