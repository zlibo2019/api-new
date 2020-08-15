package com.weds.api.mapper;

import com.weds.api.entity.WtPublicEntity;
import com.weds.core.annotation.MyBatisDao;
import com.weds.api.entity.WtPublicEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2019-05-25
 */
@MyBatisDao
public interface WtPublicMapper {
    /**
     */
    int deleteByPrimaryKey(Integer xh);

    /**
     */
    int insert(WtPublicEntity record);

    /**
     */
    int insertSelective(WtPublicEntity record);

    /**
     */
    WtPublicEntity selectByPrimaryKey(Integer xh);

    /**
     */
    int updateByPrimaryKeySelective(WtPublicEntity record);

    /**
     */
    int updateByPrimaryKey(WtPublicEntity record);
}