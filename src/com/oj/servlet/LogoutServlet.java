package com.oj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oj.serviceimpl.UserServiceImpl;
import com.oj.util.CookieUtil;


/**  
* 类说明:退出Servlet
*/
public class LogoutServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		UserServiceImpl UserService= new UserServiceImpl();
		String UID=CookieUtil.getUid(request,"token");
		UserService.userLogout(UID);
		CookieUtil.removeCookies(request, response);
		System.out.println("退出成功");
		response.sendRedirect("index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
