<%@ page language="java" contentType="text/html; charset=utf-8" import="com.cn.entity.*,java.util.*,com.cn.dao.*"
    pageEncoding="utf-8"%>
<html>
<head>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<title>管理员-添加</title>
		<link rel="stylesheet" type="text/css" href="../css/style_admin.css">
		
		<script type="text/javascript">
		function fun_check_form(){
			if(document.form1.title.value==""){
				alert("请输入新闻标题信息。");
				return false;
			}else if(document.form1.content.value==""){
				alert("请输入新闻内容。");
				return false;
			}else{
				return true;
			}
		}
		
		</script>
	</head>

	<body>
		<form name="form1" action="../addNewsServlet" method="post" onSubmit="return fun_check_form()"><!--指定表单提交时将数据发送到的服务器地址-->
			<table cellspacing="1" cellpadding="4" width="100%"
				class="tableborder" id="table3">

				<input type="hidden" name="action" value="save">
				<tr>
					<td colspan="12" class="header">
						添加新闻信息
					</td>
				</tr>
				<tr>
					<td class="altbg1">
						新闻标题：
					</td>
					<td class="altbg2" colspan="11">
						<input type="text" name="title" size="34">
					</td>
				</tr>
				<tr>
					<td class="altbg1">
						新闻内容：
					</td>
					<td class="altbg2" colspan="11">
						<textarea rows="5" cols="60" name="content"></textarea>
					</td>
				</tr>
				

				<tr>
					<td class="altbg1">
					</td>
					<td class="altbg2" colspan="11">
						<input type="submit" value="提交" name="B1" />
						&nbsp;
						<input type="reset" value="重置" name="B2" />
					</td>
				</tr>

			</table>
		</form>
	</body>

</html>
