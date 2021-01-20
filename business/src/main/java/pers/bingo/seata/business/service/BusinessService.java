package pers.bingo.seata.business.service;

import java.util.Map;

/**
 * @Author GouBin
 * @Date 2021/1/15
 * @Version 1.0
 * @Modified_By
 */
public interface BusinessService {
    void purchase(Map<String, Object> params) throws Exception;
}
