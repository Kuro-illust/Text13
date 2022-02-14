package com.example.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet ("/BoardServlet")
public class BoardServlet extends HttpServlet {

	 @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {	
		 
	        request.setCharacterEncoding("UTF-8");
	        response.setContentType("text/html;charset=UTF-8");
		 
		 	Post post = new Post();
		 	post.setAuthor(request.getParameter("author"));
		 	post.setTitle(request.getParameter("title"));
		 	post.setBody(request.getParameter("body"));
		 	
		 	PostBean postlist = new PostBean();
		 	List<Post> list = postlist.addPost(post); 
		 	
		 	request.setAttribute("list", list);
		 	
		 
		 	
	        
	        request.getRequestDispatcher("/layout.jsp").forward(request,response);
	        
	    }

}