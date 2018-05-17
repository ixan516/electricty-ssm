package cn.ixan.elec.domain;

public class ElecElecfileupload {
    private Integer fileuploadid;

    private Integer bugid;

    private Integer planid;

    private String filefilename;

    private String filecontenttype;

    private Integer adjustid;

    private Integer repairid;

    private byte[] file;

    public Integer getFileuploadid() {
        return fileuploadid;
    }

    public void setFileuploadid(Integer fileuploadid) {
        this.fileuploadid = fileuploadid;
    }

    public Integer getBugid() {
        return bugid;
    }

    public void setBugid(Integer bugid) {
        this.bugid = bugid;
    }

    public Integer getPlanid() {
        return planid;
    }

    public void setPlanid(Integer planid) {
        this.planid = planid;
    }

    public String getFilefilename() {
        return filefilename;
    }

    public void setFilefilename(String filefilename) {
        this.filefilename = filefilename == null ? null : filefilename.trim();
    }

    public String getFilecontenttype() {
        return filecontenttype;
    }

    public void setFilecontenttype(String filecontenttype) {
        this.filecontenttype = filecontenttype == null ? null : filecontenttype.trim();
    }

    public Integer getAdjustid() {
        return adjustid;
    }

    public void setAdjustid(Integer adjustid) {
        this.adjustid = adjustid;
    }

    public Integer getRepairid() {
        return repairid;
    }

    public void setRepairid(Integer repairid) {
        this.repairid = repairid;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }
}