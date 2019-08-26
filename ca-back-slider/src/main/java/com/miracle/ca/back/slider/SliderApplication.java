package com.miracle.ca.back.slider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-19 18:11
 **/

@SpringBootApplication
@MapperScan(basePackages = "com.miracle.ca.back.slider.mapper")
public class SliderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SliderApplication.class, args);
    }
}
