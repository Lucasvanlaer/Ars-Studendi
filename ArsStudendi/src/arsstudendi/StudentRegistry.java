package arsstudendi;


import com.googlecode.objectify.*;

import Controllers.Objectifiable;
import DomainModel.Student;
import Controllers.*;

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
