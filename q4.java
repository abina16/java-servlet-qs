/**Write a servlet program to print Hello WCC message.**/

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
		 response.setContentType("Text/html");
		 PrintWriter out = response.getWriter();
		 try {
			 out.println("<h1>HELLO WCC</h1>");
		 }
		 finally {
			 out.close();
		 }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
