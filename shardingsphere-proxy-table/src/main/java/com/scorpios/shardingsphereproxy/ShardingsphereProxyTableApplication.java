package com.scorpios.shardingsphereproxy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.scorpios.shardingsphereproxy.mapper")
public class ShardingsphereProxyTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingsphereProxyTableApplication.class, args);
    }

}
