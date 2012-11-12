package DomainModel;

import java.util.Calendar;

public class SpareTime extends Activity {

	private SpareTimeType type;

public SpareTime(Calendar startTime, long UserID, String name, SpareTimeType type)
{
	super(startTime, UserID, name);
	this.type=type;
}
public SpareTimeType getType()
{
	return type;
}

}
