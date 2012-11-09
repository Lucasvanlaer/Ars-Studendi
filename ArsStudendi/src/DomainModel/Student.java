package DomainModel;
import java.io.IOException;
import java.util.*;
//
public class Student {

	private String studentName;
	private long studentID;
	private String password;
	private List<Course> courses;
	private List<Milestone> milestoneList;
	private List<Activity> oldActivityList;
	private Activity currentActivity;
	private String emailAdress;
	
	public Student(String studentName, long studentID, String password, List<Course> courses, String newEmailAdress) {
		this.studentName = studentName;
		this.studentID = studentID;
		this.password = password;
		this.courses = courses;
		this.emailAdress = newEmailAdress;
		currentActivity = null;
		oldActivityList = null;
		milestoneList = null;
		courses = null;
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
		
		if (currentActivity = null){
			this.currentActivity = newActivity;
			return true;
		}
		
		return false;
		
	}
	
	public boolean stopActivity(){
		if(currentActivity = null){
			return false;
		}
		
		oldActivityList.add(currentActivity);
		currentActivity = null;
		return true;	
		
	}
	
	public boolean cancelActivity(){
		if(currentActivity =null){
			return false;
		}
		
		currentActivity = null;
		return true;
		
	}
}