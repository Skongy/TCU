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
					商品管理
				</td>
			</tr>
			<tr>
				<td align="center" class="altbg1">
					<b>商品编号</b>
				</td>
				<td align="center" class="altbg1">
					<b>商品名称</b>
				</td>
				<td align="center" class="altbg1">
					<b>商品商标</b>
				</td>
				<td align="center" class="altbg1">
					<b>商品型号</b>
				</td>
				<td align="center" class="altbg1">
					<b>商品价格</b>
				</td>				
				<td align="center" class="altbg1">
					<b>修改</b>
				</td>
				<td align="center" class="altbg1">
					<b>删除</b>
				</td>
			</tr>
			
	<%
			ArrayList<Product> list=new ArrayList<Product>();
			ProductDao productdao=new ProductDao();
			 list=productdao.getAllProduct();
			 for(Product n:list){
				 %>
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					<%=n.getId() %>
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<%=n.getName() %>
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<%=n.getBrand() %>
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<%=n.getType() %>
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<%=n.getPrice() %>
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="updateProduct.jsp?id=<%=n.getId() %>">修改</a>
				</td>				
				<td class="altbg2" rowspan="2" align="center">
					<a href="../deleteProductServlet?id=<%=n.getId()%>">删除</a>
				</td>
			</tr>
			<tr></tr>
	<%
	 }
	%>		
			
			
			
			</table>
</body>
</html>