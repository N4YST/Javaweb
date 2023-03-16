package com.nayst.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: SessionSet
 * Package: com.nayst.servlets
 * Description:
 *
 * @Author: Nayst
 * @Create: 2023/2/7 09:52
 * @Version: 1.0
 */
public class SessionSet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("name","lina");
    }
}
