package com.weds.api.web;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.validation.Valid;

import com.weds.core.base.BaseController;
import com.weds.core.annotation.Logs;
import com.weds.core.resp.JsonResult;

import com.weds.api.entity.DtDepEntity;
import com.weds.api.service.DtDepService;

import java.util.List;

/**
 * @Author
 * @Description DtDep管理
 * @Date 2020-02-27
 */
@RestController
@RequestMapping(value = "/dtDep")
@Api(value = "部门管理", description = "部门管理")
public class DtDepController extends BaseController {
    @Resource
    private DtDepService dtDepService;


    private Logger log = LogManager.getLogger();

    @Logs
    @ApiOperation(value = "新增DtDep信息", notes = "新增DtDep信息")
    @RequestMapping(value = "/insert", method = RequestMethod.PUT)
    public JsonResult<Object> insert(@RequestBody @Valid DtDepEntity record) {
        dtDepService.insert(record);
        return succMsg();
    }

    @Logs
    @ApiOperation(value = "更新DtDep信息", notes = "更新DtDep信息")
    @RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
    public JsonResult<Object> updateByPrimaryKey(@RequestParam Long depSerial) {
        dtDepService.updateByPrimaryKey(depSerial);
        return succMsg();
    }


    @Logs
    @ApiOperation(value = "删除DtDep信息", notes = "删除DtDep信息")
    @RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
    public JsonResult<Object> deleteByPrimaryKey(@RequestParam Long depSerial) {
        dtDepService.deleteByPrimaryKey(depSerial);
        return succMsg();
    }


    @Logs
    @ApiOperation(value = "查询DtDep信息", notes = "查询DtDep信息")
    @RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
    public JsonResult<DtDepEntity> selectByPrimaryKey(@RequestParam Long depSerial) {
        DtDepEntity entity = dtDepService.selectByPrimaryKey(depSerial);
        return succMsgData(entity);
    }

    @Logs
    @ApiOperation(value = "查询DtDep信息", notes = "查询DtDep信息")
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public JsonResult<List<DtDepEntity>> select(@RequestAttribute("loginUserId") String loginUserId) {
       System.out.println(loginUserId);
       List<DtDepEntity> list = dtDepService.select();
        return succMsgData(list);
    }

}