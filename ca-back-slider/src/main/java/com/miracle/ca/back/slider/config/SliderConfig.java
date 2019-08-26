package com.miracle.ca.back.slider.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-19 19:18
 **/

@Component
public class SliderConfig {

    @Bean
    public CommonsMultipartResolver getResolver(){
        return new CommonsMultipartResolver();
    }

}
