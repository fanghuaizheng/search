package cn.com.component.controller;

import cn.com.component.entity.AdEntity;
import cn.com.component.provide.ProvideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzfang on 2018/2/11.
 */
@RestController
public class ElasticsearchController {

    @Autowired
    ProvideService provideService;

    @GetMapping("addAllIndex")
    public Object addAllIndex(){

        Object indexs = provideService.addIndexs(AdEntity.class);

        return indexs;

    }



}
