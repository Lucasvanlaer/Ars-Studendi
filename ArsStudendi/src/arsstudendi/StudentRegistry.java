package arsstudendi;


import com.googlecode.objectify.*;

import Controllers.Objectifiable;
import DomainModel.Student;

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
	
}
