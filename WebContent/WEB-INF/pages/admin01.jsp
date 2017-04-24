<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生管理平台</title>
</head>
<body>
欢迎使用学生管理平台
	<form action="${pageContext.request.contextPath}/findAll" method="post">
		<input type="submit" name="username" value="查询所有学生"><br/>
	</form>
	<br/>
	<form action="${pageContext.request.contextPath}/delete_form" method="post">
		<input type="submit" value="删除学生"><br/>
	</form>
	<br/>
	<form action="${pageContext.request.contextPath}/add_form" method="post">
		<input type="submit" name="username" value="添加学生"><br/>
	</form>
	<br/>
	<form action="${pageContext.request.contextPath}/find_form" method="post">
		<input type="submit" name="username" value="查询详细信息"><br/>
	</form>
</body>
</html>