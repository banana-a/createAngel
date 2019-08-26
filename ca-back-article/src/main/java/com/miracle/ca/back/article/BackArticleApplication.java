package com.miracle.ca.back.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-19 09:41
 **/

@SpringBootApplication
@MapperScan(basePackages = "com.miracle.ca.back.article.mapper")
public class BackArticleApplication {
    public static void main(String[] args) {
        SpringApplication.run(BackArticleApplication.class, args);
    }
}
