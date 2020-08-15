package com.weds.api.service;

import com.weds.api.entity.RechargeCashEntity;
import com.weds.core.base.BaseService;
import com.weds.core.resp.JsonResult;
import com.weds.web.comm.entity.CommProcEntity;
import com.weds.web.comm.service.CommProcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author
 * @Description DtUser管理
 * @Date 2020-03-05
 */
@Service
public class CashService extends BaseService {

    @Autowired
    private CommProcService commProcService;

    public JsonResult rechargeCash(RechargeCashEntity rechargeCashEntity) {
        try {
            CommProcEntity orgReq = new CommProcEntity();
            orgReq.setProcName("cs");    //Link_cardsave_account_jianhang
            List<Object> params = new ArrayList<Object>();
            params.add(0);         // 类型 0:人员；1：部门；3：读卡充值（需返还打印小票信息）
            params.add("1");         // reg_serial
            params.add("jianhang");   //gly_no
            params.add(rechargeCashEntity.getUserSerial().toString());     //人员序号，多人用逗号隔开
            params.add(rechargeCashEntity.getAmt()); //金额
            params.add("1");//client_id
            orgReq.setParams(params);
            List<List<Map>> resp = commProcService.loadProcData(orgReq);
            String result = resp.get(0).get(0).get("").toString();
            if ("0".equals(result)) {
                return succMsgData(0);
            } else {
                return failMsgData(-1);
            }
        } catch (Exception ex) {
            return failMsg(ex.getMessage());
        }
    }
}
