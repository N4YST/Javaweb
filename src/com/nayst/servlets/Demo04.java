package com.nayst.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: Demo04
 * Package: com.nayst.servlets
 * Description:
 *      session保存作用域取值
 * @Author: Nayst
 * @Create: 2023/3/22 11:00
 * @Version: 1.0
 */
@WebServlet("/demo04")
public class Demo04 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object uname = req.getSession().getAttribute("uname");
        System.out.println("uname: " + uname);
    }
}
