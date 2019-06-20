package cn.itcast.admin.service;

import cn.itcast.admin.domain.Orders;

import java.util.List;

public interface OrdersService {


    //查询全部订单
    List<Orders> findAll(int pageNum, int pageSize);
}
