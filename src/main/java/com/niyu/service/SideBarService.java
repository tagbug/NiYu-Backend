package com.niyu.service;

import com.niyu.pojo.Tag;
import com.niyu.pojo.Users;

import java.util.List;

/**
 * @author peiqi
 * @date 2022/2/2810:34
 */
public interface SideBarService {
    /**
     * 获取热点信息与获取流行话题暂时一样
     * @return
     */
    List<Tag> getRecommend();

    /**
     * 获取活跃用户,根据发帖时间与数量
     * @return
     */
    List<Users> getActiveUser();
}
