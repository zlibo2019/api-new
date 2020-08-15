package com.weds.api.service;

import javax.annotation.Resource;

import com.weds.api.constant.ScmParams;
import com.weds.api.entity.*;
import com.weds.api.mapper.*;
import com.weds.core.utils.FileUtils;
import com.weds.core.utils.ImageUtils;
import com.weds.core.utils.StringUtils;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import com.weds.core.base.BaseService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

/**
 * @Author
 * @Description DtUser管理
 * @Date 2020-03-05
 */
@Service
public class DtUserService extends BaseService {
    @Resource
    private DtFaceMapper dtFaceMapper;

    @Resource
    private DtPhotoMapper dtPhotoMapper;

    @Resource
    private DtUserMapper dtUserMapper;

    @Resource
    private CommonService commonService;

    @Resource
    private ScmParams scmParams;

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private WtPublicMapper wtPublicMapper;

    @Resource
    private  MODULEService moduleService;

    private Logger log = LogManager.getLogger();

    public int deleteByPrimaryKey(Long userSerial) {
        return dtUserMapper.deleteByPrimaryKey(userSerial);
    }

    public int insert(DtUserEntity record) {
        return dtUserMapper.insert(record);
    }

    @Transactional
    public DtUserEntity deleteFaceOrPhoto(Long userSerial) {
        boolean flag = false;
        DtUserEntity entity = dtUserMapper.selectByPrimaryKey(userSerial);
        StringBuilder path = new StringBuilder();
        path.append(scmParams.getRootPath()).append(File.separator);
        if (scmParams.getFaceType().equals("1")) {
            if (entity.getUserFace() != null) {
                int userFace = entity.getUserFace() / 2 % 2;
                if (userFace == 1) {
                    entity.setUserFace(entity.getUserFace() - 2);
                }
                dtFaceMapper.deleteByPrimaryKey(userSerial);
                path.append(scmParams.getFacePath());
                flag = true;
            }
        } else {
            if (entity.getUserPhoto() != null) {
                entity.setUserPhoto(0);
                dtPhotoMapper.deleteByPrimaryKey(userSerial);
                path.append(scmParams.getPhotoPath());
                flag = true;
            }
        }

        if (flag) {
            path.append(File.separator).append(entity.getUserSerial() / 1000);
            File file = new File(path.toString());
            File[] files = file.listFiles(pathname -> pathname.getName().contains(entity.getUserSerial().toString()));
            if (files != null) {
                for (File item : files) {
                    item.delete();
                }
            }
        }

        return entity;
    }


    public void updateFaceOrPhoto(DtUserEntity record) throws Exception {
        if (!StringUtils.isBlank(record.getUserFacePhoto())) {
            String path;
            String dir;
            Date date = new Date();
            DtUserEntity entity = dtUserMapper.selectByPrimaryKey(record.getUserSerial());
            if (scmParams.getFaceType().equals("1")) {
                if (entity.getUserFace() != null) {
                    int userFace = entity.getUserFace() / 2 % 2;
                    if (userFace == 0) {
                        record.setUserFace(entity.getUserFace() + 2);
                    } else {
                        record.setUserFace(entity.getUserFace());
                    }
                } else {
                    record.setUserFace(2);
                }

                DtFaceEntity dtFaceEntity = new DtFaceEntity();
                dtFaceEntity.setUserSerial(record.getUserSerial());
                dtFaceEntity.setLx(0);
                dtFaceEntity.setGlyNo(record.getUserSerial().toString());
                dtFaceEntity.setFaceName(record.getUserSerial().toString() + ".fct");
                dtFaceEntity.setFaceType(0);
                dtFaceEntity.setFacePath("../face/" + (record.getUserSerial() / 1000) + "/");
                dtFaceEntity.setSj(date);
                int flag = dtFaceMapper.updateByPrimaryKeySelective(dtFaceEntity);
                if (flag == 0) {
                    dtFaceMapper.insertSelective(dtFaceEntity);
                }
                dir = scmParams.getFacePath() + File.separator + (record.getUserSerial() / 1000);
            } else {
                record.setUserPhoto(1);
                DtPhotoEntity dtPhotoEntity = new DtPhotoEntity();
                dtPhotoEntity.setUserSerial(record.getUserSerial());
                dtPhotoEntity.setLx(0);
                dtPhotoEntity.setGlyNo(record.getUserSerial().toString());
                dtPhotoEntity.setPhotoName(record.getUserSerial().toString() + ".jpg");
                dtPhotoEntity.setPhotoType(0);
                dtPhotoEntity.setPhotoPath("../photo/" + (record.getUserSerial() / 1000) + "/");
                dtPhotoEntity.setSj(date);
                int flag = dtPhotoMapper.updateByPrimaryKeySelective(dtPhotoEntity);
                if (flag == 0) {
                    dtPhotoMapper.insertSelective(dtPhotoEntity);
                }
                dir = scmParams.getPhotoPath() + File.separator + (record.getUserSerial() / 1000);
            }

            path = ImageUtils.base64ToFile(record.getUserFacePhoto(), record.getUserSerial().toString() + "_0",
                        "jpg", dir, scmParams.getRootPath());
            commonService.makeFctFile(path);

            if (scmParams.getFaceType().equals("1") && scmParams.isUserPhoto() && (entity.getUserPhoto() == null
                    || entity.getUserPhoto() != 1)) {
                this.saveUserPhoto(record, date);
            }
        }
    }

