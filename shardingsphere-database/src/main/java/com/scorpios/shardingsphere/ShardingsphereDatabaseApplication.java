package com.scorpios.shardingsphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.scorpios.shardingsphere.mapper")
public class ShardingsphereDatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingsphereDatabaseApplication.class, args);
    }

}
