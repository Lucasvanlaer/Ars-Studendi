package arsstudendi;

import Controllers.Objectifiable;
import DomainModel.Course;

import com.googlecode.objectify.ObjectifyService;

public class CourseRegistry extends Objectifiable{

	private static CourseRegistry _singletonObject;
	
	private CourseRegistry(){
	ObjectifyService.register(Course.class);
	}

	/**
	 * Dit is eigenlijk de getInstance() methode
	 * @return
	 */
	public static synchronized CourseRegistry getSingletonObject(){
		if( _singletonObject == null){
			_singletonObject = new CourseRegistry();
		}
		return _singletonObject;
	}
	public boolean putCourse(Course course){
		if(course != null){
		getObjectify().put(course);
		return true;
		}
		else{
			return false;
		}
	}
}
	