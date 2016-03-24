package com.hbuas.servlets;
import com.hbuas.pojo.User;
import com.hbuas.utils.PictureRemove;
import com.hbuas.utils.UserInfoOperation;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;
import java.io.*;
import java.net.URI;
import java.net.URL;
import java.sql.Date;

/**
 * Created by dell on 2016/1/24.
 */
@MultipartConfig(fileSizeThreshold = 5242880,maxFileSize = 20971520L,maxRequestSize = 41943040L)
public class GetUserRegisterInfoServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        /*String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String birth = request.getParameter("birth");
        String certificateType = request.getParameter("certificateType");
        String certificateNumber = request.getParameter("certificateNumber");
        String password = request.getParameter("password");
        String mobileNumber = request.getParameter("mobileNumber");
        System.out.println("1"+name);
        System.out.println("2"+sex);
        System.out.println("3"+birth);
        System.out.println("4"+certificateType);
        System.out.println("5"+certificateNumber);
        System.out.println("6"+password);
        System.out.println("7"+mobileNumber);*/
        String mobileNumber = request.getParameter("mobileNumber");
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setSex(request.getParameter("sex"));
        user.setBirth(java.sql.Date.valueOf(request.getParameter("birth")));
        user.setCertificateType(request.getParameter("certificateType"));
        user.setCertificateNumber(request.getParameter("certificateNumber"));
        user.setPassword(request.getParameter("password"));
        user.setMobileNumber(mobileNumber);
        user.setHeadPicPath("localhost/pic/"+mobileNumber+".jpg");
        PrintWriter out = response.getWriter();
        Part part = request.getPart("file");
        InputStream inputStream = part.getInputStream();
        synchronized (this){

            byte[] Buffer = new byte[4096];
            File file = new File(request.getServletContext().getRealPath("/WEB-INF/pic/")+mobileNumber+".jpg");
            if (!file.exists()) {
                file.createNewFile(); // 如果文件不存在，则创建
                System.out.println("create");
            }
            FileOutputStream fos = new FileOutputStream(file);
            int size = 0;
            while ((size = inputStream.read(Buffer)) != -1) {
                fos.write(Buffer, 0, size);
            }
            fos.close();
            /*PictureRemove smb = PictureRemove.getInstance("smb://dell:bgmlx15971083214@localhost/");
            smb.uploadFile(file);// 上传文件
            System.out.println("Upload picture success!");*/
            if(new UserInfoOperation().insertRegisterInfo(user)==0){
                //插入失败时，执行后续操作
                out.println("failed");
            }else{
                //插入成功时，执行后续操作
                out.println("success");
            }
        }
    }
}
