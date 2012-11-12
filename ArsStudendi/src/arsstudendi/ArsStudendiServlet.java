package arsstudendi;

import DomainModel.Course;
import DomainModel.StudyProgram;
import Controllers.*;
import java.util.*;
import java.io.IOException;
import javax.servlet.http.*;


@SuppressWarnings("serial")
public class ArsStudendiServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String strStudyProgram = req.getParameter("studyProgram");
		Long studyProgram = Long.valueOf(strStudyProgram);	
				//Opletten met mogelijke exceptions
		String studentName = req.getParameter("studentName");
		String StrStudentID = req.getParameter ("studentID");
		Long studentID = Long.valueOf(StrStudentID);
		String password = req.getParameter("password");
		String[] strCourses = req.getParameterValues("courses");
		List<String> courses = Arrays.asList(strCourses);  
		String emailAdress = req.getParameter("emailAdress");
		
		RegisterController controller = new RegisterController();
		
		controller.makeStudent(studyProgram, studentName, studentID, password, courses, emailAdress);

	}
}