package com.pipe.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/sa")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ServletA is running");

        // 1.请求转发 只能访问内部资源
//        RequestDispatcher servletB = req.getRequestDispatcher("sb"); // 请求转发 servletB
//        servletB.forward(req, resp);

//        RequestDispatcher servletB = req.getRequestDispatcher("a.html"); // 请求转发
//        servletB.forward(req, resp);

        // 2. 重定向 能跳转到任何资源 页面跳转时优先使用
//        resp.sendRedirect("sb"); // 重定向到 servletB 客户地址栏会变化
//
//        resp.sendRedirect("a.html");

        resp.sendRedirect("http://www.baidu.com");

    }
}
