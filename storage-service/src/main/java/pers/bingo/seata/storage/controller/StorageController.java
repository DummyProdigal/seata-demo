package pers.bingo.seata.storage.controller;

import io.seata.core.context.RootContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.bingo.seata.storage.service.StorageService;

import java.util.Map;

/**
 * @Author GouBin
 * @Date 2021/1/15
 * @Version 1.0
 * @Modified_By
 */
@RestController
@RequestMapping("/api/storage")
public class StorageController {

    @Autowired
    private StorageService storageService;

    @PostMapping(value = "/deduct")
    public void debit(@RequestBody Map<String, Object> params) throws Exception {
        System.out.println(RootContext.getXID());
        storageService.deduct(params);
    }
}
