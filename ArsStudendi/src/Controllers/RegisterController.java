package Controllers;

import java.util.List;
import arsstudendi.*;
import DomainModel.*;
import DomainModel.StudyProgram;

public class RegisterController {

	public RegisterController (){
		
	}
	public boolean makeStudent(StudyProgram studyPorgram, String studentName, long studentID, String password, List<Course> courses, String newEmailAdress)
	{
		// een boolean terug geven of het emailadres geldig is
	//if( de boolean true is ){
			Student student = new Student(studyPorgram,studentName,studentID,password,courses,newEmailAdress);
	boolean succeed = StudentRegistry.makeStudent(student);
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