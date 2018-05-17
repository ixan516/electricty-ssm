package cn.ixan.elec.enums;

public enum StatusEnums {

    /**
     * 字典表中所有类别
     */
    TYPE_OF_DEVICE("1","设备类型","字典表中的类型名称"),
    STATUS_OF_DEVICE("2","设备状态","字典表中的类型名称"),
    TYPE_OF_COMPANY("3","公司类型","字典表中的类型名称"),
    TYPE_OF_FAULT("4","故障类型","字典表中的类型名称"),
    TYPE_OF_STATION("5","站点类别","字典表中的类型名称"),
    TYPE_OF_BUILD("6","建筑类型","字典表中的类型名称"),
    REGIONS_OF_DICT("7","所属单位","字典表中的类型名称"),
    POSITION_OF_DICT("8","职位","字典表中的类型名称"),
    TYPE_OF_DRAW("9","图纸类别","字典表中的类型名称"),
    STATUS_OF_CHECK("10","审核状态","字典表中的类型名称"),
    SEX_OF_DICT("11","性别","字典表中的类型名称"),
    AREA_OF_DICT("12","所属地区","字典表中的类型名称"),
    STATUS_OF_DUTY("13","在职状态","字典表中的类型名称"),

    // 数据为空
    EMPTY_OF_DICT("0","数据为空","字典表")
    ;
    /**
     * 枚举代码
     */
    private String code;
    /**
     * 携带信息
     */
    private String msg;
    /**
     * 描述
     */
    private String desc;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public String getDesc() {
        return desc;
    }

    StatusEnums() {
    }
    StatusEnums(String code, String msg, String desc) {
        this.code = code;
        this.msg = msg;
        this.desc = desc;
    }

}
