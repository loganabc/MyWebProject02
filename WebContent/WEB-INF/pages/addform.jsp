<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>���ѧ��</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/add" method="post">
	������ѧ��������<input type="text" name="name"><br/>
	������ѧ����ַ��<input type="text" name="location"><br/>
	������ѧ�����֤�ţ�<input type="text" name="idcard"><br/>
	������ѧ���ɼ���<input type="text" name="grade"><br/>
		<input type="submit" value="���"><br/>
	</form>
</body>
</html>