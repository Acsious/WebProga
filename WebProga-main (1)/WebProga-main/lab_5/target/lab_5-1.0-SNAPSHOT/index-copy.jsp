<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.FileReader" %>
<%@ page import="java.io.FileWriter" %>
<%@ page import="java.util.Date" %>
<%@ page import="com.example.lab_5.ServerTime" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Locale" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    <%@include file="styles.css"%>
</style>

<html>
    <head>
        <title>Title</title>
    </head>

    <body>
        <h1>ЛАБА5</h1>
        <h2>Вариант 2. "Вход на сайт прогноза погоды</h2>
        <h3>Это JSPшная копия базовой странички"</h3>
        <h2>Работу выполнили студенты группы 20ВП1:<br> Ульченко Фёдор, Нешкин Даниил</h2>
        <img src="kartinkush.jpg"><br/>
        <%
            int i=0;
            String str;
            ServerTime ST = new ServerTime();
            String time= ST.getDate();

            String FILENAME = "D:\\My Projects Java\\WebProga-main (1)\\WebProga-main\\lab_5\\src\\main\\webapp\\count.txt";
            try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
                String strCurrentLine;
                while ((strCurrentLine = br.readLine()) != null) {
                     i = Integer.parseInt (strCurrentLine);
                     i++;
                     out.print("Кол-во посещений: " + i + "<br>");
                     out.print("Текущие дата и время: " + time + "<br>");
                }
            }
            str=Integer.toString(i);
            FileWriter writer = new FileWriter(FILENAME, false);
            writer.write(str);
            writer.flush();
        %>

        <ul>
            <li><a href="index.html">Вернуться на стартовую страницу</a></li>
        </ul>
    </body>
</html>
