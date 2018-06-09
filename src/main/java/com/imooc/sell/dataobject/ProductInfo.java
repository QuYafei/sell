package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    /** 库存.*/
    private Integer productStock;

    private String productDescription;

    private String productIcon;

    /** 状态，0正常1下架*/
    private Integer productStatus;
    /** 类目编号 .*/
    private Integer categoryType;

}
