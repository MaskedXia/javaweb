package com.pipe.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

// 生存周期 单例 不建议修改资源，容易引发线程安全问题
// name "/servletLifeCycle"
// loadOnStartup -1默认 启动不会实例化 正整数表示启动顺序
@WebServlet("/servletLifeCycle")
public class ServletLifeCycle extends HttpServlet {

    public ServletLifeCycle() {
        System.out.println("1 ServletLifeCycle constructor");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("2 initializing");
    }

    @Override
    public void destroy() {
        System.out.println("4 destroy");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("3 service"); // 多次
    }
}
