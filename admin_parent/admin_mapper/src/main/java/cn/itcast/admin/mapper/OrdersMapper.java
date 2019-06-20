package cn.itcast.admin.mapper;

import cn.itcast.admin.domain.Orders;
import cn.itcast.admin.domain.Product;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrdersMapper {
    //查询全部订单

    @Select("select * from orders")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "orderNum", column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "product",column = "productid",javaType = Product.class,
            one = @One(select = "cn.itcast.admin.mapper.ProductMapper.findById"))
    })
    List<Orders> findAll();
}
