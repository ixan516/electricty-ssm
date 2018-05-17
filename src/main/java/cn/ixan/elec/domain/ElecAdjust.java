package cn.ixan.elec.domain;

import java.util.Date;

public class ElecAdjust {
    private Integer adjustid;

    private Integer equapmentid;

    private String jctid;

    private String devname;

    private String adjustperiod;

    private String apunit;

    private Date usedate;

    private String devtype;

    private Date startdate;

    private String ishaving;

    private String comment;

    private String record;

    public Integer getAdjustid() {
        return adjustid;
    }

    public void setAdjustid(Integer adjustid) {
        this.adjustid = adjustid;
    }

    public Integer getEquapmentid() {
        return equapmentid;
    }

    public void setEquapmentid(Integer equapmentid) {
        this.equapmentid = equapmentid;
    }

    public String getJctid() {
        return jctid;
    }

    public void setJctid(String jctid) {
        this.jctid = jctid == null ? null : jctid.trim();
    }

    public String getDevname() {
        return devname;
    }

    public void setDevname(String devname) {
        this.devname = devname == null ? null : devname.trim();
    }

    public String getAdjustperiod() {
        return adjustperiod;
    }

    public void setAdjustperiod(String adjustperiod) {
        this.adjustperiod = adjustperiod == null ? null : adjustperiod.trim();
    }

    public String getApunit() {
        return apunit;
    }

    public void setApunit(String apunit) {
        this.apunit = apunit == null ? null : apunit.trim();
    }

    public Date getUsedate() {
        return usedate;
    }

    public void setUsedate(Date usedate) {
        this.usedate = usedate;
    }

    public String getDevtype() {
        return devtype;
    }

    public void setDevtype(String devtype) {
        this.devtype = devtype == null ? null : devtype.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public String getIshaving() {
        return ishaving;
    }

    public void setIshaving(String ishaving) {
        this.ishaving = ishaving == null ? null : ishaving.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }
}