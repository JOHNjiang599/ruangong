<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <script type="text/javascript" src="../../js/index_js.js"></script>
</head>
<body onload="show()">
<div id="login">
    <form class="login" method="post" action="${pageContext.request.contextPath}/user/validateUser">
        <label>
            <input type="radio" name="userType" value="team" checked>
        </label>球队用户
        <label>
            <input type="radio" name="userType" value="admin">
        </label>管理员<br><br>
        用户名:<br>
        <label>
            <input type="text" name="userName">
        </label><br>
        密码：<br>
        <label>
            <input type="password" name="password">
        </label>
        <br><br>
        <input type="submit" value="登陆">
    </form>
    <button class="regist" onclick="Regist()">注册账户(球队专用）</button>
</div>
<div class="register" id="logup">
    <form method="post" action="${pageContext.request.contextPath}/user/addUser">
        用户名：<br>
        <input type="text" name="username">
        <br>
        密码：<br>
        <input type="password" name="password">
        <br>
        重复密码：<br>
        <input type="password" name="repassword">
        <br>
        <input type="submit" value="注册账号">
    </form>
    <!--不需要手动返回，注册成功即自动返回登录页-->
    <!--<button id="log" onclick="Login()">返回登陆</button>-->
</div>
</body>
</html>