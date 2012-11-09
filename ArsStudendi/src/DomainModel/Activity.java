package DomainModel;
import java.io.IOException;
import java.util.*;

public abstract class Activity {
	private Calendar startTime;
	private Calendar stopTime;
	private long UserID;
	
	public Activity(Calendar start, long UserID){
		this.startTime = start;
		stopTime = null;
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
			
}

