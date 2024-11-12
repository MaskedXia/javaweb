package com.pipe.servlet;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/*
* tomcat增加到依赖
* 继承HttpServlet，重写service方法
* web.xml配置servlet映射
*
* servlet-api.jar 编码需要，运行tomcat提供
*
* Content-Type
*   MIME Multipurpose Internet Mail Extensions
*   conf/web.xml 会有文件后缀到类型的映射
* */

public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username"); //无论是get还是post

        // 处理
        String info = "<h1>YES<h1>";
        if ("pipe".equals(username)) {
            info = "<h1>NO<h1>";
        }

        //resp.setHeader("Content-Type", "text/html");
        resp.setContentType("text/html");

        //返回
        PrintWriter writer = resp.getWriter();
        writer.write(info);

    }
}
