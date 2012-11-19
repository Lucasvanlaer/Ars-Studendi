package arsstudendi;


import com.googlecode.objectify.*;

import Controllers.Objectifiable;
import DomainModel.*;
import Controllers.*;
import arsstudendi.*;
import java.util.*;

public class StudentRegistry extends Objectifiable{

	private static StudentRegistry _singletonObject;
	
	private StudentRegistry(){
	ObjectifyService.register(Student.class);
	}

	/**
	 * Dit is eigenlijk de getInstance() methode
	 * @return
	 */
	public static synchronized StudentRegistry getSingletonObject(){
		if( _singletonObject == null){
			_singletonObject = new StudentRegistry();
		}
		return _singletonObject;
	}
	public boolean putStudent(Student student){
		if(student != null){
		getObjectify().put(student);
		return true;
		}
		else{
			return false;
		}
	}
	
	private StudyProgram makeProgramList(ArrayList<Course> courseL){
	ArrayList<Course> courses = courseL;
	ArrayList<StudyProgram> studyPrograms = new ArrayList<StudyProgram>();
	int length = 6 ;
	int i =1;
	String[] arr = CourseRegistry.getSingletonObject().getCourseNames();
	while (i<length+1){
		ArrayList<Course> courseList = new ArrayList<Course>();
		if(i == 1){
			courseList.add(courses.get(1)); 
			courseList.add(courses.get(3)); 
			courseList.add(courses.get(5)); 
		}
		if(i == 2){
			courseList.add(courses.get(1)); 
			courseList.add(courses.get(2)); 
			courseList.add(courses.get(3)); 
		}
		if(i == 3){
			courseList.add(courses.get(1)); 
			courseList.add(courses.get(3)); 
			courseList.add(courses.get(6)); 
		}
		if(i == 4){
			courseList.add(courses.get(1)); 
			courseList.add(courses.get(5)); 
			courseList.add(courses.get(6)); 
		}
		if(i == 5){
			courseList.add(courses.get(2)); 
			courseList.add(courses.get(3)); 
			courseList.add(courses.get(4)); 
		}
		if(i == 6){
			courseList.add(courses.get(1)); 
			courseList.add(courses.get(4)); 
			courseList.add(courses.get(5)); 
		}
		StudyProgram studyProgram = new StudyProgram(courseList, arr[i], (long) i);
		studyPrograms.add(studyProgram);
		i++;
	}}
	
	/**
	* Vraagt het Studentobject uit de Google Datastore op die 
	* @param inLogEmailAdress Het emailadres waarmee de gebruiker probeert in te loggen. 
	* @param password Het wachtwoord waarme de gebruiker probeert in te loggen.
 	* @return getObjectify().query(Student.class).filter("emailAdress", inLogEmailAdress).filter("password", password).get()
 	* 			null als het object niet wordt gevonden?
 	*/
	public  Student getStudent(String inLogEmailAdress, String password){
		return getObjectify().query(Student.class).filter("emailAdress", inLogEmailAdress).filter("password", password).get() ;//load().type(Student.class)
		}
	
	/**
	 * 
	 */
	public Student getStudent(Key<Student> studentKey){
		return getObjectify().get(studentKey);
	}
	
	public Student getStudent(Long studentID){
		return getObjectify().get(Student.class, studentID);
	}
	
	
}
