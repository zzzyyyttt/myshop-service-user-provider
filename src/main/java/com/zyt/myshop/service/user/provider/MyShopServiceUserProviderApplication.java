package com.zyt.myshop.service.user.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import sun.applet.Main;
import tk.mybatis.spring.annotation.MapperScan;

@EnableHystrixDashboard
@EnableHystrix
@MapperScan(basePackages = "com.zyt.myshop.commons.mapper")
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = "com.zyt.myshop")
public class MyShopServiceUserProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run (MyShopServiceUserProviderApplication.class, args);
        Main.main (args);
    }
}
