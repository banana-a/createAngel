package com.miracle.ca.back.slider.controller;

import com.miracle.ca.back.slider.entity.CaSlider;
import com.miracle.ca.back.slider.entity.Recieve;
import com.miracle.ca.back.slider.service.SliderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-19 18:41
 **/

@CrossOrigin
@RestController
public class SliderController {

    @Autowired
    SliderService sliderService;

    @PostMapping(value = "/updateSlider")
    public String updateSlider(@RequestBody Recieve recieve){
        String oneRoad = recieve.getOneRoad();
        String oneSrc = recieve.getOneSrc();
        String twoRoad = recieve.getTwoRoad();
        String twoSrc = recieve.getTwoSrc();
        String threeRoad = recieve.getThreeRoad();
        String threeSrc = recieve.getThreeSrc();
        System.out.println(threeRoad);
        System.out.println("--------------------------------------------");
        if (!oneRoad.equals("") && !oneSrc.equals("")) {
            sliderService.updateSlider(1, oneRoad, oneSrc);
        }
        if (!twoRoad.equals("") && !twoSrc.equals("")) {
            sliderService.updateSlider(2, twoRoad, twoSrc);
        }
        if (!threeRoad.equals("") && !threeSrc.equals("")) {
            sliderService.updateSlider(3, threeRoad, threeSrc);
        }
        return "200";
    }

    @GetMapping(value = "/getSlider")
    public List<CaSlider> getAll(){
        List<CaSlider> sliders = sliderService.selectAll();
        return sliders;
    }

}
