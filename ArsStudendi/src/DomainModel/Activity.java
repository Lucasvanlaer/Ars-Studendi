package DomainModel;
import java.io.IOException;
import java.util.*;

public abstract class Activity {
	private Calendar startTime;
	private Calendar stopTime;
	private long UserID;
	private String name;
	
	public Activity(Calendar startTime, long UserID, String name){
		this.startTime = startTime;
		stopTime = null;
		this.name = name;
	}

	public long getUserID(){
		return UserID;
	}
	
	public Calendar getStartTime(){
		return startTime;
	}
	
	public Calendar getStopTime(){
		return stopTime;
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

