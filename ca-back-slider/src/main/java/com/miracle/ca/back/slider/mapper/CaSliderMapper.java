package com.miracle.ca.back.slider.mapper;

import com.miracle.ca.back.slider.entity.CaSlider;
import com.miracle.util.MyMapper;
import org.springframework.stereotype.Repository;


@Repository
public interface CaSliderMapper extends MyMapper<CaSlider> {
    public void updateSlider(int slider_num,String pic_path,String slider_src);
}