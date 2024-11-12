package com.pipe.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //servletConfig 每个会话都有自己的servletConfig
        ServletConfig servletConfig = super.getServletConfig();
        String key = servletConfig.getInitParameter("key");
        System.out.println("key: " + key);

        System.out.println("************************");
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String paramName = initParameterNames.nextElement();
            System.out.println(paramName + ": " + servletConfig.getInitParameter(paramName));
        }

        //servletContext
        System.out.println("************************");
        ServletContext servletContext = getServletContext();
        Enumeration<String> initParameterNames1 = servletContext.getInitParameterNames();
        while (initParameterNames1.hasMoreElements()) {
            String paramName = initParameterNames1.nextElement();
            System.out.println(paramName + ": " + servletContext.getInitParameter(paramName));
        }

        //ServletContext 添加 获取 删除 (应用域) 最大域
        servletContext.setAttribute("k1", "v1");
        System.out.println(servletContext.getAttribute("k1"));
        servletContext.removeAttribute("k1");
    }
}
