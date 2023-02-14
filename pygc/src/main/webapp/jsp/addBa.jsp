<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/2/13
  Time: 23:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="../static/js/jquery-1.7.1.js"></script>
    <script>
        function addImage() {
            var formData=new FormData();
            formData.append("file",$('[name="file"]')[0].files[0])
            $.ajax({
                url: "/addImage",
                type:"post",
                async:false,
                data:formData,
                contentType:false,
                processData:false,
                dataType:"text",
                success:function (data) {
                    $("#image").attr("src",data)
                    addBa(data);
                }
            });
        }
            function addBa(b_image) {
                var u_id=$("#u_id")
                var b_name=$("#b_name");
                var b_introduce=$("#b_introduce");
                var b_price=$("#b_price");
                $.ajax({
                    url: "/addBa",
                    type:"post",
                    data:{b_name:b_name,
                        b_introduce:b_introduce,
                        b_price:b_price,
                        b_image:b_image
                    },
                    dataType:"json",
                    success:function (data) {
                        if (data=="0"){
                            location.href="/jsp/homePage.jsp"
                        } else {
                            alert("添加失败")
                        }
                    }
                });
            }
    </script>
</head>
<body>
    商人:<input id="u_id" name="u_id">
    名称:<input id="b_name" name="b_name">
    简介:<input id="b_introduce" name="b_introduce">
    价格:<input id="b_price" name="b_price">
    类型:<select>
            <option value="票吧">票吧</option>
            <option value="住吧">住吧</option>
        </select>
    图片:<input type="file" name="file">

    <img id="image" src="">

    <button onclick="addImage()">添加项目</button>
</body>
</html>
