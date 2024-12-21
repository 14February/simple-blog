package com.yr.simpleblog;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.yr.simpleblog"})
@MapperScan("com.yr.simpleblog.dao")
public class SimpleBlogApplication {
    public static void main(String[] args) {


        try {

            SpringApplication.run(SimpleBlogApplication.class, args);
        } catch (Throwable e) {
            e.printStackTrace();
        }

    }
}