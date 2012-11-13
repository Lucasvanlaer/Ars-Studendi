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
		String studentFirstName = req.getParameter("studentFirstName");
		String studentLastName = req.getParameter("studentLastName");		
		String StrStudentID = req.getParameter ("studentID");
		//Long studentID = Long.valueOf(StrStudentID);
		String password = req.getParameter("password");
		String[] strCourses = req.getParameterValues("courses");
		List<String> courses = Arrays.asList(strCourses);  
		String emailAdress = req.getParameter("emailAdress");
		
		RegisterController controller = new RegisterController();
		String s = null;
		if(!controller.checkPassword(password)){
			s = "Please enter a password";
		}
		if(!controller.checkUser(studentFirstName)){
			s = s + "Please enter your name";
		}
		if(!controller.checkUser(studentLastName)){
			s = s + "Please enter your name";
		}
		if(!controller.checkEmail(emailAdress)){
			s = s + "Please enter an email";
		}
		if(!controller.checkList(courses)){
			s = s + "Please enter a password";
		}
		//boolean succeeded = controller.makeStudent(studyProgram, studentName, studentID, password, courses, emailAdress);
		boolean succeeded = controller.makeStudent(studyProgram, studentFirstName, studentLastName,password, courses, emailAdress);
		if (succeeded){
			resp.sendRedirect("succesfully registered");
		}
		else{
			resp.sendRedirect(s);
		}
		
			
		}
		
	}
