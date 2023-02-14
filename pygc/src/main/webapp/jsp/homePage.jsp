<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/2/12
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
    <script src="../static/js/jquery-1.7.1.js"></script>
    <script>

        $(function () {

            $.ajax({
                url: "/getTicket",
                type:"post",
                async:false,
                data:{"type":"票吧"},
                dataType:"JSON",
                success:function (data) {
                    $.each(data,function (i,ticket) {
                        $("#c2").append("<li>"+"<a href='/ticket?bid="+ticket.b_id+"'>"+ticket.b_name+"</a>"+ticket.b_price+"</li>")
                    })
                }
            });

            $.ajax({
                url: "/getHotel",
                type:"post",
                async:false,
                data:{"type":"住吧"},
                dataType:"JSON",
                success:function (data) {
                    $.each(data,function (i,hotel) {
                        $("#c3").append("<li>"
                            + "<a href='/hotel?bid="+hotel.b_id+"'>"+hotel.b_name+"</a>"
                            + hotel.b_price+"元"+hotel.b_st+hotel.b_sales+"销量"
                            + "</li>")
                    })
                }
            });

        })

    </script>
</head>
<body>
<div>
    <div class="l1">
        <div class="title">
            <h4>平遥古城</h4>
        </div>
    </div>
    <div class="l2">

    </div>
    <div class="l3">
        <ul id="c1">
            <li><a href="ticketList.jsp">票吧</a></li>
            <li>住吧</li>
            <li>吃吧</li>
            <li>买吧</li>
            <li>周边游</li>
            <li>娱乐</li>
            <li>资讯</li>
            <li>攻略</li>
        </ul>
    </div>
    <div>
        <ul id="c2">
            <li>票吧</li>
        </ul>
    </div>
    <div>
        <ul id="c3">
            <li>住吧</li>
        </ul>
    </div>
    <div>
        <ul>
            <li>吃吧</li>
        </ul>
    </div>
    <div>
        <ul>
            <li>买吧</li>
        </ul>
    </div>
    <div>
        <ul>
            <li>周边游</li>
        </ul>
    </div>
    <div>
        <ul>
            <li>娱乐</li>
        </ul>
    </div>
    <div>
        <ul>
            <li>资讯</li>
        </ul>
    </div>
    <div>
        <ul>
            <li>攻略</li>
        </ul>
    </div>
</div>
</body>
</html>
