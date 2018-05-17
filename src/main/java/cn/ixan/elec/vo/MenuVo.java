package cn.ixan.elec.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class MenuVo implements Serializable {
    /**
     * 主键ID
     */
    private String id;
    /**
     * 当前节点的父ID
     */
    private String pId;
    /**
     * 当前节点名称
     */
    private String name;
    /**
     * 当前节点地址
     */
    private String page;
    /**
     * 当前节点是否为父节点
     */
    private String isParent;
    /**
     * 当前父节点名称
     */
    private String parentName;
}
