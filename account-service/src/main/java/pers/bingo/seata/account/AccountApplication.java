package pers.bingo.seata.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import pers.bingo.saeta.common.config.SeataRestTemplateAutoConfiguration;

/**
 * @Author GouBin
 * @Date 2021/1/12
 * @Version 1.0
 * @Modified_By
 */
@SpringBootApplication
@MapperScan("pers.bingo.seata.account.dao")
@Import({SeataRestTemplateAutoConfiguration.class})
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }
}
