package cn.itcast.admin.service;

import cn.itcast.admin.domain.Product;

import java.util.List;

public interface ProductService {
    //查询全部产品
    List<Product> findAll();
}
