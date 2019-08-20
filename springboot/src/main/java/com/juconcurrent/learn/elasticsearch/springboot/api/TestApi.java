package com.juconcurrent.learn.elasticsearch.springboot.api;

import com.juconcurrent.learn.elasticsearch.springboot.dao.elasticsearch.ArticleES;
import com.juconcurrent.learn.elasticsearch.springboot.domain.elasticsearch.ArticleEO;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

/**
 * @author zhangfubing
 * @create 2019/8/19 20:31
 */
@RestController
public class TestApi {

    @Autowired
    private ArticleES articleES;

    @RequestMapping("/add")
    public void testSaveArticleIndex() {
    }

    @RequestMapping("/query")
    public void testSearch() {
        String queryString = "springboot";//搜索关键字
        QueryStringQueryBuilder builder = new QueryStringQueryBuilder(queryString);
        Iterable<ArticleEO> searchResult = articleES.search(builder);
        Iterator<ArticleEO> iterator = searchResult.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
