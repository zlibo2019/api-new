package com.weds.api.constant;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "weds.scm")
public class ScmParams {
    // SCM根路径
    private String rootPath = "";

    // SCM Url
    private String scmUrl = "";

    // 档案照片路径
    private String photoPath = "wwwroot/photo";

    // 人脸照片路径
    private String facePath = "wwwroot/face";

    // 拍照照片路径
    private String framePath ="wwwroot/frame";

    // 照片工具路径
    private String toolPath;

    // 车牌照片路径
    private String carsPath = "";

    // 人脸类型 0 jpg 1 fct
    private String faceType = "1";

    // 访客身份证照片路径
    private String visPhotoPath = "wwwroot/photo/vis";

    // 考勤照片路径
    private String attencePath = "wwwroot/frame";

    // 移动端考勤设备序号
    private Integer devSerial = 9999999;

    // 0 卡、1 人脸、2 卡+人脸、3 二维码, 4 二维码+人脸
    private String discernType = "2";

    // 照片尺寸
    private Integer photoSize = 720;

    // 增量允许的最大条数
    private Integer maxNum;

    // 外勤是否自动审批
    private boolean outside;

    // 人脸照片是否作为档案照片
    private boolean userPhoto;

    // 考勤照片是否增加水印
    private boolean watermark;

    // 订餐扣费方式
    private int chargeback = 2;

    public String getRootPath() {
        return rootPath;
    }

    public void setRootPath(String rootPath) {
        this.rootPath = rootPath;
    }

    public String getScmUrl() {
        return scmUrl;
    }

    public void setScmUrl(String scmUrl) {
        this.scmUrl = scmUrl;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getFacePath() {
        return facePath;
    }

    public void setFacePath(String facePath) {
        this.facePath = facePath;
    }

    public String getFramePath() {
        return framePath;
    }

    public void setFramePath(String framePath) {
        this.framePath = framePath;
    }

    public String getFaceType() {
        return faceType;
    }

    public void setFaceType(String faceType) {
        this.faceType = faceType;
    }

    public String getVisPhotoPath() {
        return visPhotoPath;
    }

    public void setVisPhotoPath(String visPhotoPath) {
        this.visPhotoPath = visPhotoPath;
    }

    public String getDiscernType() {
        return discernType;
    }

    public void setDiscernType(String discernType) {
        this.discernType = discernType;
    }

    public String getCarsPath() {
        return carsPath;
    }

    public void setCarsPath(String carsPath) {
        this.carsPath = carsPath;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public String getAttencePath() {
        return attencePath;
    }

    public void setAttencePath(String attencePath) {
        this.attencePath = attencePath;
    }

    public Integer getDevSerial() {
        return devSerial;
    }

    public void setDevSerial(Integer devSerial) {
        this.devSerial = devSerial;
    }

    public Integer getPhotoSize() {
        return photoSize;
    }

    public void setPhotoSize(Integer photoSize) {
        this.photoSize = photoSize;
    }

    public boolean isOutside() {
        return outside;
    }

    public void setOutside(boolean outside) {
        this.outside = outside;
    }

    public boolean isUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(boolean userPhoto) {
        this.userPhoto = userPhoto;
    }

    public boolean isWatermark() {
        return watermark;
    }

    public void setWatermark(boolean watermark) {
        this.watermark = watermark;
    }

    public int getChargeback() {
        return chargeback;
    }

    public void setChargeback(int chargeback) {
        this.chargeback = chargeback;
    }

    public String getToolPath() {
        return toolPath;
    }

    public void setToolPath(String toolPath) {
        this.toolPath = toolPath;
    }
}
