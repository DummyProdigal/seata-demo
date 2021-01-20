package pers.bingo.seata.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.bingo.seata.order.dao.OrderDAO;
import pers.bingo.seata.order.entity.Order;
import pers.bingo.seata.order.service.OrderService;

import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAO orderDAO;

    public void create(Map<String, Object> params) throws Exception {

//        int orderMoney = calculate(commodityCode, orderCount);

//        accountService.debit(userId, orderMoney);

        Order order = new Order();
        order.setUserId(String.valueOf(params.get("userId")));
        order.setCommodityCode(String.valueOf(params.get("commodityCode")));
        order.setCount(Integer.valueOf(String.valueOf(params.get("orderCount"))));
        order.setMoney(50);

        orderDAO.createOrder(order);
    }

    private int calculate(String commodityCode, int orderCount) {
        return 0;
    }


}