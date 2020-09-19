package com.hengzhi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hengzhi.controller")
public class MainApplication {
    public static void main(String[] args) {
        //启动SpringBoot应用
        SpringApplication.run(MainApplication.class,args);//传入主程序类的class对象
    }
}
