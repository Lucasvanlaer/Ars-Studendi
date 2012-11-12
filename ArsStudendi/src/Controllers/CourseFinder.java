package Controllers;

import DomainModel.Course;
import com.googlecode.objectify.Key;
import Controllers.Objectifiable;

public class CourseFinder extends Objectifiable{
	
	/**
	 * 
	 */
	public Course getCourse(Key<Course> courseKey){
		return getObjectify().get(courseKey);
	}
	
	public Course getCourse(Long courseID){
		return getObjectify().get(Course.class, courseID);
	}
	
}
