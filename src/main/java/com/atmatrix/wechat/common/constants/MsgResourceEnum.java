package com.atmatrix.wechat.common.constants;

public enum MsgResourceEnum {

    MAC(1, "Mac"),
    ANDROID(2, "Android");

    private Integer code;
    private String name;

    MsgResourceEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static MsgResourceEnum getByCode(Integer code) {
        for (MsgResourceEnum item : MsgResourceEnum.values()) {
            if (item.getCode().equals(code)) {
                return item;
            }
        }
        return null;
    }

}
