package arsstudendi;

import DomainModel.Course;
import DomainModel.StudyProgram;
import Controllers.*;
import java.util.*;
import java.io.IOException;
import javax.servlet.http.*;


@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

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
		String s = null;
				
		if(!controller.checkPassword(password)){
			s = "Password is empty";
			}
		if(!controller.checkUser(studentName)){
			s += "Username is empty";
			}
		if(!controller.checkEmail(emailAdress)){
			s += "E-mail is empty";
			}
		if(!controller.checkList(courses)){
			s += "Courses are empty";
			}
		
		
		resp.sendRedirect("/guestbook.jsp?emptyFields=" + s);
		
		controller.makeStudent(studyProgram, studentName, studentID, password, courses, emailAdress);
		
			
		
		
	}
}