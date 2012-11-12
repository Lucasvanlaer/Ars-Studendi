package Controllers;

import java.util.List;
import arsstudendi.*;
import DomainModel.*;
import DomainModel.StudyProgram;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Objectify;

public class RegisterController {

	public RegisterController (){
		
	}
	
	public boolean makeStudent(StudyProgram studyProgram, String studentName, long studentID, String password, List<Course> courses, String newEmailAdress)
	{


	boolean succeed = false;

			Student student = new Student(studyProgram,studentName,studentID,password,courses,newEmailAdress);
	boolean succeed = StudentRegistry.makeStudent(student);
	succeed = true;
	
	
	

	boolean succeed = StudentRegistry.addStudent(student);

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
