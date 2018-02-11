package cn.com.component.dao;

import cn.com.component.entity.AdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hzfang on 2018/2/11.
 */
@Repository
public interface AdDao extends JpaRepository<AdEntity,Integer>,
        PagingAndSortingRepository<AdEntity,Integer> {
}
