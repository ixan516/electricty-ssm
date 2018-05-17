package cn.ixan.elec.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 字典表Vo
 */
public class ElecDictVo implements Serializable{
    @JsonProperty(value = "id")
    private Integer id;
    @JsonProperty(value = "name")
    private String dictName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }
}