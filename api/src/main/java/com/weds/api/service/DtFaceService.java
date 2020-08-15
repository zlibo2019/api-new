package com.weds.api.service;

import com.weds.core.base.BaseService;
import com.weds.api.entity.DtFaceEntity;
import com.weds.api.mapper.DtFaceMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author sxm
 * @Description DtFace管理
 * @Date 2019-05-29
 */
@Service
public class DtFaceService extends BaseService {

    @Autowired
    private DtFaceMapper dtFaceMapper;

    private Logger log = LogManager.getLogger();

    public int deleteByPrimaryKey(Long userSerial) {
        return dtFaceMapper.deleteByPrimaryKey(userSerial);
    }

    public int insert(DtFaceEntity record) {
        return dtFaceMapper.insert(record);
    }

    public int insertSelective(DtFaceEntity record) {
        return dtFaceMapper.insertSelective(record);
    }

    public DtFaceEntity selectByPrimaryKey(Long userSerial) {
        return dtFaceMapper.selectByPrimaryKey(userSerial);
    }

    public int updateByPrimaryKeySelective(DtFaceEntity record) {
        return dtFaceMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(DtFaceEntity record) {
        return dtFaceMapper.updateByPrimaryKey(record);
    }


}
