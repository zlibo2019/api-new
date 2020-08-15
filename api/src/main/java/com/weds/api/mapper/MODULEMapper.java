package com.weds.api.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.api.entity.MODULEEntity;

import java.util.List;

/**
 * @Author sxm
 * @Description 管理
 * @Date 2018-11-24
 */
@MyBatisDao
public interface MODULEMapper {
    /**
     */
    int deleteByPrimaryKey(String moduleId);

    /**
     */
    int insert(MODULEEntity record);

    /**
     */
    int insertSelective(MODULEEntity record);

    /**
     */
    MODULEEntity selectByPrimaryKey(String moduleId);

    /**
     */
    int updateByPrimaryKeySelective(MODULEEntity record);

    /**
     */
    int updateByPrimaryKey(MODULEEntity record);

    /**
     */
    List<MODULEEntity> selectListByEntity(MODULEEntity record);

    MODULEEntity selectMeetBhByPrimaryKey(String moduleId);

    int updateMeetBhByPrimaryKey(String moduleId);

}