<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.cn.entity.*,com.cn.dao.*,com.cn.util.*,java.util.*"%>
<html>
	<head>
		<title>留言本</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<meta name="description" content="留言本">
		<link href="img/1/jd100.css" rel="stylesheet" type="text/css">
	</head>
	<body background=img/1/bookbg.gif leftmargin='0' topmargin='3'
		marginwidth='0' marginheight='0'>
		<div align='center'>
			<IMG src=img/1/welcome.jpg>
		</div>
		<div align='center'>
			<table width='750' border='0' cellspacing='1' cellpadding='4'
				align='center'>
				<tr>
					<td height='20' colspan='2' align='right' class='unnamed2'>
						<marquee onMouseOut=start(); onMouseOver=stop(); scrollamount=3>
							<b><font color=#000099>欢迎您使用留言本</font> </b>
						</marquee>
					</td>
				</tr>

			</table>
			<div align='center' style='width:750px'>
				<div align='left'>
					<table width='%' height='20' border='0' cellpadding='0'
						cellspacing='0'>
						<tr>							
							<td width='11' background='img/1/titlemu_1.gif'></td>
							<td width='*' background='img/1/titlemu_2.gif'>
								<div align='center'>
									<a href='newMessage.jsp' class=jdmenu><b>新留言</b>
									</a>
								</div>
							</td>
							<td width='12' background='img/1/titlemu_3.gif'></td>
						</tr>
					</table>
				</div>
			</div>
			<form name='form' method='post' action='index.asp'
				onSubmit='submitonce(this)'>
				<TABLE width='750' border=0 align='center' cellPadding=0
					cellSpacing=0 borderColor=#111111 style='BORDER-COLLAPSE: collapse'>
					<TBODY>
						<TR>
							<TD width='2%'>
								<IMG src='img/1/T_left.gif' border=0>
							</TD>
							<TD width='96%' background='img/1/Tt_bg.gif'></TD>
							<TD width='2%'>
								<IMG src='img/1/T_right.gif' border=0>
							</TD>
						</TR>
					</TBODY>
				</TABLE>
				<TABLE width='750' height=51 border=1 align=center cellPadding=3
					cellSpacing=0 class='jd_tab'
					style='border-collapse:collapse;word-wrap:break-word;'>
					<TBODY>
						<TR class=jd_titlemu>
							<TD width='5%' class='jd_tab'>
								<div align='center'>
									回复
								</div>
							</TD>
							<TD width='50%' class='jd_tab'>
								<div align='center'>
									标题
								</div>
							</TD>
							<TD width='20%' class='jd_tab'>
								<div align='center'>
									作者
								</div>
							</TD>
							<TD width='25%' class='jd_tab'>
								<div align='center'>
									时间
								</div>
							</TD>
						</TR>
						
						
						<%
						MessageDao messagedao=new MessageDao();
						ArrayList<Message> list=messagedao.getAllMessage();
						
						for(Message m:list){
						
						
						 %>
						<TR class=unnamed1>
							<TD width='6%' height='25' align=middle valign='top'
								class='jd_tab'>
								<%=m.getCount()%>
							</TD>
							<TD width='53%' height='25' align=left valign='top'
								class='jd_tab'>
								<a
									href='revertMessage.jsp?messageID=<%=m.getMid()%>'>/////
									<img src='img/1/jd-to.gif' border='0'>&nbsp;<%=m.getTitle() %>
								</a>
							</TD>
							<TD width='20%' height='25' align=middle valign='top'
								class='jd_tab'>
								<font color=#666666><%=m.getName() %></font>
							</TD>
							<TD width='14%' height='25' align=left valign='top'
								class='jd_tab'>
								<font color=#666666><%=m.getTime() %> </font>
							</TD>
						</TR>
						<%} %>
						
						
						
					</TBODY>
				</TABLE>
				
				
				
				
				<TABLE width='750' border=0 align='center' cellPadding=0
					cellSpacing=0 style='BORDER-COLLAPSE:collapse'>
					<TBODY>
						<TR>
							<TD>
								<IMG src='img/1/T_bottomleft.gif' border=0>
							</TD>
							<TD width='100%' background='img/1/T_bottombg.gif'></TD>
							<TD>
								<IMG src='img/1/T_bottomright.gif' border=0>
							</TD>
						</TR>
					</TBODY>
				</TABLE>
				<TABLE width='10' border=0 align='center' cellPadding=0
					cellSpacing=0>
					<TR>
						<TD height=5></TD>
					</TR>
				</TABLE>
			</form>
		</div>

	</body>
</html>