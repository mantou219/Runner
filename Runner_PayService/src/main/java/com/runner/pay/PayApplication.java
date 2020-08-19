package com.runner.pay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description:
 * @author: ZackJun
 * @date: 2020/8/19  16:10
 */
@SpringBootApplication
@MapperScan(basePackages = "com.runner.pay.dao")
@EnableTransactionManagement
@EnableDiscoveryClient
public class PayApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayApplication.class,args);
    }
}
