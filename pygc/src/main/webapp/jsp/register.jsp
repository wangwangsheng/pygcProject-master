<%--
  Created by IntelliJ IDEA.
  User: 19726
  Date: 2023/2/13
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新用户注册页面</title>
    <script src="../static/js/jquery-1.7.1.js"></script>
    <script>

            function register() {
                var phone =$("#phone").val();
                var password =$("#password").val();
                $.ajax({
                    url:"/register",
                    type:"post",
                    data:{"phone":phone,
                    "password":password
                    },
                    dataType:"JSON",
                    success:function (data) {
                        if (data=="not"){
                            alert("密码长度需要6-20位")
                        }if (data=="true"){
                            alert("注册成功");
                            location.href="homePage.jsp"
                        }if (data=="false"){
                            alert("手机号已存在，请重新输入")
                        }
                    }
                })
            }

    </script>
</head>
<body>
<div>
    <input type="text" name="phone" id="phone" placeholder="输入手机号码"></br>
    <input type="text" name="code" id="code" placeholder="短信验证吗"></br>
    <input type="text" name="password" id="password" placeholder="设置登录密码"><br>
    <input type="submit" id="register" value="确认">
</div>
</body>
</html>
