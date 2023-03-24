package com.nayst.servlets;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: Demo06
 * Package: com.nayst.servlets
 * Description:
 *      application
 * @Author: Nayst
 * @Create: 2023/3/22 11:21
 * @Version: 1.0
 */
@WebServlet("/demo06")
public class Demo06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1、获取application保存作用域保存的数据，key为uname
        ServletContext application = req.getServletContext();
        Object uname = application.getAttribute("uname");
        System.out.println("uname: " + uname);
    }
}
