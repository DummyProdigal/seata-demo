package pers.bingo.seata.storage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.bingo.seata.storage.dao.StorageDAO;
import pers.bingo.seata.storage.service.StorageService;

import java.util.Map;

/**
 * @Author GouBin
 * @Date 2021/1/18
 * @Version 1.0
 * @Modified_By
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageDAO storageDao;

    @Override
    public void deduct(Map<String, Object> params) throws Exception {
        String code = String.valueOf(params.get("commodityCode"));
        int count = storageDao.getCount(code);
        count = count - Integer.valueOf(String.valueOf(params.get("count")));
        if (count < 0) {
            throw new Exception("库存不足");
        }
        storageDao.updateRepertory(code, count);
    }
}
