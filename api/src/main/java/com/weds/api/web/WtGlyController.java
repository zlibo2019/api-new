package com.weds.api.web;

import com.alibaba.fastjson.JSONObject;
import com.weds.core.utils.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;
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

import com.weds.api.entity.WtGlyEntity;
import com.weds.api.service.WtGlyService;
import com.weds.bean.jwt.JwtUtils;
import com.weds.bean.jwt.JwtEntity;
import com.weds.bean.jwt.JwtParams;

/**
 * @Author
 * @Description WtGly管理
 * @Date 2020-03-07
 */
@RestController
@RequestMapping(value = "/wtGly")
@Api(value = "用户管理", description = "用户管理")
public class WtGlyController extends BaseController {
    @Resource
    private WtGlyService wtGlyService;

    @Resource
    private HttpServletResponse response;

    private Logger log = LogManager.getLogger();

    private JwtParams jwtParams;


    @Logs
    @ApiOperation(value = "新增WtGly信息", notes = "新增WtGly信息")
    @RequestMapping(value = "/insert", method = RequestMethod.PUT)
    public JsonResult<Object> insert(@RequestBody @Valid WtGlyEntity record) {
        wtGlyService.insertSelective(record);
        return succMsg();
    }

    @Logs
    @ApiOperation(value = "更新WtGly信息", notes = "更新WtGly信息")
    @RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
    public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid WtGlyEntity record) {
        wtGlyService.updateByPrimaryKeySelective(record);
        return succMsg();
    }

    @Logs
    @ApiOperation(value = "查询WtGly清单", notes = "查询WtGly清单")
    @RequestMapping(value = "/selectListPageByEntity", method = RequestMethod.POST)
    public JsonResult<BaseCommPager<WtGlyEntity>> selectListPageByEntity(@RequestBody BasePageSearch<WtGlyEntity> record) {
        setPageHelper(record);
        WtGlyEntity entity = record.getSearch();
        if (entity == null) {
            entity = new WtGlyEntity();
        }
        List<WtGlyEntity> list = wtGlyService.selectListByEntity(entity);
        return succMsgData(new BaseCommPager<WtGlyEntity>(list));
    }


    @Logs
    @ApiOperation(value = "查询WtGly列表", notes = "查询WtGly列表")
    @RequestMapping(value = "/selectListByEntity", method = RequestMethod.POST)
    public JsonResult<List<WtGlyEntity>> selectListByEntity(@RequestBody WtGlyEntity record) {
        List<WtGlyEntity> list = wtGlyService.selectListByEntity(record);
        return succMsgData(list);
    }

    @Logs
    @ApiOperation(value = "删除WtGly信息", notes = "删除WtGly信息")
    @RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
    public JsonResult<Object> deleteByPrimaryKey(@RequestParam String glyNo) {
        wtGlyService.deleteByPrimaryKey(glyNo);
        return succMsg();
    }

    @Logs
    @ApiOperation(value = "查询WtGly信息", notes = "查询WtGly信息")
    @RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
    public JsonResult<WtGlyEntity> selectByPrimaryKey(@RequestParam String glyNo) {
        WtGlyEntity entity = wtGlyService.selectByPrimaryKey(glyNo);
        return succMsgData(entity);
    }

    @Logs
    @ApiOperation(value = "登录验证", notes = "登录验证")
    @RequestMapping(value = "/glyLoginCheck", method = RequestMethod.POST)
    public JsonResult<WtGlyEntity> glyLoginCheck(@RequestBody WtGlyEntity record) {

        //根据账号和密码判断该人员是否存在u
        WtGlyEntity gly = new WtGlyEntity();
        gly = wtGlyService.selectByPrimaryKey(record.getGlyNo());
        if (gly == null) {
            return failMsg("用户名不存在");
        } else {
            if (StringUtils.isBlank(gly.getGlyPass())) {
                if (!gly.getGlyPass().equals(record.getGlyPass())) {
                    WtGlyEntity wtGlyEntity = new WtGlyEntity();
                    wtGlyEntity.setGlyNo(record.getGlyNo());
                    wtGlyEntity.setGlyPass(record.getGlyPass());
                    wtGlyService.updatePwd(wtGlyEntity);
                } else {
                    return failMsg("用户名密码错误");
                }
            } else {
                if (!record.getGlyPass().equals(gly.getGlyPass())) {
                    return failMsg("用户名密码错误");
                }
            }
        }

//        //插入登录操作日志
//        LoginLogEntity loginLogEntity = new LoginLogEntity();
//        loginLogEntity.setLx(1);
//        loginLogEntity.setLogBz("用户登录");
//        loginLogEntity.setUserNo(record.getUserNo());
//        loginLogEntity.setOpenid(record.getOpenId());
//        loginLogEntity.setLogSj(DateUtils.getCurrentDateTime());
//        loginLogEntity.setUserSerial(user.getUserSerial());
//        loginLogEntity.setUserLname(user.getUserLname());
//        loginLogService.insert(loginLogEntity);
        return succMsgData(gly);
    }


    @Logs
    @ApiOperation(value = "获取jwt", notes = "获取jwt")
    @RequestMapping(value = "/getJwt", method = RequestMethod.POST)
    // @ApiImplicitParam(name = "Authorization", required = false)
    public JsonResult<String> getJwt(@RequestBody WtGlyEntity record) {
        JsonResult<WtGlyEntity> result = glyLoginCheck(record);
        if (null != result.getData()) {
            JwtParams jwtParams = new JwtParams();
            jwtParams.setAud(record.getGlyNo());
            JwtEntity jwtEntity = new JwtEntity();
            jwtEntity.setJwtParams(jwtParams);
            JSONObject jsonData = new JSONObject();
            jsonData.put("loginUserId", record.getGlyNo());
            jwtEntity.setPdata(jsonData);
            String jwt = new String("");
            try {
                jwt = JwtUtils.createJWT(jwtEntity);
            } catch (Exception ex) {
                return failMsg(ex.getMessage());
            }
            return succMsg(jwt);
        }
        return failMsg(result.getMsg());
    }

//    @Logs
//    @ApiOperation(value = "刷新jwt", notes = "刷新jwt")
//    @RequestMapping(value = "/refreshJwt", method = RequestMethod.POST)
//    // @ApiImplicitParam(name = "Authorization", required = false)
//    public JsonResult<String> refreshJwt(@RequestParam String jwt,@RequestBody WtGlyEntity record) {
//        try {
//            JwtParams jwtParams = new JwtParams();
//            jwtParams.setAud(record.getGlyNo());
//            jwt = JwtUtils.refreshJWT(jwt, jwtParams);
//        } catch (Exception ex) {
//            return failMsg(ex.getMessage());
//        }
//        return succMsg(jwt);
//    }
}