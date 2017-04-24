<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>查询详细信息</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/find" method="post">
	请输入学生身份证号：<input type="text" name="idcard"><br/>
		<input type="submit" value="查询"><br/>
	</form>

</body>
</html>