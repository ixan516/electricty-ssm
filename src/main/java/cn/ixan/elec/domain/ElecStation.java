package cn.ixan.elec.domain;

import java.util.Date;

/**
 * 站点信息
 */
public class ElecStation {
    /**
     * 主键ID
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
     * 站点代号
     */
    private String stationCode;
    /**
     * 使用时间
     */
    private Date useStartDate;
    /**
     * 安装地点
     */
    private String installAddress;
    /**
     * 生产厂家
     */
    private String produceHome;
    /**
     * 联系方式
     */
    private String contactType;
    /**
     * 站点类别
     */
    private String stationType;
    /**
     * 归属地
     */
    private String attributeGround;
    /**
     * 备注
     */
    private String comment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getJctId() {
        return jctId;
    }

    public void setJctId(String jctId) {
        this.jctId = jctId == null ? null : jctId.trim();
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode == null ? null : stationCode.trim();
    }

    public Date getUseStartDate() {
        return useStartDate;
    }

    public void setUseStartDate(Date useStartDate) {
        this.useStartDate = useStartDate;
    }

    public String getInstallAddress() {
        return installAddress;
    }

    public void setInstallAddress(String installAddress) {
        this.installAddress = installAddress == null ? null : installAddress.trim();
    }

    public String getProduceHome() {
        return produceHome;
    }

    public void setProduceHome(String produceHome) {
        this.produceHome = produceHome == null ? null : produceHome.trim();
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType == null ? null : contactType.trim();
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType == null ? null : stationType.trim();
    }

    public String getAttributeGround() {
        return attributeGround;
    }

    public void setAttributeGround(String attributeGround) {
        this.attributeGround = attributeGround == null ? null : attributeGround.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}