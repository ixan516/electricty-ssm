package cn.ixan.elec.vo;

import java.io.Serializable;
import java.util.List;

/**
 * EasyUI datagrid要求返回数据的格式
 * @param <T>
 */
public class ResultBean<T> implements Serializable{
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 附加信息
     */
    private String msg;
    /**
     * 总记录数量
     */
    private Integer total;
    /**
     * 数据记录数组
     */
    private List<T> rows;

    public ResultBean() {
        super();
    }

    public ResultBean(Integer total,List<T> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }

    public ResultBean(Throwable e) {
        super();
        this.msg = e.toString();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
