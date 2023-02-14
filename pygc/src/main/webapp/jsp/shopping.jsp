<%--
  Created by IntelliJ IDEA.
  User: 25110
  Date: 2023/2/13
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="../static/js/jquery-1.7.1.js"></script>

    <script>
        $(function () {
            $.ajax({
                url:"/getshopping",
                type:"POST",
                async:true,
                dataType:"json",
                success:function (data) {
                    $.each(data,function (i,shopping) {
                        $("#sid").append("<tr>"+"<td><input type='checkbox' name='sid' value='"+shopping.s_id+"'></td>"+"<td>"+shopping.s_id+"</td>"+
                            "<td>"+shopping.s_name+"</td>"+
                            "<td>"+shopping.s_property+"</td>"+
                            "<td>"+shopping.s_price+"</td>"+
                            "<td><button onclick='amountAdd("+shopping.s_id+")'>-</button></td>"+
                            "<td>"+shopping.s_amount+"</td>"+
                            "<td><button onclick='amountDown("+shopping.s_id+")'>+</button></td>"+
                            "</tr>"
                        )
                    })
                }
            })

        })


    </script>
</head>
<body>


<table id="sid">

</table>
<script>
    function amountAdd(s_id) {
        // var sid = $("#sid");

        $.ajax({
            url:"/updateSid1",
            type:"POST",
            data:{
                s_id:s_id
            },
            success:function (data) {
                if (data==1){
                    alert("商品数量不能为0")
                    location.reload()
                }else {
                   location.reload()
                }
            }
        })
    }
    function amountDown(s_id) {

        $.ajax({
            url:"/updateSid2",
            type:"POST",
            data:{
                s_id:s_id
            },
            success:function (data) {
                if (data==1){
                    location.reload()
                }

            }
        })
    }

    $(function () {

        $('input[type="checkbox"]:checked').each(function () {
            $(this).is('checked');
        })
    })
</script>
</body>
</html>
