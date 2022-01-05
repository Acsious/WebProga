<%@ page import="com.example.lab_5.LogOutServlet" %>
<%@ page import="java.io.FileWriter" %>
<%@ page import="java.io.FileReader" %>
<%@ page import="java.io.BufferedReader" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    <%@include file="../styles.css"%>
</style>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    Это твой личный кабинет<br/>
</h1>
<%
    String FILENAME = "D:\\My Projects Java\\WebProga-main (1)\\WebProga-main\\lab_5\\src\\main\\webapp\\weather.txt";
    try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String strCurrentLine= br.readLine();
           do {
                if (strCurrentLine!=null) {
                    out.print("Среднесуточная температура завтра: " + strCurrentLine + "°C" + "<br>");
                }
                else {
                    out.print("Отсутствует прогноз погоды на завтра"+"<br/>");
                }
        } while ((strCurrentLine = br.readLine()) != null);
    }
%>

<ul>
    <li><a href="/lab_5_war/LoggedOut">Разлогиниться</a></li>
    <li><a href="/lab_5_war/adme/admin-page.jsp">Изменить прогноз погоды</a></li>
</ul>
</body>
</html>
