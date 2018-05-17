package cn.ixan.elec.domain;

import java.util.Date;

public class ElecApproveinfo {
    private Integer approveid;

    private String comment;

    private Boolean approval;

    private Date approvetime;

    private Integer applicationid;

    private String approveuserid;

    public Integer getApproveid() {
        return approveid;
    }

    public void setApproveid(Integer approveid) {
        this.approveid = approveid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Boolean getApproval() {
        return approval;
    }

    public void setApproval(Boolean approval) {
        this.approval = approval;
    }

    public Date getApprovetime() {
        return approvetime;
    }

    public void setApprovetime(Date approvetime) {
        this.approvetime = approvetime;
    }

    public Integer getApplicationid() {
        return applicationid;
    }

    public void setApplicationid(Integer applicationid) {
        this.applicationid = applicationid;
    }

    public String getApproveuserid() {
        return approveuserid;
    }

    public void setApproveuserid(String approveuserid) {
        this.approveuserid = approveuserid == null ? null : approveuserid.trim();
    }
}