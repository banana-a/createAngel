package com.miracle.ca.back.slider.service;

import com.miracle.ca.back.slider.entity.CaSlider;
import com.miracle.ca.back.slider.mapper.CaSliderMapper;
import com.miracle.util.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-19 18:27
 **/

@Service
public class SliderService {

    @Autowired
    CaSliderMapper sliderMapper;

    public void updateSlider(int slider_num,String pic_path,String slider_src){
        sliderMapper.updateSlider(slider_num, pic_path, slider_src);
    }

    public List<CaSlider> selectAll(){
        return sliderMapper.selectAll();
    }

}
