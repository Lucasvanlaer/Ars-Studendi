package Controllers;

import java.util.*;
import arsstudendi.*;
import DomainModel.*;
import DomainModel.StudyProgram;

public class RegisterController {

	public RegisterController (){
		
	}
	public boolean makeStudent(Long program, String studentFirstName, String studentLastName, String password, List<String> StrCourses, String newEmailAdress)
	{
		boolean succeed = false;
		Long studyP = Long.valueOf(program);
		// een boolean terug geven of het emailadres geldig is
		//Tijdelijk wegens niet static
		StudyProgram studyProgram = StudyProgramRegistry.getSingletonObject().getStudyProgram(studyP);
		List<Course> courses = new ArrayList<Course>();
		//Tijdelijk wegens niet static
		for(String strCourse: StrCourses){
			Long courseID = Long.valueOf(strCourse);
//			Course course = CourseRegistry.getSingletonObject().getCourse(courseID);
//			courses.add(course);	
		}
		
	Student student = new Student(studyProgram, studentFirstName, studentLastName, password, courses, newEmailAdress);
	
	succeed = StudentRegistry.getSingletonObject().putStudent(student);

	return succeed;
	}
	
	public boolean checkPassword(String password)
	{
		if(password==null){return false;}else{return true;}
	}
	public boolean checkUser(String userName){
		if(userName==null){
			return false;
			}else{
				return true;
				}
	}
	public boolean checkEmail(String email)
	{
		if(email==null){return false;}else{return true;}
	}
	public boolean checkList(List<String> courseList){
		List<Course> courses = new ArrayList<Course>();
		for(String strCourse: courseList){
			Long courseID = Long.valueOf(strCourse);
//			Course course = CourseRegistry.getSingletonObject().getCourse(courseID);
//			courses.add(course);	
		}
		if(courses.size()==0){return false;}else{return true;}
	}
	
	public String[] getCourseNames(){
		return CourseRegistry.getSingletonObject().getCourseNames();
	}
}
