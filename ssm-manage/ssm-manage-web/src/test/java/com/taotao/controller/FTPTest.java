package com.taotao.controller;

import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * FTP上传图片测试程序
 * Created by IntelliJ IDEA
 * Created by ustcck on 2016/12/10 15:46.
 */
public class FTPTest {
    @Test
    public void testFtpClient() throws IOException {
        //创建一个httpClient对象
        FTPClient ftpClient = new FTPClient();
        //创建ftp连接
        ftpClient.connect("120.27.49.184",21);
        //登录ftp服务器，使用用户名和密码
        ftpClient.login("root", "Ck4438707");
        //读取本地文件
        FileInputStream inputStream = new FileInputStream(new File("D:\\IMG_5198.JPG"));
        //设置上传的路径
        ftpClient.changeWorkingDirectory("/usr/share/nginx/html/image");
        //上传文件
        ftpClient.storeFile("yangbaobao.jpg",inputStream);//第一个参数服务器端文档名，第二个参数上传文档的InputStream
        //关闭连接
        ftpClient.logout();
    }

}
