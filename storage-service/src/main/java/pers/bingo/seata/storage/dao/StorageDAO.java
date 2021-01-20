package pers.bingo.seata.storage.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @Author GouBin
 * @Date 2021/1/18
 * @Version 1.0
 * @Modified_By
 */
@Repository
public interface StorageDAO {

    int getCount(@Param("commodityCode") String commodityCode);

    void updateRepertory(@Param("commodityCode") String commodityCode, @Param("count") Integer count);
}
