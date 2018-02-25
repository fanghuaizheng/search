package cn.com.component.controller;

import cn.com.component.entity.UserEntity;
import cn.com.component.provide.ProvideService;
import cn.com.component.searchDto.SearchRequestVO;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hzfang on 2018/2/11.
 */
@RestController
public class ElasticsearchController {

    @Autowired
    ProvideService provideService;

    @ApiOperation(value = "更新或者插入指定类型的数据",notes = "更新或者插入指定类型的数据")
    @ApiImplicitParam(name = "type",value = "指定的数据类型",required = true,paramType = "query",dataType = "String")
    @GetMapping("addAllIndex")
    public Object addAllIndex(@RequestParam(value = "type",required = true,defaultValue = "")String type){

        if (type==null){
            return "参数不能为空";
        }

        Object indexs = provideService.addIndexs(type);

        return indexs;

    }

    @ApiOperation(value = "根据指定的条件搜索数据",notes = "根据指定的条件搜索数据")
    @ApiImplicitParam(name = "searchRequestVO",value = "搜索实体类",required = true,dataType = "SearchRequestVO")
    @PostMapping("search")
    public Object search(@RequestBody SearchRequestVO searchRequestVO){


//        SearchRequestVO.setType(AdEntity.class.getSimpleName());

        Object search = provideService.search(JSONObject.toJSONString(searchRequestVO));

        return search;

    }


    @ApiOperation("展示提交的用户信息")
    @ApiImplicitParam(name = "userEntity",value = "用户实体类",required = true,dataType = "UserEntity")
    @PostMapping("user")
    public Object showUser(@RequestBody UserEntity userEntity){

        return userEntity;

    }




}
