package pers.bingo.seata.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;
import pers.bingo.saeta.common.config.SeataRestTemplateAutoConfiguration;

/**
 * @Author GouBin
 * @Date 2021/1/15
 * @Version 1.0
 * @Modified_By
 */
@SpringBootApplication(scanBasePackages = {"pers.bingo.seata.**"})
@Import({SeataRestTemplateAutoConfiguration.class})
public class BusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessApplication.class, args);
    }
}
