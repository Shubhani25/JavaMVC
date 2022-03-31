

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TaxController extends HttpServlet {
	
    public TaxController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int i = Integer.parseInt(request.getParameter("t1"));
		int a = Integer.parseInt(request.getParameter("t2"));
		
		mypkg.TaxBean tb = new mypkg.TaxBean();
		tb.setAge(a);
		tb.setIncome(i);
		
		request.setAttribute("taxdata", tb);
		
		String view = "showtax.jsp";
		int t = tb.getTax();
		
		if(t==0) {
			view ="notax.jsp";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
