package arsstudendi;
import java.util.*;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ArsStudendiServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		Long studyProgram = req.getParameter ("studyProgram");
				// niet zeker of dit ook werkt voor Long en Lijsten
		String studentName = req.getParameter("studentName");
		long studentID = req.getParameter ("studentID");
		String password = req.getParameter("password");
		List<Long> courses = req.getParameter("courses");
		String emailAdress = req.getParameter("emailAdress");
		
	}
}
