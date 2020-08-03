package com.zoomride;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zoomride.mapper")
public class EliteTourApplication {

    public static void main(String[] args) {
        SpringApplication.run(EliteTourApplication.class, args);
    }

}
