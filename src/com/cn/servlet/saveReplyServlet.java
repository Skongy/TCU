package com.cn.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.dao.MessageDao;
import com.cn.dao.ReplyDao;
import com.cn.entity.Message;
import com.cn.entity.Reply;

/**
 * Servlet implementation class saveReplyServlet
 */
@WebServlet("/saveReplyServlet")
public class saveReplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public saveReplyServlet() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		int mid=Integer.parseInt(request.getParameter("messageID"));
		String name =request.getParameter("name");
		String content =request.getParameter("content");
		Date date =new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time =sdf.format(date);
		Reply r=new Reply(content,name,time,mid);
		ReplyDao repdao =new ReplyDao();
		int count=repdao.addReply(r);
		if(count==1) {
			response.sendRedirect("revertMessage.jsp?messageID="+mid);
		}else
			response.sendRedirect("newMessage.jsp");
		
		
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
