package com.jiuge;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jiuge.dao")
public class JiugeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiugeApplication.class, args);
    }

}
