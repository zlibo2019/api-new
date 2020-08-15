package com.weds.api.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FTPUtil {

    final static Logger logger = LoggerFactory.getLogger(FTPUtil.class);

    private static int timeout = 1000 * 60 * 2;

    /**
     * Description: 向FTP服务器上传文件
     *
     * @param url      FTP服务器hostname
     * @param port     FTP服务器端口
     * @param username FTP登录账号
     * @param password FTP登录密码
     * @param path     FTP服务器保存目录
     * @param filename 上传到FTP服务器上的文件名
     * @param input    输入流
     * @return 成功返回true，否则返回false
     */
    public static boolean uploadFile(String url, int port, String username, String password, String path, String filename, InputStream input) {

        boolean success = false;

        FTPClient ftp = new FTPClient();
        try {
            boolean login = loginFTP(ftp, url, port, username, password);
            if (!login) {
                logger.info("登录失败！url:{},port:{},username:{}", new Object[]{url, port, username});
                return success;
            }
            boolean fhangeDir = false;
            for (int i = 0; i < 3; i++) {
                // 设置上传目录
                fhangeDir = ftp.changeWorkingDirectory(path);
                if (!fhangeDir) {
                    logger.info("ftp工作路径{}切换失败，进行第{}次重新切换", new Object[]{path, i + 1});
                } else {
                    break;
                }
            }
            if (!fhangeDir) {
                logger.info("ftp工作路径{}重新切换失败", new Object[]{path});
                return success;
            }
            //设置缓存大小
            ftp.setBufferSize(1024);
            //设置编码格式
            ftp.setControlEncoding("GBK");
            // 设置文件类型
            ftp.setFileType(FTPClient.ASCII_FILE_TYPE);
            boolean upload = ftp.storeFile(filename, input);
            if (!upload) {
                logger.info("文件{}上传失败", filename);
                return success;
            }
            logger.info("文件{}上传成功", filename);
            input.close();
            boolean logout = ftp.logout();
            if (!logout) {
                logger.info("退出登录失败url:{},port:{},username:{}", new Object[]{url, port, username});
            }
            success = true;
        } catch (IOException e) {
            logger.info("文件上传{}出错url:{},port:{},username:{}", new Object[]{filename, url, port, username});
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                    logger.info("关闭FTPClient：{}连接出错", new Object[]{ftp}, ioe);
                }
            }
        }
        return success;
    }

    /**
     * Description: 从FTP服务器下载文件
     *
     * @param url        FTP服务器hostname
     * @param port       FTP服务器端口
     * @param username   FTP登录账号
     * @param password   FTP登录密码
     * @param remotePath FTP服务器上的相对路径
     * @param localPath  下载后保存到本地的路径
     * @return 下载的文件列表
     */
    public static List<String> downFile(String url, int port, String username, String password, String remotePath, String localPath) {

        List<String> files = new ArrayList<String>();
        FTPClient ftp = new FTPClient();
        try {
            boolean login = loginFTP(ftp, url, port, username, password);
            if (!login) {
                logger.info("登录失败！url:{},port:{},username:{}", new Object[]{url, port, username});
                return files;
            }
            boolean fhangeDir = false;
            for (int i = 0; i < 3; i++) {
                fhangeDir = ftp.changeWorkingDirectory(remotePath);
                if (!fhangeDir) {
                    logger.info("ftp工作路径{}切换失败，进行第{}次重新切换", new Object[]{remotePath, i + 1});
                } else {
                    break;
                }
            }
            if (!fhangeDir) {
                logger.info("ftp工作路径{}重新切换失败", new Object[]{remotePath});
                return files;
            }
            FTPFile[] fs = ftp.listFiles();
            if (fs == null || fs.length == 0) {
                logger.info("ftp路径{}无可下载划文件", new Object[]{remotePath});
                return files;
            }
            for (FTPFile ff : fs) {
                if (ff.isFile()) {
                    File localFile = new File(localPath + "\\" + ff.getName());
                    OutputStream is = new FileOutputStream(localFile);
                    boolean flag = ftp.retrieveFile(ff.getName(), is);
                    if (!flag) {
                        logger.info("从ftp路径{}读取文件{}出错", new Object[]{remotePath, ff.getName()});
                    } else {
                        files.add(localPath + "\\" + ff.getName());
                    }
                    IOUtils.closeQuietly(is);
                }
            }

            boolean logout = ftp.logout();
            if (!logout) {
                logger.info("退出登录失败url:{},port:{},username:{}", new Object[]{url, port, username});
            }
        } catch (IOException e) {
            logger.info("文件下载出错url:{},port:{},username:{}", new Object[]{url, port, username});
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                    logger.info("关闭FTPClient：{}连接出错", new Object[]{ftp}, ioe);
                }
            }
        }
        return files;
    }


    /**
     * Description: 登录到FTP服务器的某个目录删除文件
     *
     * @param url        FTP服务器hostname
     * @param port       FTP服务器端口
     * @param username   FTP登录账号
     * @param password   FTP登录密码
     * @param remotePath FTP服务器上的相对路径
     * @param filenName  文件名称
     * @return 成功返回true，否则返回false
     */
    public static boolean deleteFile(String url, int port, String username, String password, String remotePath, String filenName) {

        boolean success = false;
        FTPClient ftp = new FTPClient();
        try {
            boolean login = loginFTP(ftp, url, port, username, password);
            if (!login) {
                logger.info("登录失败！url:{},port:{},username:{}", new Object[]{url, port, username});
                return success;
            }
            boolean fhangeDir = false;
            for (int i = 0; i < 3; i++) {
                fhangeDir = ftp.changeWorkingDirectory(remotePath);
                if (!fhangeDir) {
                    logger.info("ftp工作路径{}切换失败，进行第{}次重新切换", new Object[]{remotePath, i + 1});
                } else {
                    break;
                }
            }
            if (!fhangeDir) {
                logger.info("ftp工作路径{}重新切换失败", new Object[]{remotePath});
                return success;
            }
            FTPFile[] fs = ftp.listFiles();
            if (fs == null || fs.length == 0) {
                logger.info("ftp路径{}无可删除的文件", new Object[]{remotePath});
                return success;
            }

            for (FTPFile ff : fs) {
                if (ff.isFile() && filenName.equals(ff.getName())) {
                    boolean flag = ftp.deleteFile(ff.getName());
                    if (!flag) {
                        logger.info("删除ftp服务器{}目录下的文件：{}失败", new Object[]{remotePath, ff.getName()});
                    } else {
                        logger.info("删除ftp服务器{}目录下的文件：{}成功", new Object[]{remotePath, ff.getName()});
                    }
                }
            }

            boolean logout = ftp.logout();
            if (!logout) {
                logger.info("退出登录失败url:{},port:{},username:{}", new Object[]{url, port, username});
            }
            success = true;
        } catch (IOException e) {
            logger.info("删除ftp文件出错url:{},port:{},username:{}", new Object[]{url, port, username});
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                    logger.info("关闭FTPClient：{}连接出错", new Object[]{ftp}, ioe);
                }
            }
        }
        return success;
    }

    /**
     * Description: 登录FTP服务器
     *
     * @param ftp      FTPClient
     * @param url      FTP服务器hostname
     * @param port     FTP服务器端口
     * @param username FTP登录账号
     * @param password FTP登录密码
     * @return 成功返回true，否则返回false
     */
    private static boolean loginFTP(FTPClient ftp, String url, int port, String username, String password) {

        boolean success = false;
        try {
            int reply;
            //连接FTP服务器
            ftp.connect(url, port);
//设置超时
            ftp.setSoTimeout(timeout);
//登录
            ftp.login(username, password);
//检测连接是否成功
            reply = ftp.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                success = false;
            } else {
                success = true;
            }
            ftp.setControlEncoding("GBK");

            FTPClientConfig conf = new FTPClientConfig(FTPClientConfig.SYST_NT);

            conf.setServerLanguageCode("zh");

        } catch (SocketException e) {
            logger.error("连接到FTP服务器出错，url:{},port:{},username:{}", new Object[]{url, port, username}, e);

        } catch (IOException e) {
            logger.error("连接到FTP服务器出错，url:{},port:{},username:{}", new Object[]{url, port, username}, e);
        }

        return success;
    }
}
