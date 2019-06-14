package com.cloud2.hysdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class ZCloud2HystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZCloud2HystrixDashboardApplication.class, args);
    }

}
