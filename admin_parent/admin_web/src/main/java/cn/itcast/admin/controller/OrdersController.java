package cn.itcast.admin.controller;

import cn.itcast.admin.domain.Orders;
import cn.itcast.admin.service.OrdersService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

   /* *
     * 未分页订单查询
     * @param modelAndView
     * @return*/
   /* @RequestMapping("/findAll.do")
    public ModelAndView findAll(ModelAndView modelAndView){
        List<Orders> list = ordersService.findAll();
        modelAndView.addObject("ordersList",list);
        modelAndView.setViewName("orders-list");
        return modelAndView;
    }
*/
    /**
     * 分页订单查询
     * @param modelAndView
     * @return
     */
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(ModelAndView modelAndView,@RequestParam(value ="page",defaultValue = "1") int pageNum,
       @RequestParam(value = "size",defaultValue = "4") int pageSize){
        List<Orders> list = ordersService.findAll(pageNum,pageSize);
        PageInfo pageInfo =new PageInfo(list);
        modelAndView.addObject("ordersList",pageInfo);
        modelAndView.setViewName("orders-list");
        return modelAndView;
    }
}
