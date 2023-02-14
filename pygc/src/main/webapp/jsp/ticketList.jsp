<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/2/13
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="../static/js/jquery-1.7.1.js"></script>
    <script>
        $(function () {
            zhpx();
            //综合排序
        })
        function zhpx() {
            $("#c1").empty()
            $("#c2").empty()
            $("#c3").empty()
            $.ajax({
                url: "/getTicket",
                type:"post",
                async:false,
                data:{"type":"票吧"},
                dataType:"JSON",
                success:function (data) {
                    $.each(data,function (i,ticket) {
                        $("#c1").append("<ul>" +
                            "<li><a href='/ticket?bid="+ticket.b_id+"'>"+ticket.b_name+"</a></li>"+
                            "<li>"+ticket.b_price+"</li>" +
                            "<li>"+ticket.b_introduce+"</li>" +
                            "</ul>")
                    })
                }
            });
        }
    </script>
    <title>Title</title>
</head>
<body>
    <button onclick="zhpx()">综合排序</button>
    <button onclick="getTicketOrderPrice()">价格排序</button>
    <button onclick="getTicketByST()">分类查看</button>
    <ul id="c1">
        <li>票吧</li>
    </ul>
    <ul id="c2">
        <li>票吧</li>
    </ul>
    <ul id="c3">
        <li>票吧</li>
    </ul>
<script>
    //价格排序
    function getTicketOrderPrice() {
        $("#c1").empty()
        $("#c2").empty()
        $("#c3").empty()
        $.ajax({
            url: "/getTicketOrderPrice",
            type:"post",
            async:false,
            data:{"type":"票吧"},
            dataType:"JSON",
            success:function (data) {
                $.each(data,function (i,ticket) {
                    $("#c2").append("<ul>" +
                        "<li><a href='/ticket?bid="+ticket.b_id+"'>"+ticket.b_name+"</a></li>"+
                        "<li>"+ticket.b_price+"</li>" +
                        "<li>"+ticket.b_introduce+"</li>" +
                        "</ul>")
                })
            }
        });
    }
    //分类查看
    function getTicketByST() {
        $("#c1").empty()
        $("#c2").empty()
        $("#c3").empty()
        $.ajax({
            url: "/getTicketByST",
            type:"post",
            async:false,
            data:{"type":"票吧","st":"一日游"},
            dataType:"JSON",
            success:function (data) {
                $.each(data,function (i,ticket) {
                    $("#c3").append("<ul>" +
                        "<li><a href='/ticket?bid="+ticket.b_id+"'>"+ticket.b_name+"</a></li>"+
                        "<li>"+ticket.b_price+"</li>" +
                        "<li>"+ticket.b_introduce+"</li>" +
                        "</ul>")
                })
            }
        });
    }
</script>
</body>
</html>
