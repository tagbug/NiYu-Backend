package com.niyu.service;

import com.niyu.pojo.Articles;

import java.util.List;

/**
 * @author peiqi
 * @date 2022/3/111:16
 */
public interface ArticleService {
    /**
     * 根据文章ID获取文章
     * @param articleId
     * @return
     */
    Articles getArticleById(String articleId);

    /**
     * 根据文章作者获取文章
     * @param authorId
     * @return
     */
    List<Articles> getArticleByAuthor(String authorId);

    /**
     * 发布文章
     * @return
     */
    Articles postArticle();

    /**
     * 删除文章
     * @return
     */
    long deleteArticle(String articleId);


}
