package com.example.pgsqldemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class PgsqldemoApplication {

    public static void main(String[] args) {
        log.info("SpringBoot开始加载");
        SpringApplication.run(PgsqldemoApplication.class, args);
        log.info("SpringBoot加载完毕");
    }

}
