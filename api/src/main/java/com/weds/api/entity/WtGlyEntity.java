package com.weds.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Size;

public class WtGlyEntity implements Serializable {
    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "guest", value = "")
    private String glyNo;

    /**
     *
     */
    @Size(max = 100)
    @ApiModelProperty(required = false, dataType = "string", example = "test", value = "")
    private String glyLname;

    /**
     *
     */
    @Size(max = 255)
    @ApiModelProperty(required = true, dataType = "string", example = "guest", value = "")
    private String glyPass;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "-1", value = "")
    private Integer glyLx;

    /**
     *
     */
    @Size(max = 16)
    @ApiModelProperty(required = false, dataType = "string", example = "test", value = "")
    private String glyGroup;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = false, dataType = "string", example = "test", value = "")
    private String glyPhone;

    /**
     *
     */
    @Size(max = 255)
    @ApiModelProperty(required = false, dataType = "string", example = "test", value = "")
    private String glyEmail;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "-1", value = "")
    private Integer glySerial;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = false, dataType = "string", example = "test", value = "")
    private String glyParent;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = false, dataType = "string", example = "2020-03-07 09:03:14", value = "")
    private Date glySj;

    /**
     *
     */
    @Size(max = 200)
    @ApiModelProperty(required = false, dataType = "string", example = "test", value = "")
    private String glyBz;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "-1", value = "")
    private Integer glyImg;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = false, dataType = "string", example = "test", value = "")
    private String glyRegserial;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column WT_GLY.Gly_no
     *
     * @return the value of WT_GLY.Gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public WtGlyEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column WT_GLY.Gly_no
     *
     * @param glyNo the value for WT_GLY.Gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column WT_GLY.Gly_lname
     *
     * @return the value of WT_GLY.Gly_lname
     */
    public String getGlyLname() {
        return glyLname;
    }

    /**
     */
    public WtGlyEntity withGlyLname(String glyLname) {
        this.setGlyLname(glyLname);
        return this;
    }

    /**
     * This method sets the value of the database column WT_GLY.Gly_lname
     *
     * @param glyLname the value for WT_GLY.Gly_lname
     */
    public void setGlyLname(String glyLname) {
        this.glyLname = glyLname;
    }

    /**
     * This method returns the value of the database column WT_GLY.Gly_pass
     *
     * @return the value of WT_GLY.Gly_pass
     */
    public String getGlyPass() {
        return glyPass;
    }

    /**
     */
    public WtGlyEntity withGlyPass(String glyPass) {
        this.setGlyPass(glyPass);
        return this;
    }

    /**
     * This method sets the value of the database column WT_GLY.Gly_pass
     *
     * @param glyPass the value for WT_GLY.Gly_pass
     */
    public void setGlyPass(String glyPass) {
        this.glyPass = glyPass;
    }

    /**
     * This method returns the value of the database column WT_GLY.Gly_lx
     *
     * @return the value of WT_GLY.Gly_lx
     */
    public Integer getGlyLx() {
        return glyLx;
    }

    /**
     */
    public WtGlyEntity withGlyLx(Integer glyLx) {
        this.setGlyLx(glyLx);
        return this;
    }

    /**
     * This method sets the value of the database column WT_GLY.Gly_lx
     *
     * @param glyLx the value for WT_GLY.Gly_lx
     */
    public void setGlyLx(Integer glyLx) {
        this.glyLx = glyLx;
    }

    /**
     * This method returns the value of the database column WT_GLY.Gly_group
     *
     * @return the value of WT_GLY.Gly_group
     */
    public String getGlyGroup() {
        return glyGroup;
    }

    /**
     */
    public WtGlyEntity withGlyGroup(String glyGroup) {
        this.setGlyGroup(glyGroup);
        return this;
    }

    /**
     * This method sets the value of the database column WT_GLY.Gly_group
     *
     * @param glyGroup the value for WT_GLY.Gly_group
     */
    public void setGlyGroup(String glyGroup) {
        this.glyGroup = glyGroup;
    }

    /**
     * This method returns the value of the database column WT_GLY.Gly_phone
     *
     * @return the value of WT_GLY.Gly_phone
     */
    public String getGlyPhone() {
        return glyPhone;
    }

    /**
     */
    public WtGlyEntity withGlyPhone(String glyPhone) {
        this.setGlyPhone(glyPhone);
        return this;
    }

    /**
     * This method sets the value of the database column WT_GLY.Gly_phone
     *
     * @param glyPhone the value for WT_GLY.Gly_phone
     */
    public void setGlyPhone(String glyPhone) {
        this.glyPhone = glyPhone;
    }

    /**
     * This method returns the value of the database column WT_GLY.Gly_email
     *
     * @return the value of WT_GLY.Gly_email
     */
    public String getGlyEmail() {
        return glyEmail;
    }

    /**
     */
    public WtGlyEntity withGlyEmail(String glyEmail) {
        this.setGlyEmail(glyEmail);
        return this;
    }

    /**
     * This method sets the value of the database column WT_GLY.Gly_email
     *
     * @param glyEmail the value for WT_GLY.Gly_email
     */
    public void setGlyEmail(String glyEmail) {
        this.glyEmail = glyEmail;
    }

    /**
     * This method returns the value of the database column WT_GLY.Gly_serial
     *
     * @return the value of WT_GLY.Gly_serial
     */
    public Integer getGlySerial() {
        return glySerial;
    }

    /**
     */
    public WtGlyEntity withGlySerial(Integer glySerial) {
        this.setGlySerial(glySerial);
        return this;
    }

    /**
     * This method sets the value of the database column WT_GLY.Gly_serial
     *
     * @param glySerial the value for WT_GLY.Gly_serial
     */
    public void setGlySerial(Integer glySerial) {
        this.glySerial = glySerial;
    }

    /**
     * This method returns the value of the database column WT_GLY.Gly_parent
     *
     * @return the value of WT_GLY.Gly_parent
     */
    public String getGlyParent() {
        return glyParent;
    }

    /**
     */
    public WtGlyEntity withGlyParent(String glyParent) {
        this.setGlyParent(glyParent);
        return this;
    }

    /**
     * This method sets the value of the database column WT_GLY.Gly_parent
     *
     * @param glyParent the value for WT_GLY.Gly_parent
     */
    public void setGlyParent(String glyParent) {
        this.glyParent = glyParent;
    }

    /**
     * This method returns the value of the database column WT_GLY.Gly_sj
     *
     * @return the value of WT_GLY.Gly_sj
     */
    public Date getGlySj() {
        return glySj;
    }

    /**
     */
    public WtGlyEntity withGlySj(Date glySj) {
        this.setGlySj(glySj);
        return this;
    }

    /**
     * This method sets the value of the database column WT_GLY.Gly_sj
     *
     * @param glySj the value for WT_GLY.Gly_sj
     */
    public void setGlySj(Date glySj) {
        this.glySj = glySj;
    }

    /**
     * This method returns the value of the database column WT_GLY.Gly_bz
     *
     * @return the value of WT_GLY.Gly_bz
     */
    public String getGlyBz() {
        return glyBz;
    }

    /**
     */
    public WtGlyEntity withGlyBz(String glyBz) {
        this.setGlyBz(glyBz);
        return this;
    }

    /**
     * This method sets the value of the database column WT_GLY.Gly_bz
     *
     * @param glyBz the value for WT_GLY.Gly_bz
     */
    public void setGlyBz(String glyBz) {
        this.glyBz = glyBz;
    }

    /**
     * This method returns the value of the database column WT_GLY.gly_img
     *
     * @return the value of WT_GLY.gly_img
     */
    public Integer getGlyImg() {
        return glyImg;
    }

    /**
     */
    public WtGlyEntity withGlyImg(Integer glyImg) {
        this.setGlyImg(glyImg);
        return this;
    }

    /**
     * This method sets the value of the database column WT_GLY.gly_img
     *
     * @param glyImg the value for WT_GLY.gly_img
     */
    public void setGlyImg(Integer glyImg) {
        this.glyImg = glyImg;
    }

    /**
     * This method returns the value of the database column WT_GLY.gly_regserial
     *
     * @return the value of WT_GLY.gly_regserial
     */
    public String getGlyRegserial() {
        return glyRegserial;
    }

    /**
     */
    public WtGlyEntity withGlyRegserial(String glyRegserial) {
        this.setGlyRegserial(glyRegserial);
        return this;
    }

    /**
     * This method sets the value of the database column WT_GLY.gly_regserial
     *
     * @param glyRegserial the value for WT_GLY.gly_regserial
     */
    public void setGlyRegserial(String glyRegserial) {
        this.glyRegserial = glyRegserial;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}