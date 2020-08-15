package com.weds.api.service;

import javax.annotation.Resource;

import com.weds.api.mapper.DtDepMapper;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.weds.core.base.BaseService;
import com.weds.api.entity.DtDepEntity;

import java.util.List;

/**
 * @Author
 * @Description DtDep管理
 * @Date 2020-02-27
 */
@Service
public class DtDepService extends BaseService {

    @Resource
    private DtDepMapper dtDepMapper;

    private Logger log = LogManager.getLogger();

    public int deleteByPrimaryKey(Long depSerial) {
        return dtDepMapper.deleteByPrimaryKey(depSerial);
    }

    public int insert(DtDepEntity record) {
        return dtDepMapper.insert(record);
    }

    public DtDepEntity selectByPrimaryKey(Long depSerial) {
        return dtDepMapper.selectByPrimaryKey(depSerial);
    }

    public int updateByPrimaryKey(Long depSerial) {
        return dtDepMapper.updateByPrimaryKey(depSerial);
    }

    public List<DtDepEntity> select() {
        return dtDepMapper.select();
    }

}
