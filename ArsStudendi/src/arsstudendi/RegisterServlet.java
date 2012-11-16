package arsstudendi;

import DomainModel.Course;
import DomainModel.StudyProgram;
import Controllers.*;
import java.util.*;
import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;



@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {
	RegisterController controller = new RegisterController();
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String strStudyProgram = req.getParameter("studyProgram");
		Long studyProgram = Long.valueOf(strStudyProgram);	
				//Opletten met mogelijke exceptions
		String studentFirstName = req.getParameter("studentFirstName");
		String studentLastName = req.getParameter("studentLastName");
		//String StrStudentID = req.getParameter ("studentID");
		//Long studentID = Long.valueOf(StrStudentID);
		String password = req.getParameter("password");
		String[] strCourses = req.getParameterValues("courses");
		List<String> courses = Arrays.asList(strCourses);  
		String emailAdress = req.getParameter("emailAdress");
		controller.makeStudent(studyProgram, studentFirstName,studentLastName , password, courses, emailAdress);
		}
		
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String[] courseNames = controller.getCourseNames();
		System.out.println(courseNames);
		req.setAttribute("courseNames", courseNames);
		
		try {
			req.getRequestDispatcher("/register.jsp").forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
//		String s = null;
				
//		if(!controller.checkPassword(password)){
//			s = "Password is empty";
//			}
//		if(!controller.checkUser(studentFirstName)){
//			s += "User's first name is empty";
//			}
//		if(!controller.checkUser(studentLastName)){
//			s += "User's last name is empty";
//			}
//		if(!controller.checkEmail(emailAdress)){
//			s += "E-mail is empty";
//			}
//		if(!controller.checkList(courses)){
//			s += "Courses are empty";
//			}
//		
//		
//		resp.sendRedirect("/guestbook.jsp?emptyFields=" + s);
		
		//controller.makeStudent(studyProgram, studentName, studentID, password, courses, emailAdress);
		
			
		
		
	}
}