/** Write a JSP program to implement the arithmetic operation. **/

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
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try {
			float n1 = Integer.parseInt(request.getParameter("n1"));
			float n2 = Integer.parseInt(request.getParameter("n2"));
			String op = request.getParameter("op");
			
			if (op.equals("+")) {
				out.println(n1+" + "+n2+" = "+(n1+n2));
			}
			else if (op.equals("-")) {
				out.println(n1+" - "+n2+" = "+(n1-n2));
			}
			else if (op.equals("*")) {
				out.println(n1+" * "+n2+" = "+(n1*n2));
			}
			else if (op.equals("/")) {
				out.println(n1+" / "+n2+" = "+(n1/n2));
			}
			else {
				out.println("Invalid operator");
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
