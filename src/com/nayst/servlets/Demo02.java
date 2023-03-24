package com.nayst.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: Demo02
 * Package: com.nayst.servlets
 * Description:
 *      request保存作用域获取
 * @Author: Nayst
 * @Create: 2023/3/21 17:24
 * @Version: 1.0
 */
@WebServlet("/demo02")
public class Demo02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1、获取req保存作用域保存的数据
        Object unameObj = req.getAttribute("uname");
        System.out.println("uname: " + unameObj);
    }
}
