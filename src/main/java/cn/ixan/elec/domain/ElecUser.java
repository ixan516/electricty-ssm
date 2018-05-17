package cn.ixan.elec.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 */
public class ElecUser implements Serializable {
    /**
     * 主键ID
     */
    private String userId;
    /**
     * 所属单位code
     */
    private String jctId;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 用户名
     */
    private String logonName;
    /**
     * 密码
     */
    private String logonPwd;
    /**
     * 性别
     */
    private String sexId;
    /**
     * 出生日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    /**
     * 联系地址
     */
    private String address;
    /**
     * 联系电话
     */
    private String contactTel;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 是否在职
     */
    private String isDuty;
    /**
     * 职位（主要用于工作流审核）
     */
    private String postId;
    /**
     * 入职时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date onDutyDate;
    /**
     * 离职时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date offDutyDate;
    /**
     * 备注
     */
    private String remark;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getJctId() {
        return jctId;
    }

    public void setJctId(String jctId) {
        this.jctId = jctId == null ? null : jctId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getLogonName() {
        return logonName;
    }

    public void setLogonName(String logonName) {
        this.logonName = logonName == null ? null : logonName.trim();
    }

    public String getLogonPwd() {
        return logonPwd;
    }

    public void setLogonPwd(String logonPwd) {
        this.logonPwd = logonPwd == null ? null : logonPwd.trim();
    }

    public String getSexId() {
        return sexId;
    }

    public void setSexId(String sexId) {
        this.sexId = sexId == null ? null : sexId.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel == null ? null : contactTel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIsDuty() {
        return isDuty;
    }

    public void setIsDuty(String isDuty) {
        this.isDuty = isDuty == null ? null : isDuty.trim();
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId == null ? null : postId.trim();
    }

    public Date getOnDutyDate() {
        return onDutyDate;
    }

    public void setOnDutyDate(Date onDutyDate) {
        this.onDutyDate = onDutyDate;
    }

    public Date getOffDutyDate() {
        return offDutyDate;
    }

    public void setOffDutyDate(Date offDutyDate) {
        this.offDutyDate = offDutyDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}