package com.weds.api.web;

import com.weds.api.entity.DtUserEntity;
import com.weds.bean.jwt.JwtUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.weds.core.base.BaseController;
import com.weds.core.annotation.Logs;
import com.weds.core.resp.JsonResult;

import javax.servlet.http.HttpServletResponse;

import com.weds.api.service.DtUserService;

/**
 * @Author
 * @Description DtUser管理
 * @Date 2020-03-05
 */
@RestController
@RequestMapping(value = "/dtUser")
@Api(value = "人员管理", description = "人员管理")
public class DtUserController extends BaseController {
    @Resource
    private DtUserService dtUserService;

    @Resource
    private HttpServletRequest request;

    @Resource
    private HttpServletResponse response;

    private Logger log = LogManager.getLogger();

    @Logs
    @ApiOperation(value = "删除用户档案人脸", notes = "删除用户档案人脸")
    @RequestMapping(value = "/deleteFace", method = RequestMethod.POST)
    @Transactional
    public JsonResult<Object> deleteFace(@RequestParam Long userSerial) {
        DtUserEntity entity = dtUserService.deleteFaceOrPhoto(userSerial);
        String gly = null;
        if (JwtUtils.getJwtData(request) != null) {
            gly = JwtUtils.getJwtData(request).getString("userSerial");
        }
        dtUserService.updateByPrimaryKeySelective(entity, request.getRemoteAddr(), gly);
        return succMsg();
    }



    @Logs
    @ApiOperation(value = "更新用户档案表信息", notes = "更新用户档案表信息")
    @RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
    @Transactional
    public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid DtUserEntity record) {
        try {
            dtUserService.updateFaceOrPhoto(record);
        } catch (Exception e) {
            e.printStackTrace();
            return failMsg();
        }

        String gly = null;
        if (JwtUtils.getJwtData(request) != null) {
            gly = JwtUtils.getJwtData(request).getString("userSerial");
        }
        dtUserService.updateByPrimaryKeySelective(record, request.getRemoteAddr(), gly);
        dtUserService.updateDepName(record);
        return succMsg();
    }


    @Logs
    @ApiOperation(value = "新增用户档案表信息", notes = "新增用户档案表信息")
    @RequestMapping(value = "/insert", method = RequestMethod.PUT)
    public JsonResult<Object> insert(@RequestBody @Valid DtUserEntity record) {
        try {
            int iResult = dtUserService.insertSelective(record);
            if(iResult == -100){
                return failMsg("工号重复");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return failMsg();
        }
        return succMsg();
    }



    @Logs
    @ApiOperation(value = "删除用户档案表信息", notes = "删除DtUser信息")
    @RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
    public JsonResult<Object> deleteByPrimaryKey(@RequestParam Long userSerial) {
        dtUserService.deleteByPrimaryKey(userSerial);
        return succMsg();
    }

    @Logs
    @ApiOperation(value = "查询用户档案表信息", notes = "查询DtUser信息")
    @RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
    public JsonResult<DtUserEntity> selectByPrimaryKey(@RequestParam Long userSerial) {
        DtUserEntity entity = dtUserService.selectByPrimaryKey(userSerial);
        return succMsgData(entity);
    }


    @Logs
    @ApiOperation(value = "查询用户档案表信息", notes = "查询用户档案表信息")
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public JsonResult<List<DtUserEntity>> select() {
        List<DtUserEntity> list = dtUserService.select();
        return succMsgData(list);
    }

    @Logs
    @ApiOperation(value = "根据userNo查询人员状态", notes = "根据userNo查询人员状态")
    @RequestMapping(value = "/selectByUserNo", method = RequestMethod.GET)
    public JsonResult<DtUserEntity> selectByUserNo(@RequestParam String userNo) {
        DtUserEntity dtUserEntity = dtUserService.selectByUserNo(userNo);
        if (dtUserEntity != null) {
            return succMsgData(dtUserEntity);
        }
        return failMsg("人员状态有误");
    }
}