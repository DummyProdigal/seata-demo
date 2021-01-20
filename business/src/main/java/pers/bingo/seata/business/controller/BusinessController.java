package pers.bingo.seata.business.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.bingo.seata.business.service.BusinessService;

import java.util.Map;

/**
 * @Author GouBin
 * @Date 2021/1/15
 * @Version 1.0
 * @Modified_By
 */
@RestController
@RequestMapping("/api/biz")
@Slf4j
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @PostMapping("/purchase")
    public Boolean purchase(@RequestBody Map<String, Object> params) {
        try {
            businessService.purchase(params);
        } catch (Exception e) {
            log.error("异常：", e);
            return false;
        }
        return true;
    }
}
