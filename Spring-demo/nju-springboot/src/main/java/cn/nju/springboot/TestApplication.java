package cn.nju.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: Gu Yaming
 * @Description:
 * @Date:Create：in 2019/9/6 11:06
 * @Modified By：
 */
@EnableAutoConfiguration
@ComponentScan     //扫描该类所在的包
@SpringBootApplication //组合注解 相当于@EnableAutoConfiguration @SpringBootConfiguration @ComponentScan的组合
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
