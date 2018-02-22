package cn.com.component.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by woni on 18/2/22.
 */
public interface BaseService<T> {
    public static Logger logger = LoggerFactory.getLogger(BaseService.class);
    List<T> findAll();
}
