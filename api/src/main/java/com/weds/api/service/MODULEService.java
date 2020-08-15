package com.weds.api.service;

import com.weds.core.base.BaseService;
import com.weds.api.entity.MODULEEntity;
import com.weds.api.mapper.MODULEMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author sxm
 * @Description MODULE管理
 * @Date 2018-11-24
 */
@Service
public class MODULEService extends BaseService {

    @Autowired
    private MODULEMapper mODULEMapper;

    private Logger log = LogManager.getLogger();

    public int deleteByPrimaryKey(String moduleId) {
        return mODULEMapper.deleteByPrimaryKey(moduleId);
    }

    public int insert(MODULEEntity record) {
        return mODULEMapper.insert(record);
    }

    public int insertSelective(MODULEEntity record) {
        return mODULEMapper.insertSelective(record);
    }

    public MODULEEntity selectByPrimaryKey(String moduleId) {
        return mODULEMapper.selectByPrimaryKey(moduleId);
    }

    public long selectSerialByModuleId(String moduleId) {
        MODULEEntity moduleEntity = mODULEMapper.selectByPrimaryKey(moduleId);
        long serial = moduleEntity.getModuleUser() + 1;
        MODULEEntity entity = new MODULEEntity();
        entity.setModuleId(moduleId);
        entity.setModuleUser(serial);
        mODULEMapper.updateByPrimaryKeySelective(entity);
        return serial;
    }

    public int updateByPrimaryKeySelective(MODULEEntity record) {
        return mODULEMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(MODULEEntity record) {
        return mODULEMapper.updateByPrimaryKey(record);
    }

    public List<MODULEEntity> selectListByEntity(MODULEEntity record) {
        return mODULEMapper.selectListByEntity(record);
    }

    public MODULEEntity selectMeetBhByPrimaryKey(String moduleId) {
        //取出meetbh
        MODULEEntity meetEntity = mODULEMapper.selectMeetBhByPrimaryKey(moduleId);
        //将meetbh加1存起来
        mODULEMapper.updateMeetBhByPrimaryKey(moduleId);
        return meetEntity;
    }

}
