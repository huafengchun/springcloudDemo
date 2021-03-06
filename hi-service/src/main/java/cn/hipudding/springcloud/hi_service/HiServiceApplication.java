package cn.hipudding.springcloud.hi_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HiServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(HiServiceApplication.class, args);
    }
}
