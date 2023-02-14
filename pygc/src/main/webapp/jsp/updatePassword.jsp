<%--
  Created by IntelliJ IDEA.
  User: 19726
  Date: 2023/2/13
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>重置密码</title>
    <script src="../static/js/jquery-1.7.1.js"></script>
    <script>
        $$(function () {
            function updatePassword() {
                var phone =$("#phone").val();
                var newPassword=$("#newPassword").val();
                $.ajax({
                    url:"/updatePassword",
                    type:"post",
                    data:{"phone":phone,
                        "newPassword":newPassword},
                    dataType:"JSON",
                    success:function (data) {
                        if (data=="true"){
                            //说明是修改密码成功了
                            alert("密码重置成功");
                            location.href="homePage.jsp";
                        }
                    }
                })
            }
        })
    </script>
</head>
<body>
<div>
    <input type="text" name="phone" id="phone" placeholder="输入手机号码"><br>
    <input type="text" name="code" id="code" placeholder="发送验证码"><br>
    <input type="text" name="newPassword" id="newPassword" placeholder="输入新的登录密码"><br>
    <input type="submit" id="updatePassword" value="确认">
</div>
</body>
</html>
