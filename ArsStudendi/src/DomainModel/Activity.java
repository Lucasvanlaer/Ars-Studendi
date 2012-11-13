package DomainModel;
import java.util.*;

public abstract class Activity {
	private Calendar startTime;
	private Calendar stopTime;
	private long studentID;
	private String name;
	
	public Activity(Calendar startTime, long UserID, String name){
		setStartTime(startTime);
		setStopTime(stopTime);
		setName(name);
		
	}

	public long getStudentID(){
		return studentID;
	}
	
	public void setStudentID(long studentID) {
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
		return name;
	}
	
	public void setName(String newName){
		name = newName;
	}		
}

