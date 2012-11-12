package DomainModel;
//import java.io.IOException;
import java.util.*;
import javax.persistence.*;
import com.googlecode.objectify.Key;

@Entity
public class Student {

	private String studentName;
	@Id private long studentID;
	private String password;
	
	//Set<Key<Course>> courses2;
	private List<Course> courses;
	private List<Milestone> milestoneList;
	
	private List<Activity> oldActivityList;
	private Activity currentActivity;
	private String emailAdress;
	private StudyProgram studyProgram;
	
	public Student(StudyProgram studyProgram, String studentName,  String password, List<Course> courses, String newEmailAdress) {
		this.studentName = studentName;
		this.studyProgram = studyProgram;
		this.password = password;
		this.courses = courses;
		this.emailAdress = newEmailAdress;
		currentActivity = null;
		oldActivityList = null;
		milestoneList = null;
		courses = null;
	}
	
public StudyProgram getStudyProgram() {
		return studyProgram;
	}
	public List<Course> getCourses() {
	return courses;
}

public void setCourses(List<Course> courses) {
	this.courses = courses;
}

	public void setStudyProgram(StudyProgram studyProgram) {
		this.studyProgram = studyProgram;
	}
public String getEmailAdress()
{
	return emailAdress;
}
	public String getUserName(){
		return studentName;
	}
	
	public void setUsername(String newName){
		this.studentName = newName;
	}
	
	public void setPassword(String newPassword){
		this.password = newPassword;
	}
	
	public String getPassword(){
		return password;
	}
	
	public long getUserID(){
		return studentID;
	}
	
	public List<Milestone> getMilestones(){
		return milestoneList;
	}
	
	public void addMilestone (Milestone newMilestone){
		milestoneList.add(newMilestone);
	}
	
	public void removeMilestone (Milestone delMilestone){

		if (milestoneList.contains(delMilestone)){
			milestoneList.remove(delMilestone);
		}
	}

	public boolean startActivity(Activity newActivity){
		
		if (currentActivity == null){
			this.currentActivity = newActivity;
			return true;
		}
		
		return false;
		
	}
	
	public boolean stopActivity(){
		if(currentActivity == null){
			return false;
		}
		
		oldActivityList.add(currentActivity);
		currentActivity = null;
		return true;	
		
	}
	
	public boolean cancelActivity(){
		if(currentActivity == null){
			return false;
		}
		
		currentActivity = null;
		return true;
		
	}
}
