package com.nayst.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: SessionGet
 * Package: com.nayst.servlets
 * Description:
 *
 * @Author: Nayst
 * @Create: 2023/2/7 09:50
 * @Version: 1.0
 */

public class SessionGet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object nameObj = req.getSession().getAttribute("name");
        System.out.println(nameObj);

    }
}
