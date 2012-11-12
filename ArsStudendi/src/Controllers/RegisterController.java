package Controllers;

import java.util.*;
import arsstudendi.*;
import DomainModel.*;
import DomainModel.StudyProgram;

public class RegisterController {

	public RegisterController (){
		
	}
	public boolean makeStudent(Long program, String studentName, long studentID, String password, List<String> StrCourses, String newEmailAdress)
	{
		boolean succeed = false;
		Long studyP = Long.valueOf(program);
		// een boolean terug geven of het emailadres geldig is
		StudyProgramFinder studyProgramFinder = new StudyProgramFinder();
		//Tijdelijk wegens niet static
		StudyProgram studyProgram = studyProgramFinder.getStudyProgram(studyP);
		List<Course> courses = new ArrayList<Course>();
		CourseFinder courseFinder = new CourseFinder();
		//Tijdelijk wegens niet static
		for(String strCourse: StrCourses){
			Long courseID = Long.valueOf(strCourse);
			Course course = courseFinder.getCourse(courseID);
			courses.add(course);	
		}
		
	Student student = new Student(studyProgram, studentName, password, courses, newEmailAdress);
	
	succeed = StudentRegistry.getSingletonObject().putStudent(student);

	return succeed;
	}
	
	public boolean checkPassword(String password)
	{
		if(password==null){return false;}else{return true;}
	}
	public boolean checkUser(String userName){
		if(userName==null){return false;}else{return true;}
	}
	public boolean checkEmail(String email)
	{
		if(email==null){return false;}else{return true;}
	}
	public boolean checkList(List<String> courseList){
		List<Course> courses = new ArrayList<Course>();
		CourseFinder courseFinder = new CourseFinder();
		//Tijdelijk wegens niet static
		for(String strCourse: courseList){
			Long courseID = Long.valueOf(strCourse);
			Course course = courseFinder.getCourse(courseID);
			courses.add(course);	
		}
		if(courses.size()==0){return false;}else{return true;}
	}
}
