package cn.com.component.utils;

import cn.com.component.config.Config;
import cn.com.component.service.BaseService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by hzfang on 2018/2/23.
 */
@Component
public class BeanUtils {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    Config config;

    /**
     * 根据实体类名称获取service实现
     * @param entityName
     * @return
     */
    public BaseService getService(String entityName){
        AutowireCapableBeanFactory beanFactory =
                applicationContext.getAutowireCapableBeanFactory();
        String serviceClazz = StringUtils.remove(entityName,"Entity").concat("ServiceImpl");
        try {
            Class<?> forName = Class.forName(config.servicePath.concat(".").concat(serviceClazz));
           BaseService baseService = (BaseService) beanFactory.createBean(forName);
           return baseService;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }

}
