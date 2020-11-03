package com.hengzhi.springboot03config;

import com.hengzhi.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//加载外部的spring配置文件
//@ImportResource(value = "classpath:xxx.xml")

@SpringBootApplication
@ComponentScan({"com.hengzhi.controller","com.hengzhi.bean"})
public class Springboot03ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03ConfigApplication.class, args);
    }

}
