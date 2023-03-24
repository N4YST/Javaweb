package com.nayst.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: Demo03
 * Package: com.nayst.servlets
 * Description:
 *      session保存作用域保存
 * @Author: Nayst
 * @Create: 2023/3/22 10:17
 * @Version: 1.0
 */
@WebServlet("/demo03")
public class Demo03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1、向request保存作用域保存数据
        req.getSession().setAttribute("uname","lina");
        // 2、客户端重定向
        resp.sendRedirect("demo04");
        // 3、服务端转发
//        req.getRequestDispatcher("demo04").forward(req,resp);
    }
}
