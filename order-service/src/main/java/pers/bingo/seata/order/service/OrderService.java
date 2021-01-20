package pers.bingo.seata.order.service;

import java.util.Map;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Map<String, Object> params) throws Exception;
}