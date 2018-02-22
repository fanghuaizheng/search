package cn.com.component.provide;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by hzfang on 2018/2/11.
 * 这里是提供者提供的服务
 */
@FeignClient("search-client")
public interface ProvideService {

    /**
     * 增加一条所以，或者更新一条索引
     * @param id
     * @param data
     * @param clazz
     * @return
     */
    @PostMapping("elasticsearch/addIndex")
    public Object addIndex(@RequestParam("id") String id,
                           @RequestParam("data") String data,
                           @RequestParam("clazz") Class clazz);

    /**
     * 按照类，更新，或者增加数据库中全部索引
     * @param type
     * @return
     */
    @PostMapping("elasticsearch/addIndexs")
    public Object addIndexs(@RequestParam("type") String type);


    /**
     * 按照指定条件，查询索引中数据
     * @param searchVo
     * @return
     */
    @PostMapping("elasticsearch/search")
    public Object search(@RequestParam("searchRequestVO") String searchVo);


}
