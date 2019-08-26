import com.miracle.ca.back.comment.CommentApplication;
import com.miracle.ca.back.comment.entity.CaCommentOne;
import com.miracle.ca.back.comment.mapper.CaCommentOneMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-23 17:01
 **/

@SpringBootTest(classes = CommentApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class MyTest {

    @Autowired
    CaCommentOneMapper caCommentOneMapper;

    @Test
    public void addTest(){
        caCommentOneMapper.addCommentOneNum(2);
    }
}
