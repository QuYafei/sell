package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    ProductInfo findOne(String productId);

    /** 查询所有在架商品列表.*/
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存 取消订单 加
    void increaseStock(List<CartDTO> cartDTOS);

    //减库存 下订单 减
    void decreaseStock(List<CartDTO> cartDTOS);
}
