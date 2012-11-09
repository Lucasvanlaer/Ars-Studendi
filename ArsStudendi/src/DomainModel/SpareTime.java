package DomainModel;

public class SpareTime extends Activity {

	private SpareTimeType type;

public SpareTime(SpareTimeType type)
{
	this.type = type;
}
public SpareTimeType getType()
{
	return type;
}
}
