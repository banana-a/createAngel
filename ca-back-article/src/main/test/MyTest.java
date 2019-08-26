import com.alibaba.druid.support.json.JSONUtils;
import com.miracle.ca.back.article.BackArticleApplication;
import com.miracle.ca.back.article.entity.CaArticle;
import com.miracle.ca.back.article.entity.Recieve;
import com.miracle.ca.back.article.mapper.CaArticleMapper;
import com.miracle.ca.back.article.service.ArticleService;
import com.miracle.ca.back.article.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-19 12:44
 **/

@SpringBootTest(classes = BackArticleApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class MyTest {
    @Autowired
    ArticleService articleService;

    @Autowired
    UserService userService;

    @Test
    public void upload(){
        Recieve recieve = new Recieve();
        recieve.setTitle("t");
        recieve.setMain("t");
        recieve.setHtmlContent("t");
        articleService.upload(recieve);
    }

    @Test
    public void getArticleTest(){
        List<CaArticle> articles = articleService.getArticle(0);

        for (int i = 0;i < articles.size();i++){
            System.out.println(articles.get(i).getMain());
        }
    }

    @Test
    public void getArticleByIdTest(){
        CaArticle article = articleService.getArticleById(1);
        System.out.println(article.getMain());
    }

    @Test
    public void selectUserTest(){
        System.out.println(userService.selectUser("oa87X5fIdwaazcbIgynkJfmRtQVI"));
    }

}
