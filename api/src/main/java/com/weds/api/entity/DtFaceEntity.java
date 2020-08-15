package com.weds.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

public class DtFaceEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer xh;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private Long userSerial;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer lx;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String glyNo;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String faceName;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer faceType;

    /**
     *
     */
    @Size(max = 100)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String facePath;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2019-05-29 15:05:44", value = "")
    private Date sj;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column dt_face.xh
     *
     * @return the value of dt_face.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public DtFaceEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column dt_face.xh
     *
     * @param xh the value for dt_face.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column dt_face.user_serial
     *
     * @return the value of dt_face.user_serial
     */
    public Long getUserSerial() {
        return userSerial;
    }

    /**
     */
    public DtFaceEntity withUserSerial(Long userSerial) {
        this.setUserSerial(userSerial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_face.user_serial
     *
     * @param userSerial the value for dt_face.user_serial
     */
    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

    /**
     * This method returns the value of the database column dt_face.lx
     *
     * @return the value of dt_face.lx
     */
    public Integer getLx() {
        return lx;
    }

    /**
     */
    public DtFaceEntity withLx(Integer lx) {
        this.setLx(lx);
        return this;
    }

    /**
     * This method sets the value of the database column dt_face.lx
     *
     * @param lx the value for dt_face.lx
     */
    public void setLx(Integer lx) {
        this.lx = lx;
    }

    /**
     * This method returns the value of the database column dt_face.gly_no
     *
     * @return the value of dt_face.gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public DtFaceEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column dt_face.gly_no
     *
     * @param glyNo the value for dt_face.gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column dt_face.face_name
     *
     * @return the value of dt_face.face_name
     */
    public String getFaceName() {
        return faceName;
    }

    /**
     */
    public DtFaceEntity withFaceName(String faceName) {
        this.setFaceName(faceName);
        return this;
    }

    /**
     * This method sets the value of the database column dt_face.face_name
     *
     * @param faceName the value for dt_face.face_name
     */
    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    /**
     * This method returns the value of the database column dt_face.face_type
     *
     * @return the value of dt_face.face_type
     */
    public Integer getFaceType() {
        return faceType;
    }

    /**
     */
    public DtFaceEntity withFaceType(Integer faceType) {
        this.setFaceType(faceType);
        return this;
    }

    /**
     * This method sets the value of the database column dt_face.face_type
     *
     * @param faceType the value for dt_face.face_type
     */
    public void setFaceType(Integer faceType) {
        this.faceType = faceType;
    }

    /**
     * This method returns the value of the database column dt_face.face_path
     *
     * @return the value of dt_face.face_path
     */
    public String getFacePath() {
        return facePath;
    }

    /**
     */
    public DtFaceEntity withFacePath(String facePath) {
        this.setFacePath(facePath);
        return this;
    }

    /**
     * This method sets the value of the database column dt_face.face_path
     *
     * @param facePath the value for dt_face.face_path
     */
    public void setFacePath(String facePath) {
        this.facePath = facePath;
    }

    /**
     * This method returns the value of the database column dt_face.sj
     *
     * @return the value of dt_face.sj
     */
    public Date getSj() {
        return sj;
    }

    /**
     */
    public DtFaceEntity withSj(Date sj) {
        this.setSj(sj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_face.sj
     *
     * @param sj the value for dt_face.sj
     */
    public void setSj(Date sj) {
        this.sj = sj;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}