/** Write a java program to implement HTML to servlet communication to display grade calculation. **/

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
			int math = Integer.parseInt(request.getParameter("math")); 
			int sci = Integer.parseInt(request.getParameter("sci")); 
			int soc = Integer.parseInt(request.getParameter("soc")); 
			int eng = Integer.parseInt(request.getParameter("eng")); 
			int lang = Integer.parseInt(request.getParameter("lang")); 
			int total = math+sci+soc+eng+lang;
			int avg = total/5;
			
			out.println("<h1><center> MARK SHEET <center></h1>");
			out.println("<br>Math     : "+math);
			out.println("<br>Science  : "+sci);
			out.println("<br>Social   : "+soc);
			out.println("<br>English  : "+eng);
			out.println("<br>Language : "+lang);
			out.println("<br>");
			out.println("<br>Total    : "+total);
			out.println("<br>Average  : "+avg);
			
			if (avg>=85) {
				out.println("<br><b>Grade : O+</b>");
			}
			else if (avg<=85 && avg >=70) {
				out.println("<br><b>Grade : D</b>");
			}
			else if (avg<=70 && avg>=60) {
				out.println("<br><b>Grade : A</b>");
			}
			else if (avg<=60 && avg>=40) {
				out.println("<br><b>Grade : B</b>");
			}
			else {
				out.println("<br><b>Grade : F</b>");
			}
		}
		finally {
			
		}
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
