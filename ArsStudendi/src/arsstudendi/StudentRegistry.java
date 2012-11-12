package arsstudendi;


import com.googlecode.objectify.*;
import DomainModel.Student;
//
public class StudentRegistry {

	private static StudentRegistry _singletonObject;
	
	private StudentRegistry(){
	ObjectifyService.register(Student.class);
	}
	
	public static synchronized StudentRegistry getSingletobnObject(){
		if( _singletonObject == null){
			_singletonObject = new StudentRegistry();
		}
		return _singletonObject;
	}
	
	
	
}
