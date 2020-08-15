package com.weds.api.service;

import com.weds.core.base.BaseService;
import com.weds.api.entity.DtPhotoEntity;
import com.weds.api.mapper.DtPhotoMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author sxm
 * @Description DtPhoto管理
 * @Date 2019-05-29
 */
@Service
public class DtPhotoService extends BaseService {

    @Autowired
    private DtPhotoMapper dtPhotoMapper;

    private Logger log = LogManager.getLogger();

    public int deleteByPrimaryKey(Long userSerial) {
        return dtPhotoMapper.deleteByPrimaryKey(userSerial);
    }

    public int insert(DtPhotoEntity record) {
        return dtPhotoMapper.insert(record);
    }

    public int insertSelective(DtPhotoEntity record) {
        return dtPhotoMapper.insertSelective(record);
    }

    public DtPhotoEntity selectByPrimaryKey(Long userSerial) {
        return dtPhotoMapper.selectByPrimaryKey(userSerial);
    }

    public int updateByPrimaryKeySelective(DtPhotoEntity record) {
        return dtPhotoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(DtPhotoEntity record) {
        return dtPhotoMapper.updateByPrimaryKey(record);
    }
}
