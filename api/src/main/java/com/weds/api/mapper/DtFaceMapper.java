package com.weds.api.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.api.entity.DtFaceEntity;
import org.apache.ibatis.annotations.Param;

/**
 * @Author
 * @Description 管理
 * @Date 2019-05-29
 */
@MyBatisDao
public interface DtFaceMapper {
    /**
     */
    int deleteByPrimaryKey(@Param("userSerial") Long userSerial);

    /**
     */
    int insert(DtFaceEntity record);

    /**
     */
    int insertSelective(DtFaceEntity record);

    /**
     */
    DtFaceEntity selectByPrimaryKey(@Param("userSerial") Long userSerial);

    /**
     */
    int updateByPrimaryKeySelective(DtFaceEntity record);

    /**
     */
    int updateByPrimaryKey(DtFaceEntity record);
}