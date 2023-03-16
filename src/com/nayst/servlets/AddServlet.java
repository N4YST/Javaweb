package com.nayst.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: AddServlet
 * Package: com.nayst.servlets
 * Description:
 *
 * @Author: Nayst
 * @Create: 2023/2/2 09:45
 * @Version: 1.0
 */
public class AddServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码防止中文乱码
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String name = req.getParameter("name");
        String price = req.getParameter("price");
        String count = req.getParameter("count");
        String remark = req.getParameter("remark");

        System.out.println("name = " + name);
        System.out.println("price = " + price);
        System.out.println("count = " + count);
        System.out.println("remark = " + remark);
    }
}
