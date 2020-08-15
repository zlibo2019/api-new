package com.weds.api.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.api.mapper.DtAcLinkMapper;
import com.weds.api.entity.DtAcLinkEntity;

/**
 * @Author
 * @Description DtAcLink管理
 * @Date 2020-03-11
 */
@Service
public class DtAcLinkService extends BaseService {

	@Resource
	private DtAcLinkMapper dtAcLinkMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(Long userSerial) {
		return dtAcLinkMapper.deleteByPrimaryKey(userSerial);
	}

	public int insert(DtAcLinkEntity record) {
		return dtAcLinkMapper.insert(record);
	}

	public int insertSelective(DtAcLinkEntity record) {
		return dtAcLinkMapper.insertSelective(record);
	}

	public DtAcLinkEntity selectByPrimaryKey(Long userSerial) {
		return dtAcLinkMapper.selectByPrimaryKey(userSerial);
	}

	public int updateByPrimaryKeySelective(DtAcLinkEntity record) {
		return dtAcLinkMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(DtAcLinkEntity record) {
		return dtAcLinkMapper.updateByPrimaryKey(record);
	}

    	public List<DtAcLinkEntity> selectListByEntity(DtAcLinkEntity record) {
		return dtAcLinkMapper.selectListByEntity(record);
	}
	
	

    
    }
