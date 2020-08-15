package com.weds.api.mapper;

import com.weds.api.entity.DtUserEntity;
import com.weds.core.annotation.MyBatisDao;

import java.util.List;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-05
 */
@MyBatisDao
public interface DtUserMapper {
    /**
     */
    int deleteByPrimaryKey(Long userSerial);

    /**
     */
    int insert(DtUserEntity record);

    /**
     */
    int insertSelective(DtUserEntity record);

    /**
     */
    DtUserEntity selectByPrimaryKey(Long userSerial);

    /**
     */
    int updateByPrimaryKeySelective(DtUserEntity record);

    /**
     */
    int updateByPrimaryKey(DtUserEntity record);

    /**
     */
    int updateDepName(DtUserEntity record);

    /**
     */
    List<DtUserEntity> select();

    DtUserEntity selectByUserNo(String userNo);
}