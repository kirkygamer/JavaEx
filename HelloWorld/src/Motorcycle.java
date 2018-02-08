
public class Motorcycle extends Vehicle
{
	private String bikeType;
	
	public String getBikeType()
	{
		return bikeType;
	}
	
	public void setBikeType(String vBikeType)
	{
		bikeType = vBikeType;
	}
	
	public Motorcycle(int regNum, String manufacturer, int numWheels, String mBikeType)
	{
		super(regNum, manufacturer, numWheels);
		setType("Motorcycle");
		bikeType = mBikeType;
	}
}
