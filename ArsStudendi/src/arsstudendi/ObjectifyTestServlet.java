package arsstudendi;


import DomainModel.Course;
import DomainModel.Student;
import DomainModel.StudyProgram;
import Controllers.*;
import java.util.*;
import java.io.IOException;
import javax.servlet.http.*;


import com.googlecode.objectify.Key;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Query;


@SuppressWarnings("serial")
public class ObjectifyTestServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		List<Course> courseList = new ArrayList<Course>();
		courseList.add(new Course("TestLes", new Long(100)));
		StudyProgram testProgram = new StudyProgram(courseList, "testProgramma", new Long(101));		
		Student student = new Student(testProgram, "John", "Doe", "wachtwoord", courseList, "jd@test.com");
		
		StudentRegistry.getSingletonObject().putStudent(student);
		
		StudentRegistry.getSingletonObject().getStudent("jd@test.com", "wachtwoord");
	}
}