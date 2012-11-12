package Controllers;

import com.googlecode.objectify.*;
import DomainModel.*;

public class StudentFinder {
	
	/**
	 * 
	 * @return
	 */
	public Objectify getObjectify(){
		Objectify ofy = ObjectifyService.begin();
		return ofy;
	}
	
	/**
	* Vraagt het Studentobject uit de Google Datastore op die 
	* @param inLogEmailAdress Het emailadres waarmee de gebruiker probeert in te loggen. 
	* @param password Het wachtwoord waarme de gebruiker probeert in te loggen.
 	* @return getObjectify().query(Student.class).filter("emailAdress", inLogEmailAdress).filter("password", password).get()
 	* 			null als het object niet wordt gevonden?
 	*/
	public Student getStudent(String inLogEmailAdress, String password){
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
