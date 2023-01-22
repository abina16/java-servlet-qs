/**Write a servlet program to display server information.**/
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
			 out.println("<h1>Servlet port: </h1>"+request.getServerPort());
			 out.println("<h1>Remote address: </h1>"+request.getRemoteAddr());
			 out.println("<h1>Protocol: </h1>"+request.getProtocol());
			 out.println("<h1>Remote host: </h1>"+request.getRemoteHost());
			 out.println("<h1>Servlet date as: </h1>"+request.getContextPath());
		 }
		 finally {
			 out.close();
		 }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
