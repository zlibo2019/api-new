package com.weds.api.web;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import javax.validation.Valid;

import com.weds.core.base.BaseController;
import com.weds.core.annotation.Logs;
import com.weds.core.resp.JsonResult;
import com.weds.core.base.BaseCommPager;
import com.weds.core.base.BasePageSearch;

import javax.servlet.http.HttpServletResponse;

import com.weds.api.entity.DtAcLinkEntity;
import com.weds.api.service.DtAcLinkService;

/**
 * @Author
 * @Description DtAcLink管理
 * @Date 2020-03-11
 */
//@RestController
//@RequestMapping(value = "/dtAcLink")
//@Api(value = "账户管理", description = "账户管理")
public class DtAcLinkController extends BaseController {
    @Resource
    private DtAcLinkService dtAcLinkService;


    @Resource
    private HttpServletResponse response;

    private Logger log = LogManager.getLogger();

    @Logs
    @ApiOperation(value = "新增DtAcLink信息", notes = "新增DtAcLink信息")
    @RequestMapping(value = "/insert", method = RequestMethod.PUT)
    public JsonResult<Object> insert(@RequestBody @Valid DtAcLinkEntity record) {
        dtAcLinkService.insertSelective(record);
        return succMsg();
    }

    @Logs
    @ApiOperation(value = "更新DtAcLink信息", notes = "更新DtAcLink信息")
    @RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
    public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid DtAcLinkEntity record) {
        dtAcLinkService.updateByPrimaryKeySelective(record);
        return succMsg();
    }

    @Logs
    @ApiOperation(value = "查询DtAcLink清单", notes = "查询DtAcLink清单")
    @RequestMapping(value = "/selectListPageByEntity", method = RequestMethod.POST)
    public JsonResult<BaseCommPager<DtAcLinkEntity>> selectListPageByEntity(@RequestBody BasePageSearch<DtAcLinkEntity> record) {
        setPageHelper(record);
        DtAcLinkEntity entity = record.getSearch();
        if (entity == null) {
            entity = new DtAcLinkEntity();
        }
        List<DtAcLinkEntity> list = dtAcLinkService.selectListByEntity(entity);
        return succMsgData(new BaseCommPager<DtAcLinkEntity>(list));
    }


    @Logs
    @ApiOperation(value = "查询DtAcLink列表", notes = "查询DtAcLink列表")
    @RequestMapping(value = "/selectListByEntity", method = RequestMethod.POST)
    public JsonResult<List<DtAcLinkEntity>> selectListByEntity(@RequestBody DtAcLinkEntity record) {
        List<DtAcLinkEntity> list = dtAcLinkService.selectListByEntity(record);
        return succMsgData(list);
    }

    @Logs
    @ApiOperation(value = "删除DtAcLink信息", notes = "删除DtAcLink信息")
    @RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
    public JsonResult<Object> deleteByPrimaryKey(@RequestParam Long userSerial) {
        dtAcLinkService.deleteByPrimaryKey(userSerial);
        return succMsg();
    }

    @Logs
    @ApiOperation(value = "查询DtAcLink信息", notes = "查询DtAcLink信息")
    @RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
    public JsonResult<DtAcLinkEntity> selectByPrimaryKey(@RequestParam Long userSerial) {
        DtAcLinkEntity entity = dtAcLinkService.selectByPrimaryKey(userSerial);
        return succMsgData(entity);
    }
}