package cn.itcast.admin.mapper;

import cn.itcast.admin.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMapper {
    //查询全部产品
    @Select("select * from product")
    List<Product> findAll();
}
