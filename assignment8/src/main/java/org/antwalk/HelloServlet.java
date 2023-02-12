package org.antwalk;

import java.io.IOException;
import java.io.PrintWriter;

//import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	float result;
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/Test.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String princ = request.getParameter("princ");
		String rate = request.getParameter("rate");
		String time = request.getParameter("Time");
		
		interest obj = new interest();
		obj.setPrinc(Float.valueOf(princ));
		obj.setRate(Float.valueOf(rate));
		obj.setTime(Float.valueOf(time));
		
		result = obj.SimInt();
		
		request.getSession().setAttribute("result",result);
		request.getRequestDispatcher("output.jsp").forward(request, response);
		PrintWriter out=response.getWriter();
		out.println(result);
	}

}
