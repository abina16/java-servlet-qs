/**Write a Servlet program to implement HTMLto servlet communication to print benefits of fruit selected.**/

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
			String fruit = request.getParameter("fruit");
			if (fruit.equals("Apple")) {
				out.println("<ol>");
				out.println("<li>Your lung strength.</li>");
				out.println("<li>Weight loss.</li>");
				out.println("<li>Bone health.</li>");
				out.println("</ol>");
			}
			else if (fruit.equals("Orange")) {
				out.println("<ol>");
				out.println("<li>Boosts your immune system.</li>");
				out.println("<li>Protects your cells from damage.</li>");
				out.println("<li>maintain your vision</li>");
				out.println("</ol>");
			}
			else if (fruit.equals("Grapes")) {
				out.println("<ol>");
				out.println("<li>May benefit eye health</li>");
				out.println("<li>Bone health.</li>");
				out.println("<li>May have anticancer effects.</li>");
				out.println("</ol>");
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
