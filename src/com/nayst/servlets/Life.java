package com.nayst.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: Lifr
 * Package: com.nayst.servlets
 * Description:
 *
 * @Author: Nayst
 * @Create: 2023/2/3 14:34
 * @Version: 1.0
 */
public class Life extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("正在初始化...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("正在服务...");
    }

    @Override
    public void destroy() {
        System.out.println("正在销毁...");
    }
}
