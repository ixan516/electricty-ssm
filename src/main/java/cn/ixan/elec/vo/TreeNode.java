package cn.ixan.elec.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 节点树
 */
@Data
public class TreeNode implements Serializable{
    /**
     * 当前节点Id
     */
    private String id;
    /**
     * 当前节点名称
     */
    private String text;
    /**
     * 当前节点的子节点
     */
    private List<TreeNode> children;
}
