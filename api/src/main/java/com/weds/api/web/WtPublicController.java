package com.weds.api.web;

import com.weds.api.entity.WtPublicEntity;
import com.weds.api.service.WtPublicService;
import com.weds.core.annotation.Logs;
import com.weds.core.base.BaseController;
import com.weds.core.resp.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Author sxm
 * @Description WtPublic管理
 * @Date 2019-05-25
 */
@RestController
@RequestMapping(value = "/wtPublic")
@Api(value = "WtPublic管理", description = "WtPublic管理")
public class WtPublicController extends BaseController {
    @Autowired
    private WtPublicService wtPublicService;

    private Logger log = LogManager.getLogger();

    @Logs
    @ApiOperation(value = "新增WtPublic信息", notes = "新增WtPublic信息")
    @RequestMapping(value = "/insert", method = RequestMethod.PUT)
    public JsonResult<Object> insert(@RequestBody @Valid WtPublicEntity record) {
        wtPublicService.insertSelective(record);
        return succMsg();
    }

    @Logs
    @ApiOperation(value = "更新WtPublic信息", notes = "更新WtPublic信息")
    @RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
    public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid WtPublicEntity record) {
        wtPublicService.updateByPrimaryKeySelective(record);
        return succMsg();
    }

    @Logs
    @ApiOperation(value = "删除WtPublic信息", notes = "删除WtPublic信息")
    @RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
    public JsonResult<Object> deleteByPrimaryKey(@RequestParam Integer xh) {
        wtPublicService.deleteByPrimaryKey(xh);
        return succMsg();
    }

    @Logs
    @ApiOperation(value = "查询WtPublic信息", notes = "查询WtPublic信息")
    @RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
    public JsonResult<WtPublicEntity> selectByPrimaryKey(@RequestParam Integer xh) {
        WtPublicEntity entity = wtPublicService.selectByPrimaryKey(xh);
        return succMsgData(entity);
    }
}