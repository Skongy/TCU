<%@ page language="java" contentType="text/html; charset=utf-8" import="com.cn.entity.*,java.util.*,com.cn.dao.*"
    pageEncoding="utf-8"%>
<html>
<head>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<title>管理人员-管理</title>
		<link rel="stylesheet" type="text/css" href="../css/style_admin.css">
</head>
<body>
		<table cellspacing="1" cellpadding="4" width="100%"
			class="tableborder" id="table3">
			<form name="form1" action="deleteNewsServlet" method="post">
			<tr>
				<td colspan="15" class="header">
					新闻管理
				</td>
			</tr>
			<tr>
				<td align="center" class="altbg1">
					<b>新闻标题</b>
				</td>
				<td align="center" class="altbg1">
					<b>新闻发布时间</b>
				</td>
				<td align="center" class="altbg1">
					<b>删除</b>
				</td>
			</tr>
			
			<%
			ArrayList<News> list=new ArrayList<News>();
			 NewsDao newsdao=new NewsDao();
			 list=newsdao.getAllNews();
			 for(News n:list){
				 %>
			<tr>
			<td rowspan="2" align="center" class="altbg2">
				<%=n.getTitle() %>
			</td>
			<td class="altbg2" rowspan="2" align="center">
				<%=n.getTime() %>
			</td>
			<td class="altbg2" rowspan="2" align="center">
				<a href="../deleteNewsServlet?id=<%=n.getId()%>">删除</a>
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