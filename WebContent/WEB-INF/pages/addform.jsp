<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>添加学生</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/add" method="post">
	请输入学生姓名：<input type="text" name="name"><br/>
	请输入学生地址：<input type="text" name="location"><br/>
	请输入学生身份证号：<input type="text" name="idcard"><br/>
	请输入学生成绩：<input type="text" name="grade"><br/>
		<input type="submit" value="添加"><br/>
	</form>
</body>
</html>