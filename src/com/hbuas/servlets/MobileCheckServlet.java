package com.hbuas.servlets;

import com.hbuas.utils.UserInfoOperation;
import com.mysql.jdbc.Connection;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dell on 2016/1/24.
 */
@WebServlet(name = "MobileCheckServlet")
public class MobileCheckServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        String mobileNumber = request.getParameter("mobileNumber");
        PrintWriter out = response.getWriter();
        if(mobileNumber==""){
            out.print("请输入手机号");
            return;
        }
        boolean result = new UserInfoOperation().mobileExit(mobileNumber);
        if(result){
            out.print("该手机号已被注册");
        }
        else{
            out.print("该手机号可以使用");
        }
    }
}
