package com.weds.api.service;

import com.weds.api.entity.WtPublicEntity;
import com.weds.api.mapper.WtPublicMapper;
import com.weds.core.base.BaseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author sxm
 * @Description WtPublic管理
 * @Date 2019-05-25
 */
@Service
public class WtPublicService extends BaseService {

    @Autowired
    private WtPublicMapper wtPublicMapper;

    private Logger log = LogManager.getLogger();

    public int deleteByPrimaryKey(Integer xh) {
        return wtPublicMapper.deleteByPrimaryKey(xh);
    }

    public int insert(WtPublicEntity record) {
        return wtPublicMapper.insert(record);
    }

    public int insertSelective(WtPublicEntity record) {
        return wtPublicMapper.insertSelective(record);
    }

    public WtPublicEntity selectByPrimaryKey(Integer xh) {
        return wtPublicMapper.selectByPrimaryKey(xh);
    }

    public int updateByPrimaryKeySelective(WtPublicEntity record) {
        return wtPublicMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(WtPublicEntity record) {
        return wtPublicMapper.updateByPrimaryKey(record);
    }
}
