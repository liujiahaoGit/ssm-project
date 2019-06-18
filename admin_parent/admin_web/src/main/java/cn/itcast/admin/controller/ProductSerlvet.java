package cn.itcast.admin.controller;

import cn.itcast.admin.domain.Product;
import cn.itcast.admin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductSerlvet {
    @Autowired
    private ProductService productService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(ModelAndView modelAndView){
        List<Product> list = productService.findAll();
        modelAndView.addObject("productList",list);
        modelAndView.setViewName("product_list");
        return modelAndView;
    }
}