    @Transactional
    public int updateByPrimaryKeySelective(DtUserEntity record, String ip, String gly) {
        WtPublicEntity wtPublicEntity = new WtPublicEntity();
        wtPublicEntity.setLx(32);
        wtPublicEntity.setIsAll(0);
        wtPublicEntity.setLogType(1);
        wtPublicEntity.setUserSerial(record.getUserSerial());
        wtPublicEntity.setLogSj(new Date());
        wtPublicEntity.setLogIp(ip);
        wtPublicEntity.setGlyNo(gly);
        wtPublicMapper.insertSelective(wtPublicEntity);

        wtPublicEntity.setLx(1);
        wtPublicEntity.setIsAll(0);
        wtPublicEntity.setLogType(2);
        wtPublicEntity.setUserSerial(record.getUserSerial());
        wtPublicEntity.setLogSj(new Date());
        wtPublicEntity.setLogIp(ip);
        wtPublicEntity.setGlyNo(gly);
        wtPublicMapper.insertSelective(wtPublicEntity);

        return dtUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateDepName(DtUserEntity record) {

        return dtUserMapper.updateDepName(record);
    }




    private void saveUserPhoto(DtUserEntity record, Date date) throws IOException {
        record.setUserPhoto(1);
        DtPhotoEntity dtPhotoEntity = new DtPhotoEntity();
        dtPhotoEntity.setUserSerial(record.getUserSerial());
        dtPhotoEntity.setLx(0);
        dtPhotoEntity.setGlyNo(record.getUserSerial().toString());
        dtPhotoEntity.setPhotoName(record.getUserSerial().toString() + ".jpg");
        dtPhotoEntity.setPhotoType(0);
        dtPhotoEntity.setPhotoPath("../photo/" + (record.getUserSerial() / 1000) + "/");
        dtPhotoEntity.setSj(date);
        int flag = dtPhotoMapper.updateByPrimaryKeySelective(dtPhotoEntity);
        if (flag == 0) {
            dtPhotoMapper.insertSelective(dtPhotoEntity);
        }
        String source = scmParams.getRootPath() + File.separator + scmParams.getFacePath() + File.separator
                + (record.getUserSerial() / 1000) + File.separator
                + record.getUserSerial().toString() + "_0.jpg";
        String target = scmParams.getRootPath() + File.separator + scmParams.getPhotoPath() + File.separator
                + (record.getUserSerial() / 1000) + File.separator
                + record.getUserSerial().toString() + ".jpg";
        FileUtils.copyFile(new File(source), new File(target));
    }

    @Transactional
    public int insertSelective(DtUserEntity record) throws Exception {
        DtUserEntity dtUserEntity = selectByUserNo(record.getUserNo());
        if(dtUserEntity != null){
            return  -100;
        }


        Long userSerial = moduleService.selectSerialByModuleId("0002");
        record.setUserSerial(userSerial);
        if (!StringUtils.isBlank(record.getUserFacePhoto())) {
            String path;
            String dir;
            Date date = new Date();
            if (record.getUserFace().equals(1)) {
                record.setUserFace(2);
                DtFaceEntity dtFaceEntity = new DtFaceEntity();
                dtFaceEntity.setUserSerial(record.getUserSerial());
                dtFaceEntity.setLx(0);
                dtFaceEntity.setGlyNo(record.getUserSerial().toString());
                dtFaceEntity.setFaceName(record.getUserSerial().toString() + ".fct");
                dtFaceEntity.setFaceType(0);
                dtFaceEntity.setFacePath("../face/" + (record.getUserSerial() / 1000) + "/");
                dtFaceEntity.setSj(date);
                dtFaceMapper.insertSelective(dtFaceEntity);
                dir = scmParams.getFacePath() + File.separator + (record.getUserSerial() / 1000);
            } else {
                record.setUserPhoto(1);
                DtPhotoEntity dtPhotoEntity = new DtPhotoEntity();
                dtPhotoEntity.setUserSerial(record.getUserSerial());
                dtPhotoEntity.setLx(0);
                dtPhotoEntity.setGlyNo(record.getUserSerial().toString());
                dtPhotoEntity.setPhotoName(record.getUserSerial().toString() + ".jpg");
                dtPhotoEntity.setPhotoType(0);
                dtPhotoEntity.setPhotoPath("../photo/" + (record.getUserSerial() / 1000) + "/");
                dtPhotoEntity.setSj(date);
                dtPhotoMapper.insertSelective(dtPhotoEntity);
                dir = scmParams.getPhotoPath() + File.separator + (record.getUserSerial() / 1000);
            }
            path = ImageUtils.base64ToFile(record.getUserFacePhoto(), record.getUserSerial().toString() + "_0",
                    "jpg", dir, scmParams.getRootPath());
            commonService.makeFctFile(path);

            if (scmParams.getFaceType().equals("1") && scmParams.isUserPhoto()) {
                this.saveUserPhoto(record, date);
            }
        }
        return dtUserMapper.insertSelective(record);
    }

    public DtUserEntity selectByPrimaryKey(Long userSerial) {
        return dtUserMapper.selectByPrimaryKey(userSerial);
    }

    public int updateByPrimaryKeySelective(DtUserEntity record) {
        return dtUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(DtUserEntity record) {
        return dtUserMapper.updateByPrimaryKey(record);
    }

    public List<DtUserEntity> select() {
        return dtUserMapper.select();
    }

    public DtUserEntity selectByUserNo(String userNo){
        return  dtUserMapper.selectByUserNo(userNo);
    }

}
