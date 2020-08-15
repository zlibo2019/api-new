package com.weds.api.service;

import com.weds.api.entity.AttendanceFlowEntity;
import com.weds.api.mapper.AttendanceMapper;
import com.weds.core.base.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author
 * @Description DtDep管理
 * @Date 2020-02-27
 */
@Service
public class AttendanceService extends BaseService {

    @Resource
    private AttendanceMapper attendanceMapper;

    public List<AttendanceFlowEntity> select(AttendanceFlowEntity record) {
        return attendanceMapper.select(record);
    }

}
