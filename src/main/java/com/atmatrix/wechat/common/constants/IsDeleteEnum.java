package com.atmatrix.wechat.common.constants;

public enum IsDeleteEnum {
    TRUE(1,"删除"),
    FALSE(0,"未删除");

    private Integer code;
    private String name;

    IsDeleteEnum(Integer code,String name){
        this.code = code;
        this.name = name;
    }

    public Integer getCode(){
        return code;
    }

    public String getName(){
        return name;
    }

    public static IsDeleteEnum getByCode(Integer code){
        for (IsDeleteEnum item: IsDeleteEnum.values()) {
            if (item.getCode().equals(code)){
                return item;
            }
        }
        return null;
    }

}
