package com.nayst.servlets;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: Demo05
 * Package: com.nayst.servlets
 * Description:
 *      application保存作用域保存
 * @Author: Nayst
 * @Create: 2023/3/22 11:21
 * @Version: 1.0
 */
public class Demo05 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1、向application保存作用域保存数据
        ServletContext application = req.getServletContext();
        application.setAttribute("uname","lina");

        // 2、客户端重定向
        resp.sendRedirect("demo06");

        // 3、服务器端转发
        req.getRequestDispatcher("demo06").forward(req,resp);

    }
}
