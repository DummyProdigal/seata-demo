package pers.bingo.seata.order.dao;

import org.springframework.stereotype.Repository;
import pers.bingo.seata.order.entity.Order;

/**
 * @Author GouBin
 * @Date 2021/1/13
 * @Version 1.0
 * @Modified_By
 */
@Repository
public interface OrderDAO {
    void createOrder(Order order);
}
