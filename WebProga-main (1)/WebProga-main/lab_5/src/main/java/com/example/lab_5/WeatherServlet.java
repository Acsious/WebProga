package com.example.lab_5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "Weather", value = "/Weather")
public class WeatherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pogoda = req.getParameter("pogoda");
        String FILENAME = "D:\\My Projects Java\\WebProga-main (1)\\WebProga-main\\lab_5\\src\\main\\webapp\\weather.txt";
        PrintWriter writer = new PrintWriter(FILENAME, "Cp1251");
        writer.write(pogoda);
        writer.close();

        resp.sendRedirect("http://localhost:8080/lab_5_war/secure/lk-page.jsp");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
