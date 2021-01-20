package pers.bingo.seata.business.service.impl;

import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.bingo.saeta.common.client.BusinessClient;
import pers.bingo.seata.business.service.BusinessService;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author GouBin
 * @Date 2021/1/15
 * @Version 1.0
 * @Modified_By
 */
@Service
@Slf4j
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessClient businessClient;

    @Override
    @GlobalTransactional(rollbackFor = {Exception.class})
    public void purchase(Map<String, Object> params) throws Exception {
        log.info("begin : [{}]", RootContext.getXID());
        Map<String, Object> storageMap = new HashMap<>();
        storageMap.put("commodityCode", params.get("commodityCode"));
        storageMap.put("count", params.get("count"));
        businessClient.request("http://127.0.0.1:8003/storage/api/storage/deduct", storageMap);

        businessClient.request("http://127.0.0.1:8002/order/api/order/debit", params);
    }
}
