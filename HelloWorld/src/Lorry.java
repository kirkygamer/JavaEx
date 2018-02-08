
public class Lorry extends Vehicle
{
	private int hornVolume;
	
	public int getHornVolume()
	{
		return hornVolume;
	}
	
	public void setHornVolume(int vHornVolume)
	{
		hornVolume = vHornVolume;
	}
	
	public Lorry(int regNum, String manufacturer, int numWheels, int lHornVolume)
	{
		super(regNum, manufacturer, numWheels);
		setType("Lorry");
		hornVolume = lHornVolume;
	}
}
