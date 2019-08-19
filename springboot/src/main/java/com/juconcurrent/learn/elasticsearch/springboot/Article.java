package com.juconcurrent.learn.elasticsearch.springboot;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.math.BigDecimal;

/**
 * @author zhangfubing
 * @create 2019/8/19 19:48
 */
@Document(indexName = "zhangfubing_article", type = "_doc")
@Data
public class Article {

    @Id
    private Long id; // 主键id
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String title; // 标题
    private String category;// 分类
    private String brand; // 品牌
    private BigDecimal price; // 价格
    private String images; // 图片地址
}
