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
   Это страница доступна только админу!<br/>
</h1>
<h2>
    Здесь можно отредактировать прогноз погоды на завтра<br/>
</h2>
<form method="post" action="/lab_5_war/Weather" >
    <label>Прогноз среднесуточной температуры на завтра:
        <input type="number" name="pogoda" min="-100" max="100"><br/>
    </label>
    <button type="submit">Сохранить изменения</button>
</form>


<ul>
    <li><a href="/lab_5_war/LoggedOut">Разлогиниться</a></li>
    <li><a href="../index.html">Вернуться на стартовую страницу</a></li>
</ul>
</body>
</html>
