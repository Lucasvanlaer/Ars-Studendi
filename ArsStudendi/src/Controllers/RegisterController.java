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
		boolean succeed = false;
		// een boolean terug geven of het emailadres geldig is
	    //if( de boolean true is ){
			Student student = new Student(studyPorgram,studentName,studentID,password,courses,newEmailAdress);
<<<<<<< HEAD
	succeed = true;
	
	
	
=======
	boolean succeed = StudentRegistry.addStudent(student);
>>>>>>> branch 'master' of https://github.com/Lucasvanlaer/Ars-Studendi.git
	return succeed;
	}
	
	public boolean checkpassword(String password)
	{
		if(password==null)
		{
			return false;
			}
		else{
			return true;
			}
	}
	public boolean checkUser(String userName){
		if(userName==null){
			return false;
			}
		else{
			return true;
			}
	}
	public boolean checkEmail(String email)
	{
		if(email==null){
			return false;
			}
		else{
			return true;}
	}
	public boolean checkList(List<Course> courseList){
		if(courseList.size()==0){
			return false;
			}
		else{
			return true;
			}
	}
}
