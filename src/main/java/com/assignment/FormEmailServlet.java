package com.assignment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FormEmailServlet")
public class FormEmailServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        resp.setContentType("text/html");

        PrintWriter p = resp.getWriter();
        p.println("<h1>Email:" + email + "</h1>");
        p.println("Hello, " + email);
        getServletContext().getRequestDispatcher("/email.html").include(req, resp);
        p.close();
    }
}
