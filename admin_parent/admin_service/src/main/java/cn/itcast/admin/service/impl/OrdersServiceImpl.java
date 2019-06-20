package cn.itcast.admin.service.impl;

import cn.itcast.admin.domain.Orders;
import cn.itcast.admin.mapper.OrdersMapper;
import cn.itcast.admin.service.OrdersService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public List<Orders> findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Orders> list = ordersMapper.findAll();
        return list;
    }
}
