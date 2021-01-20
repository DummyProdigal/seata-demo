package pers.bingo.seata.order.entity;

import lombok.Data;

/**
 * @Author GouBin
 * @Date 2021/1/13
 * @Version 1.0
 * @Modified_By
 */
@Data
public class Order {

    private Integer id;

    private String userId;
    private String commodityCode;
    private Integer count;
    private Integer money;
}
