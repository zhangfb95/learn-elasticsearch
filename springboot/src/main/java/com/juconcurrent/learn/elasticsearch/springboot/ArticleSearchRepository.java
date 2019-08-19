package com.juconcurrent.learn.elasticsearch.springboot;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author zhangfubing
 * @create 2019/8/19 20:31
 */
public interface ArticleSearchRepository extends ElasticsearchRepository<Article, Long> {

}
