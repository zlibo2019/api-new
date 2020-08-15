package com.weds.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

public class DtAcLinkEntity implements Serializable {
    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Long userSerial;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer xh;

    /**
     *
     */
    @Size(max = 16)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String cardSerial;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer cardOrder;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal acMoney;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal acAddm;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal acAddo;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal acSubm;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal acSubo;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal acRegm;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal acMake;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acEachm;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acEacho;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal acBlockm;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal acBlocks;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acBlocke;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-11 10:40:36", value = "")
    private Date subKssj;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-11 10:40:36", value = "")
    private Date subJssj;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer subOrder;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer jlCount;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acState;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-11 10:40:36", value = "")
    private Date sj;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String glyNo;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-11 10:40:36", value = "")
    private Date eachJssj;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-11 10:40:36", value = "")
    private Date eachKssj;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer eachOrder;

    /**
     *
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String cardHao;

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "0", value = "0")
    private Integer userType;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column dt_ac_link.user_serial
     *
     * @return the value of dt_ac_link.user_serial
     */
    public Long getUserSerial() {
        return userSerial;
    }

    /**
     */
    public DtAcLinkEntity withUserSerial(Long userSerial) {
        this.setUserSerial(userSerial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.user_serial
     *
     * @param userSerial the value for dt_ac_link.user_serial
     */
    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

    /**
     * This method returns the value of the database column dt_ac_link.xh
     *
     * @return the value of dt_ac_link.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public DtAcLinkEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.xh
     *
     * @param xh the value for dt_ac_link.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column dt_ac_link.card_serial
     *
     * @return the value of dt_ac_link.card_serial
     */
    public String getCardSerial() {
        return cardSerial;
    }

    /**
     */
    public DtAcLinkEntity withCardSerial(String cardSerial) {
        this.setCardSerial(cardSerial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.card_serial
     *
     * @param cardSerial the value for dt_ac_link.card_serial
     */
    public void setCardSerial(String cardSerial) {
        this.cardSerial = cardSerial;
    }

    /**
     * This method returns the value of the database column dt_ac_link.card_order
     *
     * @return the value of dt_ac_link.card_order
     */
    public Integer getCardOrder() {
        return cardOrder;
    }

    /**
     */
    public DtAcLinkEntity withCardOrder(Integer cardOrder) {
        this.setCardOrder(cardOrder);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.card_order
     *
     * @param cardOrder the value for dt_ac_link.card_order
     */
    public void setCardOrder(Integer cardOrder) {
        this.cardOrder = cardOrder;
    }

    /**
     * This method returns the value of the database column dt_ac_link.ac_money
     *
     * @return the value of dt_ac_link.ac_money
     */
    public BigDecimal getAcMoney() {
        return acMoney;
    }

    /**
     */
    public DtAcLinkEntity withAcMoney(BigDecimal acMoney) {
        this.setAcMoney(acMoney);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.ac_money
     *
     * @param acMoney the value for dt_ac_link.ac_money
     */
    public void setAcMoney(BigDecimal acMoney) {
        this.acMoney = acMoney;
    }

    /**
     * This method returns the value of the database column dt_ac_link.ac_addm
     *
     * @return the value of dt_ac_link.ac_addm
     */
    public BigDecimal getAcAddm() {
        return acAddm;
    }

    /**
     */
    public DtAcLinkEntity withAcAddm(BigDecimal acAddm) {
        this.setAcAddm(acAddm);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.ac_addm
     *
     * @param acAddm the value for dt_ac_link.ac_addm
     */
    public void setAcAddm(BigDecimal acAddm) {
        this.acAddm = acAddm;
    }

    /**
     * This method returns the value of the database column dt_ac_link.ac_addo
     *
     * @return the value of dt_ac_link.ac_addo
     */
    public BigDecimal getAcAddo() {
        return acAddo;
    }

    /**
     */
    public DtAcLinkEntity withAcAddo(BigDecimal acAddo) {
        this.setAcAddo(acAddo);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.ac_addo
     *
     * @param acAddo the value for dt_ac_link.ac_addo
     */
    public void setAcAddo(BigDecimal acAddo) {
        this.acAddo = acAddo;
    }

    /**
     * This method returns the value of the database column dt_ac_link.ac_subm
     *
     * @return the value of dt_ac_link.ac_subm
     */
    public BigDecimal getAcSubm() {
        return acSubm;
    }

    /**
     */
    public DtAcLinkEntity withAcSubm(BigDecimal acSubm) {
        this.setAcSubm(acSubm);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.ac_subm
     *
     * @param acSubm the value for dt_ac_link.ac_subm
     */
    public void setAcSubm(BigDecimal acSubm) {
        this.acSubm = acSubm;
    }

    /**
     * This method returns the value of the database column dt_ac_link.ac_subo
     *
     * @return the value of dt_ac_link.ac_subo
     */
    public BigDecimal getAcSubo() {
        return acSubo;
    }

    /**
     */
    public DtAcLinkEntity withAcSubo(BigDecimal acSubo) {
        this.setAcSubo(acSubo);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.ac_subo
     *
     * @param acSubo the value for dt_ac_link.ac_subo
     */
    public void setAcSubo(BigDecimal acSubo) {
        this.acSubo = acSubo;
    }

    /**
     * This method returns the value of the database column dt_ac_link.ac_regm
     *
     * @return the value of dt_ac_link.ac_regm
     */
    public BigDecimal getAcRegm() {
        return acRegm;
    }

    /**
     */
    public DtAcLinkEntity withAcRegm(BigDecimal acRegm) {
        this.setAcRegm(acRegm);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.ac_regm
     *
     * @param acRegm the value for dt_ac_link.ac_regm
     */
    public void setAcRegm(BigDecimal acRegm) {
        this.acRegm = acRegm;
    }

    /**
     * This method returns the value of the database column dt_ac_link.ac_make
     *
     * @return the value of dt_ac_link.ac_make
     */
    public BigDecimal getAcMake() {
        return acMake;
    }

    /**
     */
    public DtAcLinkEntity withAcMake(BigDecimal acMake) {
        this.setAcMake(acMake);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.ac_make
     *
     * @param acMake the value for dt_ac_link.ac_make
     */
    public void setAcMake(BigDecimal acMake) {
        this.acMake = acMake;
    }

    /**
     * This method returns the value of the database column dt_ac_link.ac_eachm
     *
     * @return the value of dt_ac_link.ac_eachm
     */
    public Integer getAcEachm() {
        return acEachm;
    }

    /**
     */
    public DtAcLinkEntity withAcEachm(Integer acEachm) {
        this.setAcEachm(acEachm);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.ac_eachm
     *
     * @param acEachm the value for dt_ac_link.ac_eachm
     */
    public void setAcEachm(Integer acEachm) {
        this.acEachm = acEachm;
    }

    /**
     * This method returns the value of the database column dt_ac_link.ac_eacho
     *
     * @return the value of dt_ac_link.ac_eacho
     */
    public Integer getAcEacho() {
        return acEacho;
    }

    /**
     */
    public DtAcLinkEntity withAcEacho(Integer acEacho) {
        this.setAcEacho(acEacho);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.ac_eacho
     *
     * @param acEacho the value for dt_ac_link.ac_eacho
     */
    public void setAcEacho(Integer acEacho) {
        this.acEacho = acEacho;
    }

    /**
     * This method returns the value of the database column dt_ac_link.ac_blockm
     *
     * @return the value of dt_ac_link.ac_blockm
     */
    public BigDecimal getAcBlockm() {
        return acBlockm;
    }

    /**
     */
    public DtAcLinkEntity withAcBlockm(BigDecimal acBlockm) {
        this.setAcBlockm(acBlockm);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.ac_blockm
     *
     * @param acBlockm the value for dt_ac_link.ac_blockm
     */
    public void setAcBlockm(BigDecimal acBlockm) {
        this.acBlockm = acBlockm;
    }

    /**
     * This method returns the value of the database column dt_ac_link.ac_blocks
     *
     * @return the value of dt_ac_link.ac_blocks
     */
    public BigDecimal getAcBlocks() {
        return acBlocks;
    }

    /**
     */
    public DtAcLinkEntity withAcBlocks(BigDecimal acBlocks) {
        this.setAcBlocks(acBlocks);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.ac_blocks
     *
     * @param acBlocks the value for dt_ac_link.ac_blocks
     */
    public void setAcBlocks(BigDecimal acBlocks) {
        this.acBlocks = acBlocks;
    }

    /**
     * This method returns the value of the database column dt_ac_link.ac_blocke
     *
     * @return the value of dt_ac_link.ac_blocke
     */
    public Integer getAcBlocke() {
        return acBlocke;
    }

    /**
     */
    public DtAcLinkEntity withAcBlocke(Integer acBlocke) {
        this.setAcBlocke(acBlocke);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.ac_blocke
     *
     * @param acBlocke the value for dt_ac_link.ac_blocke
     */
    public void setAcBlocke(Integer acBlocke) {
        this.acBlocke = acBlocke;
    }

    /**
     * This method returns the value of the database column dt_ac_link.sub_kssj
     *
     * @return the value of dt_ac_link.sub_kssj
     */
    public Date getSubKssj() {
        return subKssj;
    }

    /**
     */
    public DtAcLinkEntity withSubKssj(Date subKssj) {
        this.setSubKssj(subKssj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.sub_kssj
     *
     * @param subKssj the value for dt_ac_link.sub_kssj
     */
    public void setSubKssj(Date subKssj) {
        this.subKssj = subKssj;
    }

    /**
     * This method returns the value of the database column dt_ac_link.sub_jssj
     *
     * @return the value of dt_ac_link.sub_jssj
     */
    public Date getSubJssj() {
        return subJssj;
    }

    /**
     */
    public DtAcLinkEntity withSubJssj(Date subJssj) {
        this.setSubJssj(subJssj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.sub_jssj
     *
     * @param subJssj the value for dt_ac_link.sub_jssj
     */
    public void setSubJssj(Date subJssj) {
        this.subJssj = subJssj;
    }

    /**
     * This method returns the value of the database column dt_ac_link.sub_order
     *
     * @return the value of dt_ac_link.sub_order
     */
    public Integer getSubOrder() {
        return subOrder;
    }

    /**
     */
    public DtAcLinkEntity withSubOrder(Integer subOrder) {
        this.setSubOrder(subOrder);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.sub_order
     *
     * @param subOrder the value for dt_ac_link.sub_order
     */
    public void setSubOrder(Integer subOrder) {
        this.subOrder = subOrder;
    }

    /**
     * This method returns the value of the database column dt_ac_link.jl_count
     *
     * @return the value of dt_ac_link.jl_count
     */
    public Integer getJlCount() {
        return jlCount;
    }

    /**
     */
    public DtAcLinkEntity withJlCount(Integer jlCount) {
        this.setJlCount(jlCount);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.jl_count
     *
     * @param jlCount the value for dt_ac_link.jl_count
     */
    public void setJlCount(Integer jlCount) {
        this.jlCount = jlCount;
    }

    /**
     * This method returns the value of the database column dt_ac_link.ac_state
     *
     * @return the value of dt_ac_link.ac_state
     */
    public Integer getAcState() {
        return acState;
    }

    /**
     */
    public DtAcLinkEntity withAcState(Integer acState) {
        this.setAcState(acState);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.ac_state
     *
     * @param acState the value for dt_ac_link.ac_state
     */
    public void setAcState(Integer acState) {
        this.acState = acState;
    }

    /**
     * This method returns the value of the database column dt_ac_link.sj
     *
     * @return the value of dt_ac_link.sj
     */
    public Date getSj() {
        return sj;
    }

    /**
     */
    public DtAcLinkEntity withSj(Date sj) {
        this.setSj(sj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.sj
     *
     * @param sj the value for dt_ac_link.sj
     */
    public void setSj(Date sj) {
        this.sj = sj;
    }

    /**
     * This method returns the value of the database column dt_ac_link.gly_no
     *
     * @return the value of dt_ac_link.gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public DtAcLinkEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.gly_no
     *
     * @param glyNo the value for dt_ac_link.gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column dt_ac_link.each_jssj
     *
     * @return the value of dt_ac_link.each_jssj
     */
    public Date getEachJssj() {
        return eachJssj;
    }

    /**
     */
    public DtAcLinkEntity withEachJssj(Date eachJssj) {
        this.setEachJssj(eachJssj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.each_jssj
     *
     * @param eachJssj the value for dt_ac_link.each_jssj
     */
    public void setEachJssj(Date eachJssj) {
        this.eachJssj = eachJssj;
    }

    /**
     * This method returns the value of the database column dt_ac_link.each_kssj
     *
     * @return the value of dt_ac_link.each_kssj
     */
    public Date getEachKssj() {
        return eachKssj;
    }

    /**
     */
    public DtAcLinkEntity withEachKssj(Date eachKssj) {
        this.setEachKssj(eachKssj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.each_kssj
     *
     * @param eachKssj the value for dt_ac_link.each_kssj
     */
    public void setEachKssj(Date eachKssj) {
        this.eachKssj = eachKssj;
    }

    /**
     * This method returns the value of the database column dt_ac_link.each_order
     *
     * @return the value of dt_ac_link.each_order
     */
    public Integer getEachOrder() {
        return eachOrder;
    }

    /**
     */
    public DtAcLinkEntity withEachOrder(Integer eachOrder) {
        this.setEachOrder(eachOrder);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.each_order
     *
     * @param eachOrder the value for dt_ac_link.each_order
     */
    public void setEachOrder(Integer eachOrder) {
        this.eachOrder = eachOrder;
    }

    /**
     * This method returns the value of the database column dt_ac_link.card_hao
     *
     * @return the value of dt_ac_link.card_hao
     */
    public String getCardHao() {
        return cardHao;
    }

    /**
     */
    public DtAcLinkEntity withCardHao(String cardHao) {
        this.setCardHao(cardHao);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_link.card_hao
     *
     * @param cardHao the value for dt_ac_link.card_hao
     */
    public void setCardHao(String cardHao) {
        this.cardHao = cardHao;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}