package arsstudendi;

import DomainModel.Student;
import Controllers.*;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LogInServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException 
	{

		String emailAdress = req.getParameter("emailAdress");
		String password = req.getParameter("password");

		LogController controller = new LogController();

		Student student = controller.logIn(password, emailAdress);

 		boolean s = true;
		if (student == null) 
		{
			s = false;
		}

		resp.sendRedirect("/home.jsp?loggedIn=" + s);

	}
}
