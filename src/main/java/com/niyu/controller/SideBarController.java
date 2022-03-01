package com.niyu.controller;

import com.niyu.pojo.Tag;
import com.niyu.pojo.Users;
import com.niyu.service.impl.SideBarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author peiqi
 * @Title:
 * @Package
 * @Description:
 * @date 2022/2/2811:23
 */
@Controller
@CrossOrigin
public class SideBarController {
    @Autowired
    private SideBarServiceImpl sideBarService;

    @ResponseBody
    @RequestMapping(value = "/search/getRecommend")
    public Map getRecommend(){
        Map map = new HashMap();
        List<Tag> recommends = sideBarService.getRecommend();
        map.put("recommends",recommends);
        if(recommends!=null){
            map.put("status",200);
            map.put("msg","success");
        }else{
            map.put("status",404);
            map.put("msg","fail");
        }
        return map;
    }

    @ResponseBody
    @RequestMapping("/search/getActiveUser")
    public Map getActiveUser(){
        Map map = new HashMap();
        List<Users> activeUsers = sideBarService.getActiveUser();
        map.put("activeUsers",activeUsers);
        if(activeUsers!=null){
            map.put("status",200);
            map.put("msg","success");
        }else{
            map.put("status",404);
            map.put("msg","fail");
        }

        return map;
    }
}
