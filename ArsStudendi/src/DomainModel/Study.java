package DomainModel;

public class Study extends ActivityTypeClass {

	private Course course;
	
	public Study(Course course){
		setCourse(course);
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}
