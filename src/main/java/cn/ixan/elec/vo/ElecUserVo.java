package cn.ixan.elec.vo;

import java.io.Serializable;

/**
 * 用户表
 */
public class ElecUserVo implements Serializable {
    /**
     * 主键ID
     */
    private String userId;
    /**
     * 登录名
     */
    private String logonName;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 性别
     */
    private String sexId;
    /**
     * 所属单位code
     */
    private String jctId;
    /**
     * 职位（主要用于工作流审核）
     */
    private String postId;
    /**
     * 联系电话
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
     * 入职时间
     */
    private String onDutyDate;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLogonName() {
        return logonName;
    }

    public void setLogonName(String logonName) {
        this.logonName = logonName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSexId() {
        return sexId;
    }

    public void setSexId(String sexId) {
        this.sexId = sexId;
    }

    public String getJctId() {
        return jctId;
    }

    public void setJctId(String jctId) {
        this.jctId = jctId;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOnDutyDate() {
        return onDutyDate;
    }

    public void setOnDutyDate(String onDutyDate) {
        this.onDutyDate = onDutyDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}