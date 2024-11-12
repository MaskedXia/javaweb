package com.pipe.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/s4")
public class Servlet4 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getMethod()); // GET
        System.out.println(req.getScheme()); // http
        System.out.println(req.getProtocol()); // HTTP/1.1
        System.out.println(req.getRequestURI());  // /demo03/s4
        System.out.println(req.getRequestURL());  // http://localhost:8080/demo03/s4

        System.out.println(req.getLocalPort());  // 8080
        System.out.println(req.getRemotePort()); // 代理端口号 64690
        System.out.println(req.getServerPort()); // 发请求的端口号 8080

        String accept = req.getHeader("Accept");
        System.out.println("Accept: " + accept);

        Enumeration<String> headerNames = req.getHeaderNames();  // 所有头部
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            System.out.println(headerName + ": " + req.getHeader(headerName));
        }


    }
}
