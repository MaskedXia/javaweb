package com.pipe.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@WebServlet("/s6")
public class Servlet6 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setStatus(200); // 状态码

//        resp.setHeader("Content-Type", "text/html");
//        resp.setHeader("Content-Length", "1000");

        String info = "<h1>Servlet6</h1>";

        resp.setContentType("text/html");
        resp.setContentLength(info.getBytes().length);

        // 向响应体输入文本
        PrintWriter writer = resp.getWriter();
        writer.write(info);


    }
}
