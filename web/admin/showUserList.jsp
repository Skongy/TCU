<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.cn.entity.*,java.util.*,com.cn.dao.*"%>
<html>
	<head>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<title>管理员信息</title>
		<link rel="stylesheet" type="text/css" href="../css/style_admin.css">
</head>
<body>
		<table cellspacing="1" cellpadding="4" width="100%"
			class="tableborder" id="table3">
			<form name="form1" action="showUserList.jsp" method="post">
			<tr>
				<td colspan="15" class="header">
					用户管理
				</td>
			</tr>
			<tr>
				<td align="center" class="altbg1">
					<b>用户名</b>
				</td>
				<td align="center" class="altbg1">
					<b>密码</b>
				</td>
				<td align="center" class="altbg1">
					<b><INPUT onClick="return window.confirm('确认删除')"
							type="submit" value="删除"> </b>
				</td>
			</tr>
			<%
			
			
			ArrayList<Users> list=new ArrayList<Users>();
			UserDao usersdao=new UserDao();
			 list=usersdao.getAllUsers();
			 for(Users u:list){
			
			
			 %>
			
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					<%=u.getName() %>
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<%=u.getPass() %>
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="../deleteUser?userName=<%=u.getName()%>">删除</a>
				
				</td>
			</tr>
			

			<tr>

			</tr>
			<%
			} 
			%>
			</table>
</body>
</html>