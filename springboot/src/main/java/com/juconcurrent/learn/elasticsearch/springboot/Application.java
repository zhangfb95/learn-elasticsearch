package com.juconcurrent.learn.elasticsearch.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * @author zhangfubing
 * @create 2019/8/19 20:01
 */
@EnableElasticsearchRepositories("com.juconcurrent")
@SpringBootApplication(scanBasePackages = "com.juconcurrent")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
