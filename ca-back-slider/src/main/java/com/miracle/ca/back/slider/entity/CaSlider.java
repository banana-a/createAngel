package com.miracle.ca.back.slider.entity;

import javax.persistence.*;

@Table(name = "ca_slider")
public class CaSlider {
    @Id
    @Column(name = "slider_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sliderId;

    @Column(name = "slider_num")
    private Integer sliderNum;

    @Column(name = "pic_path")
    private String picPath;

    @Column(name = "slider_src")
    private String sliderSrc;

    /**
     * @return slider_id
     */
    public Integer getSliderId() {
        return sliderId;
    }

    /**
     * @param sliderId
     */
    public void setSliderId(Integer sliderId) {
        this.sliderId = sliderId;
    }

    /**
     * @return slider_num
     */
    public Integer getSliderNum() {
        return sliderNum;
    }

    /**
     * @param sliderNum
     */
    public void setSliderNum(Integer sliderNum) {
        this.sliderNum = sliderNum;
    }

    /**
     * @return pic_path
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * @param picPath
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    /**
     * @return slider_src
     */
    public String getSliderSrc() {
        return sliderSrc;
    }

    /**
     * @param sliderSrc
     */
    public void setSliderSrc(String sliderSrc) {
        this.sliderSrc = sliderSrc;
    }
}