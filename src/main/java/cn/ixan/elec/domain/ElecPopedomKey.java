package cn.ixan.elec.domain;

public class ElecPopedomKey {
    /**
     * 当前节点ID
     */
    private String id;
    /**
     * 当前父节点ID
     */
    private String pId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }
}