package com.cn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cn.dao.*;
import com.cn.entity.*;
/**
 * Servlet implementation class updateProductServlet
 */
@WebServlet("/updateProductServlet")
public class updateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		int id_=Integer.parseInt(request.getParameter("id_"));
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String brand=request.getParameter("brand");
		String type=request.getParameter("type");
		int price=Integer.parseInt(request.getParameter("price"));
		String content=request.getParameter("content");
		String picture=request.getParameter("picture");
		Product product=new Product(id,name,brand,type,price,content,picture);
		ProductDao productdao=new ProductDao();
		int count=productdao.updateProduct(product, id_);
		if(count==1) {
			response.sendRedirect("admin/manageProduct.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
