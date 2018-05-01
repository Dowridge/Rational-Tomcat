
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.io.PrintWriter;

@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Hello() {
        // TODO Auto-generated constructor stub
    }
    

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		 rational r1 = new rational();
		 rational r2 = new rational();
		 rational r3 = new rational();
		 r1.set(Integer.parseInt (request.getParameter("r1n")),Integer.parseInt (request.getParameter("r1d")));
		 r2.set(Integer.parseInt (request.getParameter("r2n")),Integer.parseInt (request.getParameter("r2d")));
		 r3.add(r1, r2);
		 out.print("Answer:= " + r3);

	
	    
		
	}

}
