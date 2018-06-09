package com.imooc.sell.dao;

import com.imooc.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailDao extends JpaRepository<OrderDetail,String > {

    List<OrderDetail> findByOrderId(String orderId);
}
