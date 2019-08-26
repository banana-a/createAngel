package com.miracle.ca.back.comment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-22 12:35
 **/

@SpringBootApplication
@MapperScan(basePackages = "com.miracle.ca.back.comment.mapper")
public class CommentApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommentApplication.class, args);
    }
}
