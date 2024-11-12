package com.pipe.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileOutputStream;
import java.io.IOException;

@WebServlet("/s3")
public class Servlet3 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        String path = servletContext.getRealPath("upload"); // 获取某个文件路径
        System.out.println(path);

        System.out.println("********************************");
        String contextPath = servletContext.getContextPath(); // 项目上下文路径
        System.out.println(contextPath);// /demo03

    }
}
