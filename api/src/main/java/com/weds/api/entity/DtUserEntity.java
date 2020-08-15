package com.weds.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author zlb
 * @Description 用户档案表
 * @Date 2020-07-28
 */
public class DtUserEntity extends BaseEntity implements Serializable {
    /**
     * 用户序号#1#1###
     */
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "用户序号#1#1###")
    private Long userSerial;

    /**
     * 用户工号#1#1###
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "用户工号#1#1###")
    private String userNo;

    /**
     * 身份证号
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "用户身份证号#1#1###")
    private String userId;

    /**
     * 用户姓名#1#1###
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "用户姓名#1#1###")
    private String userLname;

    /**
     * 员工分组号##1###
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "员工分组号##1###")
    private String userFname;

    /**
     * 部门编号##1###
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "部门编号##1###")
    private String depNo;

    /**
     * 部门序号#1#1###
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "部门序号#1#1###")
    private Integer userDep;

    /**
     * 部门名称#1#1###
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "部门名称#1#1###")
    private String userDepname;

    /**
     * 工作日期#1#1###
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2019-05-23 15:19:57", value = "工作日期#1#1###")
    private Date userWorkday;

    /**
     * 用户职务#1#1###
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "用户职务#1#1###")
    private String userDuty;

    /**
     * 用户卡号#1#1###
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "用户卡号#1#1###")
    private String userCard;

    /**
     * 用户指纹##1###
     */
    @Size(max = 10)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "用户指纹##1###")
    private String userFinger;

    /**
     * 用户密码##1###
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "用户密码##1###")
    private String userPassword;

    /**
     * 密码启用日期##1###
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2019-05-23 15:19:57", value = "密码启用日期##1###")
    private Date pwdBegin;

    /**
     * 密码结束日期##1###
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2019-05-23 15:19:57", value = "密码结束日期##1###")
    private Date pwdEnd;

    /**
     * 档案类型#1#1###
     */
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "档案类型#1#1###")
    private Short userType;

    /**
     * 档案有效开始日期##1###
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2019-05-23 15:19:57", value = "档案有效开始日期##1###")
    private Date pactBegin;

    /**
     * 档案有效结束日期##1###
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2019-05-23 15:19:57", value = "档案有效结束日期##1###")
    private Date pactEnd;

    /**
     * 是否管理考勤机##1###
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "是否管理考勤机##1###")
    private Integer userLevel;

    /**
     * 是否有档案照片##1###
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "是否有档案照片##1###")
    private Integer userPhoto;

    /**
     * 用户性别##1###
     */
    @Size(max = 8)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "用户性别##1###")
    private String userSex;

    /**
     * 用户种族##1###
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "用户种族##1###")
    private String userNation;

    /**
     * 用户学历##1###
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "用户学历##1###")
    private String userXueli;

    /**
     * 用户籍贯##1###
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "用户籍贯##1###")
    private String userNative;

    /**
     * 出生日期##1###
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2019-05-23 15:19:57", value = "出生日期##1###")
    private Date userBirthday;

    /**
     * 身份证号#1#1###
     */
    @Size(max = 30)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "身份证号#1#1###")
    private String credNo;

    /**
     * 邮编##1###
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "邮编##1###")
    private String userPost;

    /**
     * 联系人##1###
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "联系人##1###")
    private String userLinkman;

    /**
     * 联系电话#1#1###
     */
    @Size(max = 30)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "联系电话#1#1###")
    private String userTelephone;

    /**
     * 用户住址##1###
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "用户住址##1###")
    private String userAddress;

    /**
     * 用户邮箱##1###
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "用户邮箱##1###")
    private String userEmail;

    /**
     * 预留字段1##1###
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "预留字段1##1###")
    private String user1;

    /**
     * 预留字段2##1###
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "预留字段2##1###")
    private String user2;

    /**
     * 备注##1###
     */
    @Size(max = 200)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "备注##1###")
    private String userBz;

    /**
     * 考勤规则##1###
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "考勤规则##1###")
    private String kqRule;

    /**
     * 套班班次##1###
     */
    @Size(max = 500)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "套班班次##1###")
    private String kqTaoban;

    /**
     * 调休时间##1###
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "调休时间##1###")
    private Integer kqTiaoxiu;

    /**
     * 最后消费时间##1###
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2019-05-23 15:19:57", value = "最后消费时间##1###")
    private Date xfTime;

    /**
     * 消费间隔##1###
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "消费间隔##1###")
    private Integer xfJiange;

    /**
     * 账户金额##1###
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "账户金额##1###")
    private Integer xfJe;

    /**
     * 档案最后更新时间##1###
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2019-05-23 15:19:57", value = "档案最后更新时间##1###")
    private Date userSj;

    /**
     * 预留（军衔）##1###
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "预留（军衔）##1###")
    private String userRank;

    /**
     * 未知##1###
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "未知##1###")
    private Integer glyImg;

    /**
     * 是否有账户##1###
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "是否有账户##1###")
    private Integer userAc;

    /**
     * 未知##1###
     */
    @Size(max = 10)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "未知##1###")
    private String userGsbh;

    /**
     * 未知##1###
     */
    @Size(max = 5)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "未知##1###")
    private String userYglx;

    /**
     * 未知##1###
     */
    @Size(max = 10)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "未知##1###")
    private String userZhbh;

    /**
     * 未知##1###
     */
    @Size(max = 10)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "未知##1###")
    private String userZhlx;

    /**
     * 未知##1###
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "未知##1###")
    private String userTxm;

    /**
     * 人员类型##1###
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "人员类型##1###")
    private Integer userLx;

    /**
     * 实时门禁是否启用档案密码##1###
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "实时门禁是否启用档案密码##1###")
    private Integer userMj;

    /**
     * 未知##1###
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "未知##1###")
    private String depNoAdd;

    /**
     * 未知##1###
     */
    @Size(max = 200)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "未知##1###")
    private String zh;

    /**
     * 未知##1###
     */
    @Size(max = 30)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "未知##1###")
    private String khsj;

    /**
     * 用户身份##1###
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "用户身份##1###")
    private Integer userIdentity;

    /**
     * 未知##1###
     */
    @Size(max = 100)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "未知##1###")
    private String carno;

    /**
     * 是否有人脸##1###
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "是否有人脸##1###")
    private Integer userFace;

    /**
     * 未知##1###
     */
    @Size(max = 10)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "未知##1###")
    private String lx;

    private String userIdPhoto;

    private String userFacePhoto;

    private String faceFlag;

    private String headImage;

    private String userDeps;

    private String token;

    private String orgId;

    private String orgName;

    private String type;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column dt_user.user_serial
     *
     * @return the value of dt_user.user_serial
     */
    public Long getUserSerial() {
        return userSerial;
    }

    /**
     */
    public DtUserEntity withUserSerial(Long userSerial) {
        this.setUserSerial(userSerial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_serial
     *
     * @param userSerial the value for dt_user.user_serial
     */
    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

    /**
     * This method returns the value of the database column dt_user.user_no
     *
     * @return the value of dt_user.user_no
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     */
    public DtUserEntity withUserNo(String userNo) {
        this.setUserNo(userNo);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_no
     *
     * @param userNo the value for dt_user.user_no
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    /**
     * This method returns the value of the database column dt_user.user_lname
     *
     * @return the value of dt_user.user_lname
     */
    public String getUserLname() {
        return userLname;
    }

    /**
     */
    public DtUserEntity withUserLname(String userLname) {
        this.setUserLname(userLname);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_lname
     *
     * @param userLname the value for dt_user.user_lname
     */
    public void setUserLname(String userLname) {
        this.userLname = userLname;
    }

    /**
     * This method returns the value of the database column dt_user.user_fname
     *
     * @return the value of dt_user.user_fname
     */
    public String getUserFname() {
        return userFname;
    }

    /**
     */
    public DtUserEntity withUserFname(String userFname) {
        this.setUserFname(userFname);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_fname
     *
     * @param userFname the value for dt_user.user_fname
     */
    public void setUserFname(String userFname) {
        this.userFname = userFname;
    }

    /**
     * This method returns the value of the database column dt_user.dep_no
     *
     * @return the value of dt_user.dep_no
     */
    public String getDepNo() {
        return depNo;
    }

    /**
     */
    public DtUserEntity withDepNo(String depNo) {
        this.setDepNo(depNo);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.dep_no
     *
     * @param depNo the value for dt_user.dep_no
     */
    public void setDepNo(String depNo) {
        this.depNo = depNo;
    }

    /**
     * This method returns the value of the database column dt_user.user_dep
     *
     * @return the value of dt_user.user_dep
     */
    public Integer getUserDep() {
        return userDep;
    }

    /**
     */
    public DtUserEntity withUserDep(Integer userDep) {
        this.setUserDep(userDep);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_dep
     *
     * @param userDep the value for dt_user.user_dep
     */
    public void setUserDep(Integer userDep) {
        this.userDep = userDep;
    }

    /**
     * This method returns the value of the database column dt_user.user_depname
     *
     * @return the value of dt_user.user_depname
     */
    public String getUserDepname() {
        return userDepname;
    }

    /**
     */
    public DtUserEntity withUserDepname(String userDepname) {
        this.setUserDepname(userDepname);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_depname
     *
     * @param userDepname the value for dt_user.user_depname
     */
    public void setUserDepname(String userDepname) {
        this.userDepname = userDepname;
    }

    /**
     * This method returns the value of the database column dt_user.user_workday
     *
     * @return the value of dt_user.user_workday
     */
    public Date getUserWorkday() {
        return userWorkday;
    }

    /**
     */
    public DtUserEntity withUserWorkday(Date userWorkday) {
        this.setUserWorkday(userWorkday);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_workday
     *
     * @param userWorkday the value for dt_user.user_workday
     */
    public void setUserWorkday(Date userWorkday) {
        this.userWorkday = userWorkday;
    }

    /**
     * This method returns the value of the database column dt_user.user_duty
     *
     * @return the value of dt_user.user_duty
     */
    public String getUserDuty() {
        return userDuty;
    }

    /**
     */
    public DtUserEntity withUserDuty(String userDuty) {
        this.setUserDuty(userDuty);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_duty
     *
     * @param userDuty the value for dt_user.user_duty
     */
    public void setUserDuty(String userDuty) {
        this.userDuty = userDuty;
    }

    /**
     * This method returns the value of the database column dt_user.user_card
     *
     * @return the value of dt_user.user_card
     */
    public String getUserCard() {
        return userCard;
    }

    /**
     */
    public DtUserEntity withUserCard(String userCard) {
        this.setUserCard(userCard);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_card
     *
     * @param userCard the value for dt_user.user_card
     */
    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }

    /**
     * This method returns the value of the database column dt_user.user_finger
     *
     * @return the value of dt_user.user_finger
     */
    public String getUserFinger() {
        return userFinger;
    }

    /**
     */
    public DtUserEntity withUserFinger(String userFinger) {
        this.setUserFinger(userFinger);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_finger
     *
     * @param userFinger the value for dt_user.user_finger
     */
    public void setUserFinger(String userFinger) {
        this.userFinger = userFinger;
    }

    /**
     * This method returns the value of the database column dt_user.user_password
     *
     * @return the value of dt_user.user_password
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     */
    public DtUserEntity withUserPassword(String userPassword) {
        this.setUserPassword(userPassword);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_password
     *
     * @param userPassword the value for dt_user.user_password
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * This method returns the value of the database column dt_user.pwd_begin
     *
     * @return the value of dt_user.pwd_begin
     */
    public Date getPwdBegin() {
        return pwdBegin;
    }

    /**
     */
    public DtUserEntity withPwdBegin(Date pwdBegin) {
        this.setPwdBegin(pwdBegin);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.pwd_begin
     *
     * @param pwdBegin the value for dt_user.pwd_begin
     */
    public void setPwdBegin(Date pwdBegin) {
        this.pwdBegin = pwdBegin;
    }

    /**
     * This method returns the value of the database column dt_user.pwd_end
     *
     * @return the value of dt_user.pwd_end
     */
    public Date getPwdEnd() {
        return pwdEnd;
    }

    /**
     */
    public DtUserEntity withPwdEnd(Date pwdEnd) {
        this.setPwdEnd(pwdEnd);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.pwd_end
     *
     * @param pwdEnd the value for dt_user.pwd_end
     */
    public void setPwdEnd(Date pwdEnd) {
        this.pwdEnd = pwdEnd;
    }

    /**
     * This method returns the value of the database column dt_user.user_type
     *
     * @return the value of dt_user.user_type
     */
    public Short getUserType() {
        return userType;
    }

    /**
     */
    public DtUserEntity withUserType(Short userType) {
        this.setUserType(userType);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_type
     *
     * @param userType the value for dt_user.user_type
     */
    public void setUserType(Short userType) {
        this.userType = userType;
    }

    /**
     * This method returns the value of the database column dt_user.pact_begin
     *
     * @return the value of dt_user.pact_begin
     */
    public Date getPactBegin() {
        return pactBegin;
    }

    /**
     */
    public DtUserEntity withPactBegin(Date pactBegin) {
        this.setPactBegin(pactBegin);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.pact_begin
     *
     * @param pactBegin the value for dt_user.pact_begin
     */
    public void setPactBegin(Date pactBegin) {
        this.pactBegin = pactBegin;
    }

    /**
     * This method returns the value of the database column dt_user.pact_end
     *
     * @return the value of dt_user.pact_end
     */
    public Date getPactEnd() {
        return pactEnd;
    }

    /**
     */
    public DtUserEntity withPactEnd(Date pactEnd) {
        this.setPactEnd(pactEnd);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.pact_end
     *
     * @param pactEnd the value for dt_user.pact_end
     */
    public void setPactEnd(Date pactEnd) {
        this.pactEnd = pactEnd;
    }

    /**
     * This method returns the value of the database column dt_user.user_level
     *
     * @return the value of dt_user.user_level
     */
    public Integer getUserLevel() {
        return userLevel;
    }

    /**
     */
    public DtUserEntity withUserLevel(Integer userLevel) {
        this.setUserLevel(userLevel);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_level
     *
     * @param userLevel the value for dt_user.user_level
     */
    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * This method returns the value of the database column dt_user.user_photo
     *
     * @return the value of dt_user.user_photo
     */
    public Integer getUserPhoto() {
        return userPhoto;
    }

    /**
     */
    public DtUserEntity withUserPhoto(Integer userPhoto) {
        this.setUserPhoto(userPhoto);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_photo
     *
     * @param userPhoto the value for dt_user.user_photo
     */
    public void setUserPhoto(Integer userPhoto) {
        this.userPhoto = userPhoto;
    }

    /**
     * This method returns the value of the database column dt_user.user_sex
     *
     * @return the value of dt_user.user_sex
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     */
    public DtUserEntity withUserSex(String userSex) {
        this.setUserSex(userSex);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_sex
     *
     * @param userSex the value for dt_user.user_sex
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * This method returns the value of the database column dt_user.user_nation
     *
     * @return the value of dt_user.user_nation
     */
    public String getUserNation() {
        return userNation;
    }

    /**
     */
    public DtUserEntity withUserNation(String userNation) {
        this.setUserNation(userNation);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_nation
     *
     * @param userNation the value for dt_user.user_nation
     */
    public void setUserNation(String userNation) {
        this.userNation = userNation;
    }

    /**
     * This method returns the value of the database column dt_user.user_xueli
     *
     * @return the value of dt_user.user_xueli
     */
    public String getUserXueli() {
        return userXueli;
    }

    /**
     */
    public DtUserEntity withUserXueli(String userXueli) {
        this.setUserXueli(userXueli);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_xueli
     *
     * @param userXueli the value for dt_user.user_xueli
     */
    public void setUserXueli(String userXueli) {
        this.userXueli = userXueli;
    }

    /**
     * This method returns the value of the database column dt_user.user_native
     *
     * @return the value of dt_user.user_native
     */
    public String getUserNative() {
        return userNative;
    }

    /**
     */
    public DtUserEntity withUserNative(String userNative) {
        this.setUserNative(userNative);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_native
     *
     * @param userNative the value for dt_user.user_native
     */
    public void setUserNative(String userNative) {
        this.userNative = userNative;
    }

    /**
     * This method returns the value of the database column dt_user.user_birthday
     *
     * @return the value of dt_user.user_birthday
     */
    public Date getUserBirthday() {
        return userBirthday;
    }

    /**
     */
    public DtUserEntity withUserBirthday(Date userBirthday) {
        this.setUserBirthday(userBirthday);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_birthday
     *
     * @param userBirthday the value for dt_user.user_birthday
     */
    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getCredNo() {
        return credNo;
    }

    public void setCredNo(String credNo) {
        this.credNo = credNo;
    }

    /**
     * This method returns the value of the database column dt_user.user_post
     *
     * @return the value of dt_user.user_post
     */
    public String getUserPost() {
        return userPost;
    }

    /**
     */
    public DtUserEntity withUserPost(String userPost) {
        this.setUserPost(userPost);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_post
     *
     * @param userPost the value for dt_user.user_post
     */
    public void setUserPost(String userPost) {
        this.userPost = userPost;
    }

    /**
     * This method returns the value of the database column dt_user.user_linkman
     *
     * @return the value of dt_user.user_linkman
     */
    public String getUserLinkman() {
        return userLinkman;
    }

    /**
     */
    public DtUserEntity withUserLinkman(String userLinkman) {
        this.setUserLinkman(userLinkman);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_linkman
     *
     * @param userLinkman the value for dt_user.user_linkman
     */
    public void setUserLinkman(String userLinkman) {
        this.userLinkman = userLinkman;
    }

    /**
     * This method returns the value of the database column dt_user.user_telephone
     *
     * @return the value of dt_user.user_telephone
     */
    public String getUserTelephone() {
        return userTelephone;
    }

    /**
     */
    public DtUserEntity withUserTelephone(String userTelephone) {
        this.setUserTelephone(userTelephone);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_telephone
     *
     * @param userTelephone the value for dt_user.user_telephone
     */
    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    /**
     * This method returns the value of the database column dt_user.user_address
     *
     * @return the value of dt_user.user_address
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     */
    public DtUserEntity withUserAddress(String userAddress) {
        this.setUserAddress(userAddress);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_address
     *
     * @param userAddress the value for dt_user.user_address
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * This method returns the value of the database column dt_user.user_email
     *
     * @return the value of dt_user.user_email
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     */
    public DtUserEntity withUserEmail(String userEmail) {
        this.setUserEmail(userEmail);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_email
     *
     * @param userEmail the value for dt_user.user_email
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * This method returns the value of the database column dt_user.user_1
     *
     * @return the value of dt_user.user_1
     */
    public String getUser1() {
        return user1;
    }

    /**
     */
    public DtUserEntity withUser1(String user1) {
        this.setUser1(user1);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_1
     *
     * @param user1 the value for dt_user.user_1
     */
    public void setUser1(String user1) {
        this.user1 = user1;
    }

    /**
     * This method returns the value of the database column dt_user.user_2
     *
     * @return the value of dt_user.user_2
     */
    public String getUser2() {
        return user2;
    }

    /**
     */
    public DtUserEntity withUser2(String user2) {
        this.setUser2(user2);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_2
     *
     * @param user2 the value for dt_user.user_2
     */
    public void setUser2(String user2) {
        this.user2 = user2;
    }

    /**
     * This method returns the value of the database column dt_user.user_bz
     *
     * @return the value of dt_user.user_bz
     */
    public String getUserBz() {
        return userBz;
    }

    /**
     */
    public DtUserEntity withUserBz(String userBz) {
        this.setUserBz(userBz);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_bz
     *
     * @param userBz the value for dt_user.user_bz
     */
    public void setUserBz(String userBz) {
        this.userBz = userBz;
    }

    /**
     * This method returns the value of the database column dt_user.kq_rule
     *
     * @return the value of dt_user.kq_rule
     */
    public String getKqRule() {
        return kqRule;
    }

    /**
     */
    public DtUserEntity withKqRule(String kqRule) {
        this.setKqRule(kqRule);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.kq_rule
     *
     * @param kqRule the value for dt_user.kq_rule
     */
    public void setKqRule(String kqRule) {
        this.kqRule = kqRule;
    }

    /**
     * This method returns the value of the database column dt_user.kq_taoban
     *
     * @return the value of dt_user.kq_taoban
     */
    public String getKqTaoban() {
        return kqTaoban;
    }

    /**
     */
    public DtUserEntity withKqTaoban(String kqTaoban) {
        this.setKqTaoban(kqTaoban);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.kq_taoban
     *
     * @param kqTaoban the value for dt_user.kq_taoban
     */
    public void setKqTaoban(String kqTaoban) {
        this.kqTaoban = kqTaoban;
    }

    /**
     * This method returns the value of the database column dt_user.kq_tiaoxiu
     *
     * @return the value of dt_user.kq_tiaoxiu
     */
    public Integer getKqTiaoxiu() {
        return kqTiaoxiu;
    }

    /**
     */
    public DtUserEntity withKqTiaoxiu(Integer kqTiaoxiu) {
        this.setKqTiaoxiu(kqTiaoxiu);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.kq_tiaoxiu
     *
     * @param kqTiaoxiu the value for dt_user.kq_tiaoxiu
     */
    public void setKqTiaoxiu(Integer kqTiaoxiu) {
        this.kqTiaoxiu = kqTiaoxiu;
    }

    /**
     * This method returns the value of the database column dt_user.xf_time
     *
     * @return the value of dt_user.xf_time
     */
    public Date getXfTime() {
        return xfTime;
    }

    /**
     */
    public DtUserEntity withXfTime(Date xfTime) {
        this.setXfTime(xfTime);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.xf_time
     *
     * @param xfTime the value for dt_user.xf_time
     */
    public void setXfTime(Date xfTime) {
        this.xfTime = xfTime;
    }

    /**
     * This method returns the value of the database column dt_user.xf_jiange
     *
     * @return the value of dt_user.xf_jiange
     */
    public Integer getXfJiange() {
        return xfJiange;
    }

    /**
     */
    public DtUserEntity withXfJiange(Integer xfJiange) {
        this.setXfJiange(xfJiange);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.xf_jiange
     *
     * @param xfJiange the value for dt_user.xf_jiange
     */
    public void setXfJiange(Integer xfJiange) {
        this.xfJiange = xfJiange;
    }

    /**
     * This method returns the value of the database column dt_user.xf_je
     *
     * @return the value of dt_user.xf_je
     */
    public Integer getXfJe() {
        return xfJe;
    }

    /**
     */
    public DtUserEntity withXfJe(Integer xfJe) {
        this.setXfJe(xfJe);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.xf_je
     *
     * @param xfJe the value for dt_user.xf_je
     */
    public void setXfJe(Integer xfJe) {
        this.xfJe = xfJe;
    }

    /**
     * This method returns the value of the database column dt_user.user_sj
     *
     * @return the value of dt_user.user_sj
     */
    public Date getUserSj() {
        return userSj;
    }

    /**
     */
    public DtUserEntity withUserSj(Date userSj) {
        this.setUserSj(userSj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_sj
     *
     * @param userSj the value for dt_user.user_sj
     */
    public void setUserSj(Date userSj) {
        this.userSj = userSj;
    }

    /**
     * This method returns the value of the database column dt_user.user_rank
     *
     * @return the value of dt_user.user_rank
     */
    public String getUserRank() {
        return userRank;
    }

    /**
     */
    public DtUserEntity withUserRank(String userRank) {
        this.setUserRank(userRank);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_rank
     *
     * @param userRank the value for dt_user.user_rank
     */
    public void setUserRank(String userRank) {
        this.userRank = userRank;
    }

    /**
     * This method returns the value of the database column dt_user.gly_img
     *
     * @return the value of dt_user.gly_img
     */
    public Integer getGlyImg() {
        return glyImg;
    }

    /**
     */
    public DtUserEntity withGlyImg(Integer glyImg) {
        this.setGlyImg(glyImg);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.gly_img
     *
     * @param glyImg the value for dt_user.gly_img
     */
    public void setGlyImg(Integer glyImg) {
        this.glyImg = glyImg;
    }

    /**
     * This method returns the value of the database column dt_user.user_ac
     *
     * @return the value of dt_user.user_ac
     */
    public Integer getUserAc() {
        return userAc;
    }

    /**
     */
    public DtUserEntity withUserAc(Integer userAc) {
        this.setUserAc(userAc);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_ac
     *
     * @param userAc the value for dt_user.user_ac
     */
    public void setUserAc(Integer userAc) {
        this.userAc = userAc;
    }

    /**
     * This method returns the value of the database column dt_user.user_gsbh
     *
     * @return the value of dt_user.user_gsbh
     */
    public String getUserGsbh() {
        return userGsbh;
    }

    /**
     */
    public DtUserEntity withUserGsbh(String userGsbh) {
        this.setUserGsbh(userGsbh);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_gsbh
     *
     * @param userGsbh the value for dt_user.user_gsbh
     */
    public void setUserGsbh(String userGsbh) {
        this.userGsbh = userGsbh;
    }

    /**
     * This method returns the value of the database column dt_user.user_yglx
     *
     * @return the value of dt_user.user_yglx
     */
    public String getUserYglx() {
        return userYglx;
    }

    /**
     */
    public DtUserEntity withUserYglx(String userYglx) {
        this.setUserYglx(userYglx);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_yglx
     *
     * @param userYglx the value for dt_user.user_yglx
     */
    public void setUserYglx(String userYglx) {
        this.userYglx = userYglx;
    }

    /**
     * This method returns the value of the database column dt_user.user_zhbh
     *
     * @return the value of dt_user.user_zhbh
     */
    public String getUserZhbh() {
        return userZhbh;
    }

    /**
     */
    public DtUserEntity withUserZhbh(String userZhbh) {
        this.setUserZhbh(userZhbh);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_zhbh
     *
     * @param userZhbh the value for dt_user.user_zhbh
     */
    public void setUserZhbh(String userZhbh) {
        this.userZhbh = userZhbh;
    }

    /**
     * This method returns the value of the database column dt_user.user_zhlx
     *
     * @return the value of dt_user.user_zhlx
     */
    public String getUserZhlx() {
        return userZhlx;
    }

    /**
     */
    public DtUserEntity withUserZhlx(String userZhlx) {
        this.setUserZhlx(userZhlx);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_zhlx
     *
     * @param userZhlx the value for dt_user.user_zhlx
     */
    public void setUserZhlx(String userZhlx) {
        this.userZhlx = userZhlx;
    }

    /**
     * This method returns the value of the database column dt_user.user_txm
     *
     * @return the value of dt_user.user_txm
     */
    public String getUserTxm() {
        return userTxm;
    }

    /**
     */
    public DtUserEntity withUserTxm(String userTxm) {
        this.setUserTxm(userTxm);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_txm
     *
     * @param userTxm the value for dt_user.user_txm
     */
    public void setUserTxm(String userTxm) {
        this.userTxm = userTxm;
    }

    /**
     * This method returns the value of the database column dt_user.user_lx
     *
     * @return the value of dt_user.user_lx
     */
    public Integer getUserLx() {
        return userLx;
    }

    /**
     */
    public DtUserEntity withUserLx(Integer userLx) {
        this.setUserLx(userLx);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_lx
     *
     * @param userLx the value for dt_user.user_lx
     */
    public void setUserLx(Integer userLx) {
        this.userLx = userLx;
    }

    /**
     * This method returns the value of the database column dt_user.user_mj
     *
     * @return the value of dt_user.user_mj
     */
    public Integer getUserMj() {
        return userMj;
    }

    /**
     */
    public DtUserEntity withUserMj(Integer userMj) {
        this.setUserMj(userMj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_mj
     *
     * @param userMj the value for dt_user.user_mj
     */
    public void setUserMj(Integer userMj) {
        this.userMj = userMj;
    }

    /**
     * This method returns the value of the database column dt_user.dep_no_add
     *
     * @return the value of dt_user.dep_no_add
     */
    public String getDepNoAdd() {
        return depNoAdd;
    }

    /**
     */
    public DtUserEntity withDepNoAdd(String depNoAdd) {
        this.setDepNoAdd(depNoAdd);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.dep_no_add
     *
     * @param depNoAdd the value for dt_user.dep_no_add
     */
    public void setDepNoAdd(String depNoAdd) {
        this.depNoAdd = depNoAdd;
    }

    /**
     * This method returns the value of the database column dt_user.zh
     *
     * @return the value of dt_user.zh
     */
    public String getZh() {
        return zh;
    }

    /**
     */
    public DtUserEntity withZh(String zh) {
        this.setZh(zh);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.zh
     *
     * @param zh the value for dt_user.zh
     */
    public void setZh(String zh) {
        this.zh = zh;
    }

    /**
     * This method returns the value of the database column dt_user.khsj
     *
     * @return the value of dt_user.khsj
     */
    public String getKhsj() {
        return khsj;
    }

    /**
     */
    public DtUserEntity withKhsj(String khsj) {
        this.setKhsj(khsj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.khsj
     *
     * @param khsj the value for dt_user.khsj
     */
    public void setKhsj(String khsj) {
        this.khsj = khsj;
    }

    /**
     * This method returns the value of the database column dt_user.user_identity
     *
     * @return the value of dt_user.user_identity
     */
    public Integer getUserIdentity() {
        return userIdentity;
    }

    /**
     */
    public DtUserEntity withUserIdentity(Integer userIdentity) {
        this.setUserIdentity(userIdentity);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_identity
     *
     * @param userIdentity the value for dt_user.user_identity
     */
    public void setUserIdentity(Integer userIdentity) {
        this.userIdentity = userIdentity;
    }

    /**
     * This method returns the value of the database column dt_user.carno
     *
     * @return the value of dt_user.carno
     */
    public String getCarno() {
        return carno;
    }

    /**
     */
    public DtUserEntity withCarno(String carno) {
        this.setCarno(carno);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.carno
     *
     * @param carno the value for dt_user.carno
     */
    public void setCarno(String carno) {
        this.carno = carno;
    }

    /**
     * This method returns the value of the database column dt_user.user_face
     *
     * @return the value of dt_user.user_face
     */
    public Integer getUserFace() {
        return userFace;
    }

    /**
     */
    public DtUserEntity withUserFace(Integer userFace) {
        this.setUserFace(userFace);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_face
     *
     * @param userFace the value for dt_user.user_face
     */
    public void setUserFace(Integer userFace) {
        this.userFace = userFace;
    }

    /**
     * This method returns the value of the database column dt_user.lx
     *
     * @return the value of dt_user.lx
     */
    public String getLx() {
        return lx;
    }

    /**
     */
    public DtUserEntity withLx(String lx) {
        this.setLx(lx);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.lx
     *
     * @param lx the value for dt_user.lx
     */
    public void setLx(String lx) {
        this.lx = lx;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public String getUserIdPhoto() {
        return userIdPhoto;
    }

    public void setUserIdPhoto(String userIdPhoto) {
        this.userIdPhoto = userIdPhoto;
    }

    public String getUserFacePhoto() {
        return userFacePhoto;
    }

    public void setUserFacePhoto(String userFacePhoto) {
        this.userFacePhoto = userFacePhoto;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getUserDeps() {
        return userDeps;
    }

    public void setUserDeps(String userDeps) {
        this.userDeps = userDeps;
    }

    public String getFaceFlag() {
        return faceFlag;
    }

    public void setFaceFlag(String faceFlag) {
        this.faceFlag = faceFlag;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}