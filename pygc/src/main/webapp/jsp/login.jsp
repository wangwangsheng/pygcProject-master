<%--
  Created by IntelliJ IDEA.
  User: 19726
  Date: 2023/2/13
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
    <script src="../static/js/jquery-1.7.1.js"></script>
    <script>
            function login(){
                var phone=$("#phone").val();
                var password=$("password").val();
                $.ajax({
                    url:"/login",
                    type:"post",
                    data:{"phone":phone,
                        "password":password
                    },
                    dataType:"JSON",
                    success:function (data) {
                        if (data=="true"){
                            //先弹出一个登录成功 然后进入主页面
                            alert("登录成功");
                            location.href='homePage.jsp'
                        }if (data=="phonenull"){
                            alert("请输入手机号");
                        } else {
                            //登录失败
                            alert("用户名或者密码错误")
                        }
                    }
                })
            }
    </script>
</head>
<body>
<div>
    <input type="text" id="phone" name="phone" placeholder="手机号码"><br>
    <input type="password" id="password" name="password"  placeholder="登录密码"><br>
    <button onclick="login()">登录</button><br>
    //忘记密码页面
    <a href="updatePassword.jsp">忘记密码</a>
    //新用户注册页面
    <a href="register.jsp">新用户注册</a>
</div>
</body>
</html>
