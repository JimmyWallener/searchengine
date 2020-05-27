package se.gritacademy.search;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import se.gritacademy.search.DbHandler.DBHandler;
import se.gritacademy.search.model.Model;
import se.gritacademy.search.utils.DestructString;






/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ControllerServlet() {

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		

		/*DBHandler handler = new DBHandler();
		try {
			handler.addToDatabase();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}*/
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
		
		
		DBHandler db = new DBHandler();
		
		
		Model.setSearchQ(request.getParameter("search"));
		String searchQuery = request.getParameter("search");
		
		
		DestructString ds = new DestructString();
		
		String[] destructWords = ds.destructureString(searchQuery);
		
		
		for (String destr: destructWords) {
			System.out.println(destr);
		}
		
		
		try {
			db.queryDB(destructWords);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
