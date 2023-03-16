package com.nayst.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * ClassName: SessionTest
 * Package: com.nayst.servlets
 * Description:
 *
 * @Author: Nayst
 * @Create: 2023/2/3 16:14
 * @Version: 1.0
 */
public class SessionTest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取session，如果无法获取就创建一个新的
        HttpSession session = req.getSession();
        System.out.println("Session: " + session.getId());
    }
}
