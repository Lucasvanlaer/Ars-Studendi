package DomainModel;

import java.util.*;
import activityTypePackage.ActivityType;

public class Activity {
	private Calendar startTime;
	private Calendar stopTime;
	private Long studentID;
	private String activityName;
	private ActivityType activityType;
	
	public Activity(Calendar startTime, Long studentID, String activityName){
		setStartTime(startTime);
		setStudentID(studentID);
		setName(activityName);
		
	}

	public Long getStudentID(){
		return studentID;
	}
	
	public void setStudentID(Long studentID) {
		this.studentID = studentID;
	}

	public Calendar getStartTime(){
		return startTime;
	}
	
	public void setStartTime(Calendar startTime) {
		this.startTime = startTime;
	}

	public Calendar getStopTime(){
		return stopTime;
	}
	
	public void setStopTime(Calendar stopTime) {
		this.stopTime = stopTime;
	}

	public long getTimePassed(){
		if (stopTime == null){
			Calendar now = Calendar.getInstance();
			return now.getTimeInMillis()-startTime.getTimeInMillis();
		}
		return stopTime.getTimeInMillis()-startTime.getTimeInMillis();				
	}
	
	
	public String getName(){
		return activityName;
	}
	
	public void setName(String newName){
		activityName = newName;
	}	
	public void setActivityType(ActivityType activityType){
		this.activityType= activityType;
	}
	public ActivityType getActivityType(){
		return activityType;
	}
}

