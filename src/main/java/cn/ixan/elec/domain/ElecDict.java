package cn.ixan.elec.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 字典表实体
 * 树形表格
 */
public class ElecDict {
    private Integer id;

    @JsonProperty(value = "_parentId")
    private Integer pId;

    private String dictName;

    private String isParent;

    private String state = "closed";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getIsParent() {
        return isParent;
    }

    public void setIsParent(String isParent) {
        this.isParent = isParent;
    }
}