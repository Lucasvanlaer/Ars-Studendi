package DomainModel;

public class Study extends ActivityType {

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
