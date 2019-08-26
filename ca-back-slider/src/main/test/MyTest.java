import com.miracle.ca.back.slider.SliderApplication;
import com.miracle.ca.back.slider.service.SliderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-19 18:51
 **/

@SpringBootTest(classes = SliderApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class MyTest {

    @Autowired
    SliderService sliderService;

    @Test
    public void updateTest(){
        sliderService.updateSlider(1, "test","test");
    }

}
