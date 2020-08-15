package com.weds.api.service;

import javax.annotation.Resource;

import com.weds.api.mapper.WtGlyMapper;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.api.entity.WtGlyEntity;

/**
 * @Author
 * @Description WtGly管理
 * @Date 2020-03-07
 */
@Service
public class WtGlyService extends BaseService {

    @Resource
    private WtGlyMapper wtGlyMapper;

    private Logger log = LogManager.getLogger();

    public int deleteByPrimaryKey(String glyNo) {
        return wtGlyMapper.deleteByPrimaryKey(glyNo);
    }

    public int insert(WtGlyEntity record) {
        return wtGlyMapper.insert(record);
    }

    public int insertSelective(WtGlyEntity record) {
        return wtGlyMapper.insertSelective(record);
    }

    public WtGlyEntity selectByPrimaryKey(String glyNo) {
        return wtGlyMapper.selectByPrimaryKey(glyNo);
    }

    public int updateByPrimaryKeySelective(WtGlyEntity record) {
        return wtGlyMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(WtGlyEntity record) {
        return wtGlyMapper.updateByPrimaryKey(record);
    }

    public List<WtGlyEntity> selectListByEntity(WtGlyEntity record) {
        return wtGlyMapper.selectListByEntity(record);
    }

    public int updatePwd(WtGlyEntity record){
        return wtGlyMapper.updatePwd(record);
    }
}
