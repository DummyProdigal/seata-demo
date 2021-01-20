package pers.bingo.seata.storage.service;

import java.util.Map;

public interface StorageService {

    /**
     * 扣除存储数量
     */
    void deduct(Map<String, Object> params) throws Exception;
}