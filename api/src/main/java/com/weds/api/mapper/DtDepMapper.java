package com.weds.api.mapper;

import com.weds.api.entity.DtDepEntity;
import com.weds.core.annotation.MyBatisDao;

import java.util.List;

/**
 * @Author
 * @Description 管理
 * @Date 2020-02-27
 */
@MyBatisDao
public interface DtDepMapper {
    /**
     */
    int deleteByPrimaryKey(Long depSerial);

    /**
     */
    int insert(DtDepEntity record);

    /**
     */
    DtDepEntity selectByPrimaryKey(Long depSerial);

    /**
     */
    int updateByPrimaryKey(Long depSerial);

    /**
     */
    List<DtDepEntity> select();


}