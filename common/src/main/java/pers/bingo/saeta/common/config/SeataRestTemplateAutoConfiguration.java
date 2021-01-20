package pers.bingo.saeta.common.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;
import pers.bingo.saeta.common.interceptor.SeataRestTemplateInterceptor;

import java.util.List;

@Configuration
@ComponentScan("pers.bingo")
public class SeataRestTemplateAutoConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    @ConditionalOnBean(RestTemplate.class)
    public SeataRestTemplateInterceptor seataRestTemplateInterceptor(RestTemplate restTemplate) {
        if (restTemplate != null) {

            List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
            interceptors.add(new SeataRestTemplateInterceptor());
            restTemplate.setInterceptors(interceptors);
        }
        return new SeataRestTemplateInterceptor();
    }
}