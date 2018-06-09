package com.imooc.sell.enums;

import lombok.Getter;

@Getter
public enum  ProductStatusEnum {
    UP(0,"在架商品"),
    DOWN(1,"下架商品")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message= message;
    }


}
