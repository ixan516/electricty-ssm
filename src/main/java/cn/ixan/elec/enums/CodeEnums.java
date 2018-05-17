package cn.ixan.elec.enums;

public enum CodeEnums {
    SUCCESS(200,"成功","操作状态"),
    FAILURE(500,"失败","操作状态");
    private Integer code;
    private String msg;
    private String desc;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    CodeEnums() {
    }

    CodeEnums(Integer code, String msg, String desc) {
        this.code = code;
        this.msg = msg;
        this.desc = desc;
    }
}
