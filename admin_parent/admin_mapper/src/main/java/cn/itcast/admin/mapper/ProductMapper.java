package cn.itcast.admin.mapper;

import cn.itcast.admin.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMapper {
    //查询全部产品
    @Select("select * from product")
    List<Product> findAll();

    //添加产品
    @Insert("insert into product (productNum,productName,departureTime,cityName,productPrice,productStatus,productDesc) values(#{productNum},#{productName}," +
            "#{departureTime},#{cityName},#{productPrice},#{productStatus},#{productDesc})")
    void add(Product product);

    //根据id查询product
    @Select("select * from product where id=#{id}")
    Product findById(String id);
}
