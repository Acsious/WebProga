<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <form method="post" action="j_security_check">
            <label>Name:
                <input type="text" name="j_username"><br />
            </label>
            <label>Password:
                <input type="password" name="j_password"><br />
            </label>
            <button type="submit">Submit</button>
            <!--
            login: admin
            password: 12345
            -->
        </form>
    </body>
</html>
