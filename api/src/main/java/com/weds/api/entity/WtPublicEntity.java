package com.weds.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

public class WtPublicEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer xh;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer lx;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer isAll;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer logType;

    /**
     *
     */
    @Size(max = 19)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private Long userSerial;

    /**
     *
     */
    @Size(max = 7)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String devSerial;

    /**
     *
     */
    @Size(max = 19)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private Long cardSerial;

    /**
     *
     */
    @Size(max = 19)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private Long newNumber;

    /**
     *
     */
    @Size(max = 19)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private Long oldNumber;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2019-05-25 17:28:58", value = "")
    private Date logSj;

    /**
     *
     */
    @Size(max = 30)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String logIp;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String glyNo;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column wt_public.xh
     *
     * @return the value of wt_public.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public WtPublicEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column wt_public.xh
     *
     * @param xh the value for wt_public.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column wt_public.lx
     *
     * @return the value of wt_public.lx
     */
    public Integer getLx() {
        return lx;
    }

    /**
     */
    public WtPublicEntity withLx(Integer lx) {
        this.setLx(lx);
        return this;
    }

    /**
     * This method sets the value of the database column wt_public.lx
     *
     * @param lx the value for wt_public.lx
     */
    public void setLx(Integer lx) {
        this.lx = lx;
    }

    /**
     * This method returns the value of the database column wt_public.is_all
     *
     * @return the value of wt_public.is_all
     */
    public Integer getIsAll() {
        return isAll;
    }

    /**
     */
    public WtPublicEntity withIsAll(Integer isAll) {
        this.setIsAll(isAll);
        return this;
    }

    /**
     * This method sets the value of the database column wt_public.is_all
     *
     * @param isAll the value for wt_public.is_all
     */
    public void setIsAll(Integer isAll) {
        this.isAll = isAll;
    }

    /**
     * This method returns the value of the database column wt_public.log_type
     *
     * @return the value of wt_public.log_type
     */
    public Integer getLogType() {
        return logType;
    }

    /**
     */
    public WtPublicEntity withLogType(Integer logType) {
        this.setLogType(logType);
        return this;
    }

    /**
     * This method sets the value of the database column wt_public.log_type
     *
     * @param logType the value for wt_public.log_type
     */
    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    /**
     * This method returns the value of the database column wt_public.user_serial
     *
     * @return the value of wt_public.user_serial
     */
    public Long getUserSerial() {
        return userSerial;
    }

    /**
     */
    public WtPublicEntity withUserSerial(Long userSerial) {
        this.setUserSerial(userSerial);
        return this;
    }

    /**
     * This method sets the value of the database column wt_public.user_serial
     *
     * @param userSerial the value for wt_public.user_serial
     */
    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

    /**
     * This method returns the value of the database column wt_public.dev_serial
     *
     * @return the value of wt_public.dev_serial
     */
    public String getDevSerial() {
        return devSerial;
    }

    /**
     */
    public WtPublicEntity withDevSerial(String devSerial) {
        this.setDevSerial(devSerial);
        return this;
    }

    /**
     * This method sets the value of the database column wt_public.dev_serial
     *
     * @param devSerial the value for wt_public.dev_serial
     */
    public void setDevSerial(String devSerial) {
        this.devSerial = devSerial;
    }

    /**
     * This method returns the value of the database column wt_public.card_serial
     *
     * @return the value of wt_public.card_serial
     */
    public Long getCardSerial() {
        return cardSerial;
    }

    /**
     */
    public WtPublicEntity withCardSerial(Long cardSerial) {
        this.setCardSerial(cardSerial);
        return this;
    }

    /**
     * This method sets the value of the database column wt_public.card_serial
     *
     * @param cardSerial the value for wt_public.card_serial
     */
    public void setCardSerial(Long cardSerial) {
        this.cardSerial = cardSerial;
    }

    /**
     * This method returns the value of the database column wt_public.new_number
     *
     * @return the value of wt_public.new_number
     */
    public Long getNewNumber() {
        return newNumber;
    }

    /**
     */
    public WtPublicEntity withNewNumber(Long newNumber) {
        this.setNewNumber(newNumber);
        return this;
    }

    /**
     * This method sets the value of the database column wt_public.new_number
     *
     * @param newNumber the value for wt_public.new_number
     */
    public void setNewNumber(Long newNumber) {
        this.newNumber = newNumber;
    }

    /**
     * This method returns the value of the database column wt_public.old_number
     *
     * @return the value of wt_public.old_number
     */
    public Long getOldNumber() {
        return oldNumber;
    }

    /**
     */
    public WtPublicEntity withOldNumber(Long oldNumber) {
        this.setOldNumber(oldNumber);
        return this;
    }

    /**
     * This method sets the value of the database column wt_public.old_number
     *
     * @param oldNumber the value for wt_public.old_number
     */
    public void setOldNumber(Long oldNumber) {
        this.oldNumber = oldNumber;
    }

    /**
     * This method returns the value of the database column wt_public.log_sj
     *
     * @return the value of wt_public.log_sj
     */
    public Date getLogSj() {
        return logSj;
    }

    /**
     */
    public WtPublicEntity withLogSj(Date logSj) {
        this.setLogSj(logSj);
        return this;
    }

    /**
     * This method sets the value of the database column wt_public.log_sj
     *
     * @param logSj the value for wt_public.log_sj
     */
    public void setLogSj(Date logSj) {
        this.logSj = logSj;
    }

    /**
     * This method returns the value of the database column wt_public.log_ip
     *
     * @return the value of wt_public.log_ip
     */
    public String getLogIp() {
        return logIp;
    }

    /**
     */
    public WtPublicEntity withLogIp(String logIp) {
        this.setLogIp(logIp);
        return this;
    }

    /**
     * This method sets the value of the database column wt_public.log_ip
     *
     * @param logIp the value for wt_public.log_ip
     */
    public void setLogIp(String logIp) {
        this.logIp = logIp;
    }

    /**
     * This method returns the value of the database column wt_public.gly_no
     *
     * @return the value of wt_public.gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public WtPublicEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column wt_public.gly_no
     *
     * @param glyNo the value for wt_public.gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}