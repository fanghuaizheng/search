package cn.com.component.controller;

import cn.com.component.entity.AdEntity;
import cn.com.component.provide.ProvideService;
import cn.com.component.searchDto.SearchResquestVO;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

        Object indexs = provideService.addIndexs(AdEntity.class.getSimpleName());

        return indexs;

    }

    @ApiOperation(value = "g根据指定的条件搜索数据",notes = "g根据指定的条件搜索数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key",value = "搜索指定字段名称",required = true,paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "value",value = "搜索指定字段值",required = true,paramType = "query",dataType = "String")
    })
    @GetMapping("search")
    public Object search(@RequestParam("key") String key,
                         @RequestParam("value") String value){
        SearchResquestVO searchResquestVO = new SearchResquestVO();

        searchResquestVO.setField(key);
        searchResquestVO.setValue(value);
        searchResquestVO.setType(AdEntity.class.getSimpleName());

        Object search = provideService.search(JSONObject.toJSONString(searchResquestVO));

        return search;

    }






}
