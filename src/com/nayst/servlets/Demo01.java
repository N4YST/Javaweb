package com.nayst.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: Demo01
 * Package: com.nayst.servlets
 * Description:
 *      request保存作用域保存
 * @Author: Nayst
 * @Create: 2023/3/21 17:13
 * @Version: 1.0
 */
@WebServlet("/demo01")
public class Demo01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1、向request保存作用域
        req.setAttribute("uname","lili");
        // 2、客户端重定向
//        resp.sendRedirect("demo02");
        // 3、服务器端转发
        req.getRequestDispatcher("demo02").forward(req,resp);
    }
}
