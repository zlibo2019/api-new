package com.weds.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class MODULEEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "测试", value = "")
    private String moduleId;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer moduleLx;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "测试", value = "")
    private String moduleLname;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer moduleState;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "测试", value = "")
    private String moduleIni;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "测试", value = "")
    private Long moduleUser;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer moduleDep;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer modulePlace;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer moduleCard;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer modulePsam;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "测试", value = "")
    private String moduleDbname;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "测试", value = "")
    private String moduleImg;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer moduleLink;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer moduleSize;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer moduleSet;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "测试", value = "")
    private String moduleAc;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "测试", value = "")
    private String modulePath;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer moduleOrder;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2018-11-24 13:16:18", value = "")
    private Date moduleSj;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "测试", value = "")
    private String glyNo;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer isreal;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column WT_MODULE.Module_id
     *
     * @return the value of WT_MODULE.Module_id
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     */
    public MODULEEntity withModuleId(String moduleId) {
        this.setModuleId(moduleId);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Module_id
     *
     * @param moduleId the value for WT_MODULE.Module_id
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * This method returns the value of the database column WT_MODULE.Module_lx
     *
     * @return the value of WT_MODULE.Module_lx
     */
    public Integer getModuleLx() {
        return moduleLx;
    }

    /**
     */
    public MODULEEntity withModuleLx(Integer moduleLx) {
        this.setModuleLx(moduleLx);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Module_lx
     *
     * @param moduleLx the value for WT_MODULE.Module_lx
     */
    public void setModuleLx(Integer moduleLx) {
        this.moduleLx = moduleLx;
    }

    /**
     * This method returns the value of the database column WT_MODULE.Module_lname
     *
     * @return the value of WT_MODULE.Module_lname
     */
    public String getModuleLname() {
        return moduleLname;
    }

    /**
     */
    public MODULEEntity withModuleLname(String moduleLname) {
        this.setModuleLname(moduleLname);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Module_lname
     *
     * @param moduleLname the value for WT_MODULE.Module_lname
     */
    public void setModuleLname(String moduleLname) {
        this.moduleLname = moduleLname;
    }

    /**
     * This method returns the value of the database column WT_MODULE.module_state
     *
     * @return the value of WT_MODULE.module_state
     */
    public Integer getModuleState() {
        return moduleState;
    }

    /**
     */
    public MODULEEntity withModuleState(Integer moduleState) {
        this.setModuleState(moduleState);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.module_state
     *
     * @param moduleState the value for WT_MODULE.module_state
     */
    public void setModuleState(Integer moduleState) {
        this.moduleState = moduleState;
    }

    /**
     * This method returns the value of the database column WT_MODULE.module_ini
     *
     * @return the value of WT_MODULE.module_ini
     */
    public String getModuleIni() {
        return moduleIni;
    }

    /**
     */
    public MODULEEntity withModuleIni(String moduleIni) {
        this.setModuleIni(moduleIni);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.module_ini
     *
     * @param moduleIni the value for WT_MODULE.module_ini
     */
    public void setModuleIni(String moduleIni) {
        this.moduleIni = moduleIni;
    }

    /**
     * This method returns the value of the database column WT_MODULE.Module_user
     *
     * @return the value of WT_MODULE.Module_user
     */
    public Long getModuleUser() {
        return moduleUser;
    }

    /**
     */
    public MODULEEntity withModuleUser(Long moduleUser) {
        this.setModuleUser(moduleUser);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Module_user
     *
     * @param moduleUser the value for WT_MODULE.Module_user
     */
    public void setModuleUser(Long moduleUser) {
        this.moduleUser = moduleUser;
    }

    /**
     * This method returns the value of the database column WT_MODULE.Module_dep
     *
     * @return the value of WT_MODULE.Module_dep
     */
    public Integer getModuleDep() {
        return moduleDep;
    }

    /**
     */
    public MODULEEntity withModuleDep(Integer moduleDep) {
        this.setModuleDep(moduleDep);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Module_dep
     *
     * @param moduleDep the value for WT_MODULE.Module_dep
     */
    public void setModuleDep(Integer moduleDep) {
        this.moduleDep = moduleDep;
    }

    /**
     * This method returns the value of the database column WT_MODULE.Module_place
     *
     * @return the value of WT_MODULE.Module_place
     */
    public Integer getModulePlace() {
        return modulePlace;
    }

    /**
     */
    public MODULEEntity withModulePlace(Integer modulePlace) {
        this.setModulePlace(modulePlace);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Module_place
     *
     * @param modulePlace the value for WT_MODULE.Module_place
     */
    public void setModulePlace(Integer modulePlace) {
        this.modulePlace = modulePlace;
    }

    /**
     * This method returns the value of the database column WT_MODULE.Module_card
     *
     * @return the value of WT_MODULE.Module_card
     */
    public Integer getModuleCard() {
        return moduleCard;
    }

    /**
     */
    public MODULEEntity withModuleCard(Integer moduleCard) {
        this.setModuleCard(moduleCard);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Module_card
     *
     * @param moduleCard the value for WT_MODULE.Module_card
     */
    public void setModuleCard(Integer moduleCard) {
        this.moduleCard = moduleCard;
    }

    /**
     * This method returns the value of the database column WT_MODULE.Module_psam
     *
     * @return the value of WT_MODULE.Module_psam
     */
    public Integer getModulePsam() {
        return modulePsam;
    }

    /**
     */
    public MODULEEntity withModulePsam(Integer modulePsam) {
        this.setModulePsam(modulePsam);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Module_psam
     *
     * @param modulePsam the value for WT_MODULE.Module_psam
     */
    public void setModulePsam(Integer modulePsam) {
        this.modulePsam = modulePsam;
    }

    /**
     * This method returns the value of the database column WT_MODULE.Module_dbname
     *
     * @return the value of WT_MODULE.Module_dbname
     */
    public String getModuleDbname() {
        return moduleDbname;
    }

    /**
     */
    public MODULEEntity withModuleDbname(String moduleDbname) {
        this.setModuleDbname(moduleDbname);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Module_dbname
     *
     * @param moduleDbname the value for WT_MODULE.Module_dbname
     */
    public void setModuleDbname(String moduleDbname) {
        this.moduleDbname = moduleDbname;
    }

    /**
     * This method returns the value of the database column WT_MODULE.Module_img
     *
     * @return the value of WT_MODULE.Module_img
     */
    public String getModuleImg() {
        return moduleImg;
    }

    /**
     */
    public MODULEEntity withModuleImg(String moduleImg) {
        this.setModuleImg(moduleImg);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Module_img
     *
     * @param moduleImg the value for WT_MODULE.Module_img
     */
    public void setModuleImg(String moduleImg) {
        this.moduleImg = moduleImg;
    }

    /**
     * This method returns the value of the database column WT_MODULE.Module_link
     *
     * @return the value of WT_MODULE.Module_link
     */
    public Integer getModuleLink() {
        return moduleLink;
    }

    /**
     */
    public MODULEEntity withModuleLink(Integer moduleLink) {
        this.setModuleLink(moduleLink);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Module_link
     *
     * @param moduleLink the value for WT_MODULE.Module_link
     */
    public void setModuleLink(Integer moduleLink) {
        this.moduleLink = moduleLink;
    }

    /**
     * This method returns the value of the database column WT_MODULE.Module_size
     *
     * @return the value of WT_MODULE.Module_size
     */
    public Integer getModuleSize() {
        return moduleSize;
    }

    /**
     */
    public MODULEEntity withModuleSize(Integer moduleSize) {
        this.setModuleSize(moduleSize);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Module_size
     *
     * @param moduleSize the value for WT_MODULE.Module_size
     */
    public void setModuleSize(Integer moduleSize) {
        this.moduleSize = moduleSize;
    }

    /**
     * This method returns the value of the database column WT_MODULE.Module_set
     *
     * @return the value of WT_MODULE.Module_set
     */
    public Integer getModuleSet() {
        return moduleSet;
    }

    /**
     */
    public MODULEEntity withModuleSet(Integer moduleSet) {
        this.setModuleSet(moduleSet);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Module_set
     *
     * @param moduleSet the value for WT_MODULE.Module_set
     */
    public void setModuleSet(Integer moduleSet) {
        this.moduleSet = moduleSet;
    }

    /**
     * This method returns the value of the database column WT_MODULE.Module_ac
     *
     * @return the value of WT_MODULE.Module_ac
     */
    public String getModuleAc() {
        return moduleAc;
    }

    /**
     */
    public MODULEEntity withModuleAc(String moduleAc) {
        this.setModuleAc(moduleAc);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Module_ac
     *
     * @param moduleAc the value for WT_MODULE.Module_ac
     */
    public void setModuleAc(String moduleAc) {
        this.moduleAc = moduleAc;
    }

    /**
     * This method returns the value of the database column WT_MODULE.Module_path
     *
     * @return the value of WT_MODULE.Module_path
     */
    public String getModulePath() {
        return modulePath;
    }

    /**
     */
    public MODULEEntity withModulePath(String modulePath) {
        this.setModulePath(modulePath);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Module_path
     *
     * @param modulePath the value for WT_MODULE.Module_path
     */
    public void setModulePath(String modulePath) {
        this.modulePath = modulePath;
    }

    /**
     * This method returns the value of the database column WT_MODULE.Module_order
     *
     * @return the value of WT_MODULE.Module_order
     */
    public Integer getModuleOrder() {
        return moduleOrder;
    }

    /**
     */
    public MODULEEntity withModuleOrder(Integer moduleOrder) {
        this.setModuleOrder(moduleOrder);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Module_order
     *
     * @param moduleOrder the value for WT_MODULE.Module_order
     */
    public void setModuleOrder(Integer moduleOrder) {
        this.moduleOrder = moduleOrder;
    }

    /**
     * This method returns the value of the database column WT_MODULE.Module_sj
     *
     * @return the value of WT_MODULE.Module_sj
     */
    public Date getModuleSj() {
        return moduleSj;
    }

    /**
     */
    public MODULEEntity withModuleSj(Date moduleSj) {
        this.setModuleSj(moduleSj);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Module_sj
     *
     * @param moduleSj the value for WT_MODULE.Module_sj
     */
    public void setModuleSj(Date moduleSj) {
        this.moduleSj = moduleSj;
    }

    /**
     * This method returns the value of the database column WT_MODULE.Gly_no
     *
     * @return the value of WT_MODULE.Gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public MODULEEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.Gly_no
     *
     * @param glyNo the value for WT_MODULE.Gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column WT_MODULE.isReal
     *
     * @return the value of WT_MODULE.isReal
     */
    public Integer getIsreal() {
        return isreal;
    }

    /**
     */
    public MODULEEntity withIsreal(Integer isreal) {
        this.setIsreal(isreal);
        return this;
    }

    /**
     * This method sets the value of the database column WT_MODULE.isReal
     *
     * @param isreal the value for WT_MODULE.isReal
     */
    public void setIsreal(Integer isreal) {
        this.isreal = isreal;
    }
}