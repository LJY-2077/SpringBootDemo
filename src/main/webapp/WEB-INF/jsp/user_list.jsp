<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="./statics/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
	//查询的内容
	function quary() {
		var str = $("#username").val();
		alert(str)
		$.ajax({
			url : "queryU/" + str,
			type : "get",
			success : function(data) {
				alert(data);
				//i循环的次数  value对象 id,name等是属性 <接收list>
				$.each(data, function(i, value) {
					$("#remark").append(
							" <tr><td>" + value.id + "</td><td>"
									+ value.username + "</td><td>" + value.age
									+ "</td><td>" + value.customerid
									+ "</td></tr>");
				});
			},
			error : function() {
				alert("没有找到此人");
			}
		});
	}
</script>
</head>
<body>
	<form action="">
		查询:<input type="text" id="username" onchange="quary()" />
		<table class="table table-striped" id="remark">
			<tr>
				<td>id</td>
				<td>名字</td>
				<td>年龄</td>
				<td>**</td>
			</tr>
		</table>
	</form>
	<table>
		<tr>
			<td>姓名</td>
			<td>年龄</td>
		</tr>

		<c:forEach var="m" items="${users }">
			<tr>
				<td>${m.username}
				<td />
				<td>${m.age}
				<td />
			</tr>
		</c:forEach>


	</table>
</body>
</html>