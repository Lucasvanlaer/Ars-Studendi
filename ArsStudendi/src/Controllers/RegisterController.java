package Controllers;

import java.util.List;

import DomainModel.*;
import DomainModel.StudyProgram;

public class RegisterController {

	public RegisterController (){
		
	}
	public void makeStudent(StudyProgram studyPorgram, String studentName, long studentID, String password, List<Course> courses, String newEmailAdress)
	{
	Student student = new Student(studyPorgram,studentName,studentID,password,courses,newEmailAdress);
	
	}
}