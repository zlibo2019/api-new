package com.weds.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

public class DtPhotoEntity extends BaseEntity implements Serializable {
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
    private String photoName;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "int", example = "-1", value = "")
    private Integer photoType;

    /**
     *
     */
    @Size(max = 100)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String photoPath;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2019-05-29 15:01:39", value = "")
    private Date sj;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column dt_photo.xh
     *
     * @return the value of dt_photo.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public DtPhotoEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column dt_photo.xh
     *
     * @param xh the value for dt_photo.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column dt_photo.user_serial
     *
     * @return the value of dt_photo.user_serial
     */
    public Long getUserSerial() {
        return userSerial;
    }

    /**
     */
    public DtPhotoEntity withUserSerial(Long userSerial) {
        this.setUserSerial(userSerial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_photo.user_serial
     *
     * @param userSerial the value for dt_photo.user_serial
     */
    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

    /**
     * This method returns the value of the database column dt_photo.lx
     *
     * @return the value of dt_photo.lx
     */
    public Integer getLx() {
        return lx;
    }

    /**
     */
    public DtPhotoEntity withLx(Integer lx) {
        this.setLx(lx);
        return this;
    }

    /**
     * This method sets the value of the database column dt_photo.lx
     *
     * @param lx the value for dt_photo.lx
     */
    public void setLx(Integer lx) {
        this.lx = lx;
    }

    /**
     * This method returns the value of the database column dt_photo.gly_no
     *
     * @return the value of dt_photo.gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public DtPhotoEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column dt_photo.gly_no
     *
     * @param glyNo the value for dt_photo.gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column dt_photo.photo_name
     *
     * @return the value of dt_photo.photo_name
     */
    public String getPhotoName() {
        return photoName;
    }

    /**
     */
    public DtPhotoEntity withPhotoName(String photoName) {
        this.setPhotoName(photoName);
        return this;
    }

    /**
     * This method sets the value of the database column dt_photo.photo_name
     *
     * @param photoName the value for dt_photo.photo_name
     */
    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    /**
     * This method returns the value of the database column dt_photo.photo_type
     *
     * @return the value of dt_photo.photo_type
     */
    public Integer getPhotoType() {
        return photoType;
    }

    /**
     */
    public DtPhotoEntity withPhotoType(Integer photoType) {
        this.setPhotoType(photoType);
        return this;
    }

    /**
     * This method sets the value of the database column dt_photo.photo_type
     *
     * @param photoType the value for dt_photo.photo_type
     */
    public void setPhotoType(Integer photoType) {
        this.photoType = photoType;
    }

    /**
     * This method returns the value of the database column dt_photo.photo_path
     *
     * @return the value of dt_photo.photo_path
     */
    public String getPhotoPath() {
        return photoPath;
    }

    /**
     */
    public DtPhotoEntity withPhotoPath(String photoPath) {
        this.setPhotoPath(photoPath);
        return this;
    }

    /**
     * This method sets the value of the database column dt_photo.photo_path
     *
     * @param photoPath the value for dt_photo.photo_path
     */
    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    /**
     * This method returns the value of the database column dt_photo.sj
     *
     * @return the value of dt_photo.sj
     */
    public Date getSj() {
        return sj;
    }

    /**
     */
    public DtPhotoEntity withSj(Date sj) {
        this.setSj(sj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_photo.sj
     *
     * @param sj the value for dt_photo.sj
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