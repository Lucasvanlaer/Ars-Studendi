package Controllers;

import java.util.List;
import arsstudendi.*;
import DomainModel.*;
import DomainModel.StudyProgram;

public class RegisterController {

	public RegisterController (){
		
	}
	public boolean makeStudent(Long program, String studentName, long studentID, String password, List<String> StrCourses, String newEmailAdress)
	{
		boolean succeed = false;
		// een boolean terug geven of het emailadres geldig is
	//if( de boolean true is ){
		StudyProgram studyProgram = StudyProgramFinder.Find(program);
		List<Course> courses = null;
		for(String strCourse: StrCourses){
			Long courseID = Long.valueOf(strCourse);
			Course course = CourseFinder.Find(strCourse);
			courses.add(course);	
		}
		
	Student student = new Student(studyProgram,studentName,studentID,password,courses,newEmailAdress);
	succeed = StudentRegistry.addStudent(student);
	return succeed;
	}
	
	public boolean checkpassword(String password)
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
	public boolean checkList(List<Course> courseList){
		if(courseList.size()==0){return false;}else{return true;}
	}
}
