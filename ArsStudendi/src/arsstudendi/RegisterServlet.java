package arsstudendi;

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

			
		String studentFirstName = req.getParameter("studentFirstName");
		String studentLastName = req.getParameter("studentLastName");
		String password = req.getParameter("password");
		String emailAdress = req.getParameter("emailAdress");
		String studyProgram = req.getParameter("studyProgram");	
		//String StrStudentID = req.getParameter ("studentID");
		//Long studentID = Long.valueOf(StrStudentID);
		
		
		ArrayList<String> courses = new ArrayList<String>();
		int i =0;
		String[] courseNames = controller.getCourseNames();
		int length = courseNames.length;
		while(i < length){
			String s = new String();
			s = req.getParameter("" + i);
			if (s != null){
				courses.add(s);
			}
			i++;
		}
		
		controller.makeStudent(studyProgram, studentFirstName,studentLastName , password, courses, emailAdress);
		resp.sendRedirect("/index.html");
		}
		
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String[] courseNames = controller.getCourseNames();
		System.out.println(courseNames);
		req.setAttribute("courseNames", courseNames);
		
		try {
			req.getRequestDispatcher("/register.jsp").forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR DETECTED");
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