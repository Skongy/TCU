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
			<form name="form1" action="showUserList.jsp" method="post">
			<tr>
				<td colspan="15" class="header">
				  查询收费信息浏览
				</td>
			</tr>
			<tr>
				<td align="center" class="altbg1">
					<b>收费ID</b>
				</td>
				<td align="center" class="altbg1">
					<b>收费类型</b>
				</td>
				<td align="center" class="altbg1">
					<b>姓名</b>
				</td>
				<td align="center" class="altbg1">
					<b>身份证号</b>
				</td>
				<td align="center" class="altbg1">
					<b>性别</b>
				</td>
				<td align="center" class="altbg1">
					<b>厂家</b>
				</td>				
				<td align="center" class="altbg1">
					<b>负责人</b>
				</td>
				<td align="center" class="altbg1">
					<b>收费日期</b>
				</td>
				<td align="center" class="altbg1">
					<b>价格</b>
				</td>
				<td align="center" class="altbg1">
					<b>其它信息</b>
				</td>
			</tr>
			
	<%
	ArrayList<Charge> list=null;
	list=(ArrayList<Charge>)session.getAttribute("list");
			 for(Charge n:list){
				 %>
				 
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					<%=n.getId() %>
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<%=n.getType() %>
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<%=n.getName() %>
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<%=n.getIdcardnum() %>
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<%=n.getSex() %>
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<%=n.getProductorname() %>
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<%=n.getDepartment() %>
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<%=n.getTime() %>
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<%=n.getPrice() %>
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<%=n.getOther() %>
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