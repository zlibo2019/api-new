package com.weds.api.mapper;

import com.weds.api.entity.AttendanceFlowEntity;
import com.weds.core.annotation.MyBatisDao;

import java.util.List;

/**
 * @Author
 * @Description 管理
 * @Date 2020-02-27
 */
@MyBatisDao
public interface AttendanceMapper {

    /**
     */
    List<AttendanceFlowEntity> select(AttendanceFlowEntity record);

}