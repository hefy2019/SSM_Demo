<%@ page language="java" contentType="text/html; charset=UtF-8"
	pageEncoding="UtF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UtF-8">
<title>注册</title>
<!-- <script type="text/javascript">
//表单验证
function allIsNull(){
	var upass = document.registerForm.upass.value;
	var reupass = document.registerForm.reupass.value;
	if(upass != reupass){
		alert("两次密码不一致！");
		return false;
	}
	document.registerForm.submit();
	return true;
}
</script> -->
</head>
<body>
	<form action="${pageContext.request.contextPath}/user/register"
		method="post" name="registForm">
		<table border="1" bgcolor="lightblue" align="center">
			<tr>
				<td>姓名：</td>
				<td><input class="textSize" type="text" name="uname"
					value="${uname}"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input class="textSize" type="password" maxlength="20"
					name="upass"></td>
			</tr>
			<tr>
				<td>确认密码：</td>
				<td><input class="textSize" type="password" maxlength="20"
					name="reupass"></td>
			</tr>
			<tr>
				<td colspan="1">
				<input type="image"
					src="${pageContext.request.contextPath}/images/ok.gif"
					onclick="allIsNull()">
			</tr>
			<!-- <tr>
				<td colspan="2" align="center"><input type="button" value="注册"
					onclick="allIsNull()"></td>
			</tr> -->
		</table>
	</form>
</body>
</html>