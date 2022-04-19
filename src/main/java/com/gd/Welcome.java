package com.gd;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class  Welcome extends GenericServlet
{
 
	private static final long serialVersionUID = 1L;
	int count;

	public void init()
	{
		System.out.println("Init Method Called");
	}
	
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String s1=req.getParameter("N");
		String age=req.getParameter("A");
		out.println("Welcome : "+s1+"<BR>");
		out.println("Your age is  : "+age+"<BR>");
		++count;
		out.println("<body style='text-align: center;font-family: cursive;font-size: xx-large;'>");
		out.println("You are the  "+count+" visitor<br><br>");
		out.println("<A href='index.html'> Click Here to Change </A><br>");
		out.print(String.format("<a href=\"%s/index.html\">Alternate Link</a>", getServletContext().getContextPath()));
		out.println("</body>");
	}
}

