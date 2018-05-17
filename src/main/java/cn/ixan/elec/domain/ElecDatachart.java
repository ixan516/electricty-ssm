package cn.ixan.elec.domain;

public class ElecDatachart {
    private Integer datachartid;

    private String jctid;

    private String belongto;

    private String datachartname;

    private String comment;

    public Integer getDatachartid() {
        return datachartid;
    }

    public void setDatachartid(Integer datachartid) {
        this.datachartid = datachartid;
    }

    public String getJctid() {
        return jctid;
    }

    public void setJctid(String jctid) {
        this.jctid = jctid == null ? null : jctid.trim();
    }

    public String getBelongto() {
        return belongto;
    }

    public void setBelongto(String belongto) {
        this.belongto = belongto == null ? null : belongto.trim();
    }

    public String getDatachartname() {
        return datachartname;
    }

    public void setDatachartname(String datachartname) {
        this.datachartname = datachartname == null ? null : datachartname.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}