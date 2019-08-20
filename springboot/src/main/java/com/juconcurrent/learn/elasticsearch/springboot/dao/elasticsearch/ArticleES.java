package com.juconcurrent.learn.elasticsearch.springboot.dao.elasticsearch;

import com.juconcurrent.learn.elasticsearch.springboot.domain.elasticsearch.ArticleEO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author zhangfubing
 * @create 2019/8/19 20:31
 */
public interface ArticleES extends ElasticsearchRepository<ArticleEO, Long> {

}
