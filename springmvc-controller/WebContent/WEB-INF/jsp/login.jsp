<%@ page language="java" contentType="text/html; charset=UtF-8"
	pageEncoding="UtF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UtF-8">
<title>登录</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/user/login"
		method="post">
		<table>
			<tr>
				<td colspan="2"><img
					src="${pageContext.request.contextPath}/images/login.gif"></td>
			</tr>
			<tr>
				<td>姓名：</td>
				<td><input class="textSize" type="text" name="uname"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input class="textSize" type="password" name="upass"></td>
			</tr>
			<tr>
				<td colspan="2">
				<input type="image"
					src="${pageContext.request.contextPath}/images/ok.gif"
					onclick="gogo()">
				<input type="image"
					src="${pageContext.request.contextPath}/images/cancel.gif"
					onclick="cancel()">
					</td>
			</tr>
		</table>
		${messageError}
	</form>
</body>
</html>