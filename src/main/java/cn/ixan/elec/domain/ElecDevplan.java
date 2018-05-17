package cn.ixan.elec.domain;

import java.util.Date;

public class ElecDevplan {
    private Integer id;

    private String devType;

    private String devName;

    private String tradeMark;

    private String specType;

    private String produceHome;

    private Integer quality;

    private String qunit;

    private String useness;

    private String produceArea;

    private Double devExpense;

    private String useUnit;

    private String jctId;

    private Date planDate;

    private String adjustPeriod;

    private String apUnit;

    private String repairCycle;

    private String opUnit;

    private String configure;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDevType() {
        return devType;
    }

    public void setDevType(String devType) {
        this.devType = devType == null ? null : devType.trim();
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName == null ? null : devName.trim();
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark == null ? null : tradeMark.trim();
    }

    public String getSpecType() {
        return specType;
    }

    public void setSpecType(String specType) {
        this.specType = specType == null ? null : specType.trim();
    }

    public String getProduceHome() {
        return produceHome;
    }

    public void setProduceHome(String produceHome) {
        this.produceHome = produceHome == null ? null : produceHome.trim();
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public String getQunit() {
        return qunit;
    }

    public void setQunit(String qunit) {
        this.qunit = qunit == null ? null : qunit.trim();
    }

    public String getUseness() {
        return useness;
    }

    public void setUseness(String useness) {
        this.useness = useness == null ? null : useness.trim();
    }

    public String getProduceArea() {
        return produceArea;
    }

    public void setProduceArea(String produceArea) {
        this.produceArea = produceArea == null ? null : produceArea.trim();
    }

    public Double getDevExpense() {
        return devExpense;
    }

    public void setDevExpense(Double devExpense) {
        this.devExpense = devExpense;
    }

    public String getUseUnit() {
        return useUnit;
    }

    public void setUseUnit(String useUnit) {
        this.useUnit = useUnit == null ? null : useUnit.trim();
    }

    public String getJctId() {
        return jctId;
    }

    public void setJctId(String jctId) {
        this.jctId = jctId == null ? null : jctId.trim();
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public String getAdjustPeriod() {
        return adjustPeriod;
    }

    public void setAdjustPeriod(String adjustPeriod) {
        this.adjustPeriod = adjustPeriod == null ? null : adjustPeriod.trim();
    }

    public String getApUnit() {
        return apUnit;
    }

    public void setApUnit(String apUnit) {
        this.apUnit = apUnit == null ? null : apUnit.trim();
    }

    public String getRepairCycle() {
        return repairCycle;
    }

    public void setRepairCycle(String repairCycle) {
        this.repairCycle = repairCycle == null ? null : repairCycle.trim();
    }

    public String getOpUnit() {
        return opUnit;
    }

    public void setOpUnit(String opUnit) {
        this.opUnit = opUnit == null ? null : opUnit.trim();
    }

    public String getConfigure() {
        return configure;
    }

    public void setConfigure(String configure) {
        this.configure = configure == null ? null : configure.trim();
    }
}