package com.niyu.service.impl;

import com.niyu.pojo.Tag;
import com.niyu.pojo.Users;
import com.niyu.service.SideBarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author peiqi
 * @date 2022/2/2810:38
 */
@Service
public class SideBarServiceImpl implements SideBarService {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Tag> getRecommend() {
//        Criteria criteria = new Criteria();
        //根据文章数量排序
        Query query = new Query();
        query.with(Sort.by(
                Sort.Order.desc("articleNum")
        ));
        query.limit(3);

        List<Tag> tags = mongoTemplate.find(query, Tag.class);
        if(tags!=null){
            return tags;
        }
        return null;
    }

    @Override
    public List<Users> getActiveUser() {
        Criteria criteria = new Criteria();
        Query query = new Query();
        query.with(Sort.by(
                Sort.Order.desc("articleNum")
        )).with(Sort.by(
                Sort.Order.desc("lastPostTime")
        ));

        query.limit(3);
        return null;
    }
}
