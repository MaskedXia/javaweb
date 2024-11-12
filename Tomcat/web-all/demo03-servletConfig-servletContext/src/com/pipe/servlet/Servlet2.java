package com.pipe.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;


@WebServlet(urlPatterns="/s2", initParams = {@WebInitParam(name = "keya", value = "valuea"), @WebInitParam(name = "keyb", value = "valueb")})
public class Servlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = super.getServletConfig();
        String key = servletConfig.getInitParameter("key");
        System.out.println("key: " + key);

        System.out.println("************************");
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String paramName = initParameterNames.nextElement();
            System.out.println(paramName + ": " + servletConfig.getInitParameter(paramName));
        }
    }
}
