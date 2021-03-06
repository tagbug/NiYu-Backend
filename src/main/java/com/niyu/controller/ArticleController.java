package com.niyu.controller;

import com.niyu.pojo.Articles;
import com.niyu.service.impl.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author peiqi
 * @date 2022/3/114:40
 */
@RestController
public class ArticleController {
    @Autowired
    private ArticleServiceImpl articleService;

    @RequestMapping(value = "/article/byId")
    public Map getArticleById(@RequestParam String articleId) {
        Map map = new HashMap();
        Articles article = articleService.getArticleById(articleId);
        map.put("article",article);
        if(article!=null){
            map.put("status",200);
            map.put("msg","success");
        }else{
            map.put("status",404);
            map.put("msg","fail");
        }
        return map;
    }

    @RequestMapping(value = "/article/byAuthor")
    public Map getArticleByAuthorId(@RequestParam String authorId) {
        Map map = new HashMap();
        List<Articles> articlesList = articleService.getArticleByAuthor(authorId);
        map.put("articlesList",articlesList);
        if(articlesList!=null){
            map.put("status",200);
            map.put("msg","success");
        }else{
            map.put("status",500);
            map.put("msg","fail");
        }
        return map;
    }

    @PostMapping("/article/post")
    public Map postArticle(@RequestBody Articles articles){
        System.out.println(articles.toString());
        Map map = new HashMap();
        Articles postArticle = articleService.postArticle(articles);
        System.out.println(articles.toString());
        map.put("postArticle",postArticle);
        if(postArticle!=null){
            map.put("status",200);
            map.put("msg","success");
        }else{
            map.put("status",500);
            map.put("msg","fail");
        }
        return map;
    }

    @RequestMapping("/article/delete")
    public Map deleteArticle(@RequestParam String articleId){
        Map map = new HashMap();
        long l = articleService.deleteArticle(articleId);
        if(l==1){
            map.put("status",200);
            map.put("msg","success");
        }else{
            map.put("status",500);
            map.put("msg","fail");
        }
        return map;
    }
}
