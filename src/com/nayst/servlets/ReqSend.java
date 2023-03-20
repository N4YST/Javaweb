package com.nayst.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: Forward
 * Package: com.nayst.servlets
 * Description:
 *
 * @Author: Nayst
 * @Create: 2023/3/20 16:07
 * @Version: 1.0
 */
public class ReqSend extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("req send...");
        // TODO 服务器内部转发
        // req.getRequestDispatcher("rec").forward(req,resp);
        // TODO 服务器重定向
        resp.sendRedirect("rec");
    }
}
