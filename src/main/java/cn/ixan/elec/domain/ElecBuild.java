package cn.ixan.elec.domain;

import java.util.Date;

public class ElecBuild {
    /**
     * 主键ID
     */
    private String id;
    /**
     * 所属单位
     */
    private String jctId;
    /**
     * 建筑名称
     */
    private String buildName;
    /**
     * 建筑类型
     */
    private String buildType;
    /**
     * 建筑层数
     */
    private Integer buildLayer;
    /**
     * 建筑面积
     */
    private Double buildArea;
    /**
     * 始建时间
     */
    private Date buildStartDate;
    /**
     * 扩建时间
     */
    private Date extendBuildDate;
    /**
     * 扩建面积
     */
    private Double extendBuildArea;
    /**
     * 大修时间
     */
    private Date dxDate;
    /**
     * 造价
     */
    private Double buildExpense;
    /**
     * 使用时间
     */
    private Date useDate;
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

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName == null ? null : buildName.trim();
    }

    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType == null ? null : buildType.trim();
    }

    public Integer getBuildLayer() {
        return buildLayer;
    }

    public void setBuildLayer(Integer buildLayer) {
        this.buildLayer = buildLayer;
    }

    public Double getBuildArea() {
        return buildArea;
    }

    public void setBuildArea(Double buildArea) {
        this.buildArea = buildArea;
    }

    public Date getBuildStartDate() {
        return buildStartDate;
    }

    public void setBuildStartDate(Date buildStartDate) {
        this.buildStartDate = buildStartDate;
    }

    public Date getExtendBuildDate() {
        return extendBuildDate;
    }

    public void setExtendBuildDate(Date extendBuildDate) {
        this.extendBuildDate = extendBuildDate;
    }

    public Double getExtendBuildArea() {
        return extendBuildArea;
    }

    public void setExtendBuildArea(Double extendBuildArea) {
        this.extendBuildArea = extendBuildArea;
    }

    public Date getDxDate() {
        return dxDate;
    }

    public void setDxDate(Date dxDate) {
        this.dxDate = dxDate;
    }

    public Double getBuildExpense() {
        return buildExpense;
    }

    public void setBuildExpense(Double buildExpense) {
        this.buildExpense = buildExpense;
    }

    public Date getUseDate() {
        return useDate;
    }

    public void setUseDate(Date useDate) {
        this.useDate = useDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}