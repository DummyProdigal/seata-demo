package pers.bingo.saeta.common.client;

import com.alibaba.fastjson.JSON;
import io.seata.core.context.RootContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @Author GouBin
 * @Date 2021/1/15
 * @Version 1.0
 * @Modified_By
 */
@Component
//@RequiredArgsConstructor(onConstructor_ = {@Autowired})
@Slf4j
public class BusinessClient {

    @Autowired
    private RestTemplate restTemplate;

    public void request(String url, Map<String, Object> params) {
        log.info("to {}：[{}]", url, RootContext.getXID());
        ResponseEntity<String> response = restTemplate.postForEntity(url, JSON.toJSON(params), String.class);
        if (!response.getStatusCode().is2xxSuccessful()) {
            throw new HttpClientErrorException(response.getStatusCode());
        }
    }
}
