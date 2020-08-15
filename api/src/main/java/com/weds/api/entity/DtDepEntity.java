package com.weds.api.entity;

import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.Size;

public class DtDepEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "10000", value = "部门序号")
    private Long depSerial;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "0", value = "父部门序号")
    private Integer depParent;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "1", value = "顺序号")
    private Integer depOrder;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "部门", value = "部门名称")
    private String depName;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = false, dataType = "string", example = "001", value = "部门编号")
    private String depNo;

    /**
     *
     */
    @Size(max = 10)
    @ApiModelProperty(required = false, dataType = "string", example = "0", value = "部门规则")
    private String depRule;


    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column dt_dep.dep_serial
     *
     * @return the value of dt_dep.dep_serial
     */
    public Long getDepSerial() {
        return depSerial;
    }

    /**
     */
    public DtDepEntity withDepSerial(Long depSerial) {
        this.setDepSerial(depSerial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_dep.dep_serial
     *
     * @param depSerial the value for dt_dep.dep_serial
     */
    public void setDepSerial(Long depSerial) {
        this.depSerial = depSerial;
    }

    /**
     * This method returns the value of the database column dt_dep.dep_parent
     *
     * @return the value of dt_dep.dep_parent
     */
    public Integer getDepParent() {
        return depParent;
    }

    /**
     */
    public DtDepEntity withDepParent(Integer depParent) {
        this.setDepParent(depParent);
        return this;
    }

    /**
     * This method sets the value of the database column dt_dep.dep_parent
     *
     * @param depParent the value for dt_dep.dep_parent
     */
    public void setDepParent(Integer depParent) {
        this.depParent = depParent;
    }

    /**
     * This method returns the value of the database column dt_dep.dep_order
     *
     * @return the value of dt_dep.dep_order
     */
    public Integer getDepOrder() {
        return depOrder;
    }

    /**
     */
    public DtDepEntity withDepOrder(Integer depOrder) {
        this.setDepOrder(depOrder);
        return this;
    }

    /**
     * This method sets the value of the database column dt_dep.dep_order
     *
     * @param depOrder the value for dt_dep.dep_order
     */
    public void setDepOrder(Integer depOrder) {
        this.depOrder = depOrder;
    }

    /**
     * This method returns the value of the database column dt_dep.dep_name
     *
     * @return the value of dt_dep.dep_name
     */
    public String getDepName() {
        return depName;
    }

    /**
     */
    public DtDepEntity withDepName(String depName) {
        this.setDepName(depName);
        return this;
    }

    /**
     * This method sets the value of the database column dt_dep.dep_name
     *
     * @param depName the value for dt_dep.dep_name
     */
    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     * This method returns the value of the database column dt_dep.dep_no
     *
     * @return the value of dt_dep.dep_no
     */
    public String getDepNo() {
        return depNo;
    }

    /**
     */
    public DtDepEntity withDepNo(String depNo) {
        this.setDepNo(depNo);
        return this;
    }

    /**
     * This method sets the value of the database column dt_dep.dep_no
     *
     * @param depNo the value for dt_dep.dep_no
     */
    public void setDepNo(String depNo) {
        this.depNo = depNo;
    }

    /**
     * This method returns the value of the database column dt_dep.dep_rule
     *
     * @return the value of dt_dep.dep_rule
     */
    public String getDepRule() {
        return depRule;
    }

    /**
     */
    public DtDepEntity withDepRule(String depRule) {
        this.setDepRule(depRule);
        return this;
    }

    /**
     * This method sets the value of the database column dt_dep.dep_rule
     *
     * @param depRule the value for dt_dep.dep_rule
     */
    public void setDepRule(String depRule) {
        this.depRule = depRule;
    }



    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}