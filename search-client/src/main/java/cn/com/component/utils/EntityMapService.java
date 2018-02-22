package cn.com.component.utils;

import cn.com.component.service.AdService;
import cn.com.component.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by woni on 18/2/22.
 *
 * 实体类与serivice实现的对应关系
 */
@Component
public class EntityMapService {

    @Autowired
    AdService adService;

    private Map<String,BaseService> map = new ConcurrentHashMap<>();

    public EntityMapService(){
//        map.put("AdEntity",adService);
    }

    //这块写死啦，后期找方法，写成动态的来获取
    public void setMap(){
        map.put("AdEntity",adService);
    }

    public Map<String,BaseService> getMap(){
        return map;
    }

}
