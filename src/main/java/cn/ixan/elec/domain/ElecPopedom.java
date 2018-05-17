package cn.ixan.elec.domain;

import lombok.Data;

@Data
public class ElecPopedom extends ElecPopedomKey {
    /**
     * 菜单名称
     */
    private String name;
    /**
     * 路径
     */
    private String page;
    /**
     * 是否顶级节点
     */
    private Boolean isParent;

}