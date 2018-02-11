package cn.com.component.utils;


import cn.com.component.searchDto.MySearchResult;
import cn.com.component.searchDto.SearchResponseVO;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 普通的一些工具类方法集合
 * Created by woni on 18/1/28.
 */
@Component
public class CommonUtils {



    /**
     * 组装客户端返回值
     * @param responseVO
     * @param result
     */
    public void putValue2Result(SearchResponseVO responseVO, MySearchResult result, List<Object> data){
        responseVO.setCode(result.getCode());
        responseVO.setMsg(result.getMsg());
        responseVO.setData(data);
    }



}
