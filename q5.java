/**Write a servlet program to display course details using HTML to servlet Communication.**/

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Trying extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Trying() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 try {
			 String course = request.getParameter("course");
			 if (course.equals("BCA")) {
				 out.println("Number of years 3 <br>");
				 out.println("Topics covered: Python, java, html");
			 }
			 else if (course.equals("BBA")) {
				 out.println("Number of years 4 <br>");
				 out.println("Topics covered: Cost management, Risk management");
			 }
		 }
		 finally {
			 out.close();
		 }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
