package cn.itcast.admin.service.impl;

import cn.itcast.admin.domain.Product;
import cn.itcast.admin.mapper.ProductMapper;
import cn.itcast.admin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        List<Product> list = productMapper.findAll();
        return list;
    }
}
