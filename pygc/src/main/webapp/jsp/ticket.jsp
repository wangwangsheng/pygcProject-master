<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/2/13
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="../static/js/jquery-1.7.1.js"></script>
    <script>
        function addShopping(bid) {
            location.href="/addShopping?bid="+bid+"&u_id"  ;
        }
        $.ajax({
            url:"/getBaByUid",
            type:"post",
            data:{
                u_id:${ticket.u_id},
            },
            dataType:"json",
            success:function (data) {
                alert(data);
                $.each(data,function (i,ticket) {
                    $("#c2").append("<ul>" +
                        "<li><a href='/ticket?bid="+ticket.b_id+"'>"+ticket.b_name+"</a></li>"+
                        "<li>"+ticket.b_price+"</li>" +
                        "<li>"+ticket.b_introduce+"</li>" +
                        "<li><img src='"+ticket.image+"' ></li>" +
                        "<li>"+ticket.dict.d_name+"</li>" +
                        "</ul>")
                })
            }
        })

    </script>
</head>
<body>
    <div>
        <ul id="c1">
            <li>票吧</li>
            <li><img src="${ticket.b_image}"></li>
            <li>${ticket.b_name}</li>
            <li>${ticket.b_introduce}</li>
            <li><button onclick="addShopping(${ticket.b_id})">加入购物车</button></li>
        </ul>

        <ul id="c2">
            <li>相关商品</li>
        </ul>

    </div>
</body>
</html>
