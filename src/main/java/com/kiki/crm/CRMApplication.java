package com.kiki.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.kiki.crm.dao"})
public class CRMApplication {
    public static void main(String[] args) {
        SpringApplication.run(CRMApplication.class);
    }
}
