package cn.com.component.service.impl;

import cn.com.component.dao.AdDao;
import cn.com.component.entity.AdEntity;
import cn.com.component.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hzfang on 2018/2/11.
 */
@Service
public class AdServiceImpl implements AdService {

    @Autowired
    AdDao adDao;

    @Override
    public List<AdEntity> findAll() {
        return adDao.findAll();
    }
}
