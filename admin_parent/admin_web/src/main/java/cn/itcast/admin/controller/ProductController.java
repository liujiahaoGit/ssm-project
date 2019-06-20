package cn.itcast.admin.controller;

import cn.itcast.admin.domain.Product;
import cn.itcast.admin.service.ProductService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     * 查看全部
     * @param modelAndView
     * @return
     */
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(ModelAndView modelAndView, @RequestParam(value = "page",defaultValue ="1") int pageNum,
                                @RequestParam(value = "size",defaultValue = "4") int pageSize){
        List<Product> list = productService.findAll(pageNum,pageSize);
        PageInfo pageInfo=new PageInfo(list);
        modelAndView.addObject("pageInfo",pageInfo);
        modelAndView.setViewName("product_list");
        return modelAndView;
    }

    /**
     * 增加产品数据
     * @param product
     * @return
     */
    @RequestMapping("/add.do")
    public String add(Product product){
        productService.add(product);
        return "redirect:/product/findAll.do";
    }
}
