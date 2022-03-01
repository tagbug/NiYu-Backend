package com.niyu.controller;

import com.niyu.pojo.Tag;
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
        return map;
    }
}
