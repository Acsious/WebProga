<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    <%@include file="../styles.css"%>
</style>

<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <form method="post" action="j_security_check">
            <label>Логин:
                <input type="text" name="j_username"><br />
            </label>
            <label>Пароль:
                <input type="password" name="j_password"><br />
            </label>
            <button type="submit">Войти</button>
            <!--
            login: admin
            password: 12345
            -->
        </form>
    </body>
</html>
