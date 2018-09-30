<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>房屋出租登录页面</title>
</head>
<body>
	<center>
		<h2>管理员登录</h2>
		<font color="red">${requestScope.message }</font>
		<form action="login" method="post">
			<table border="1">
				<tr>
					<td>用户名</td>
					<td><input type="text" name="u_name"></td>
				</tr>

				<tr>
					<td>密码</td>
					<td><input type="password" name="u_pwd"></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit" value="登录"></td>
				</tr>
			</table>


		</form>
	</center>
</body>
</html>
