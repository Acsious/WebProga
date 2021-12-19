<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.FileReader" %>
<%@ page import="java.io.FileWriter" %>
<%@ page import="java.util.Date" %>
<%@ page import="com.example.lab_5.ServerTime" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Title</title>
    </head>

    <body>
        <h1>ЛАБА5</h1>
        <h2>Вариант 2. "Вход на сайт прогноза погоды</h2>
        <h3>Это JSPшная копия базовой странички"</h3>

        <%
            int i=0;
            String str;
            ServerTime ST = new ServerTime();
            String time=ST.getDate().toString();
            String FILENAME = "D:\\My Projects Java\\lab_5\\src\\main\\webapp\\count.txt";
            try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
                String strCurrentLine;
                while ((strCurrentLine = br.readLine()) != null) {
                     i = Integer.parseInt (strCurrentLine);
                     i++;
                     out.print("Кол-во посещений: " + i + "<br>");
                     out.print("Текущее время: " + time + "<br>");
                }
            }
            str=Integer.toString(i);
            FileWriter writer = new FileWriter(FILENAME, false);
            writer.write(str);
            writer.flush();
        %>

        <%
            /*
            ServerTime ST = new ServerTime();
            String time=ST.getDate().toString();
            time=ST.getDate().toString();
            out.print("<h2 align=\"center\">" + time + "</h2>");

             */
        %>

        <ul>
            <li><a href="index.html">Вернуться на стартовую страницу</a></li>
        </ul>
    </body>
</html>
