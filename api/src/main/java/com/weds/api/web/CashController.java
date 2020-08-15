package com.weds.api.web;

import com.weds.api.service.CashService;
import com.weds.core.annotation.Logs;
import com.weds.core.base.BaseController;
import com.weds.core.resp.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import com.weds.api.entity.RechargeCashEntity;

/**
 * @Author
 * @Description 现金管理
 * @Date 2020-03-11
 */
@RestController
@RequestMapping(value = "/cash")
@Api(value = "现金管理", description = "现金管理")
public class CashController extends BaseController {
    @Resource
    private CashService cashService;

    @Resource
    private HttpServletResponse response;

    private Logger log = LogManager.getLogger();

    @Logs
    @ApiOperation(value = "充现金", notes = "充现金")
    @RequestMapping(value = "/rechargeCash", method = RequestMethod.POST)
    public JsonResult rechargeCash(@RequestBody RechargeCashEntity record) {
         return cashService.rechargeCash(record);
    }
}