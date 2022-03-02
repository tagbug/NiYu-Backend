package com.niyu.service.impl;

import com.mongodb.client.result.DeleteResult;
import com.niyu.pojo.Articles;
import com.niyu.service.ArticleService;
import com.niyu.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author peiqi
 * @date 2022/3/111:16
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public Articles getArticleById(String articleId) {
        Articles article = mongoTemplate.findById(articleId,Articles.class);
        if(article!=null){
            return article;
        }
        return null;
    }

    @Override
    public List<Articles> getArticleByAuthor(String authorId) {
        Query query = new Query(Criteria.where("authorId").is(authorId));
        List<Articles> articles = mongoTemplate.find(query, Articles.class);
        if(articles!=null){
            return articles;
        }
        return null;
    }

    @Override
    public Articles postArticle(Articles articles) {
        articles.setPostDate(new Date());
        articles.setArticleId(IdUtil.getArticleId());
        articles.setLikerList(new ArrayList<>());
        articles.setReviewList(new ArrayList<>());
        articles.setLikes(0);
        articles.setAvailable(true);
        articles.setStarerList(new ArrayList<>());
        Articles in = mongoTemplate.insert(articles);
        if(in!=null){
            return in;
        }
        return null;
    }

    @Override
    public long deleteArticle(String articleId) {
        Articles article = mongoTemplate.findById(articleId,Articles.class);
        if(article==null){
            return 0;
        }
        DeleteResult result = mongoTemplate.remove(article);
        return result.getDeletedCount();
    }
}
