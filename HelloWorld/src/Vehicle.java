
public class Vehicle
{
	public int regNum;
	public String manufacturer;
	public int numWheels;
	public String type;
	
	public int getRegNum()
	{
		return regNum;
	}
	public void setRegNum(int vReg)
	{
		
		regNum = vReg;
	}
	
	public String getManufacturer()
	{
		return manufacturer;
	}
	public void setManufacturer(String vManufacturer)
	{
		manufacturer = vManufacturer;
	}
	
	public int getNumWheels()
	{
		return numWheels;
	}
	public void setNumWheels(int vNumWheels)
	{
		numWheels = vNumWheels;
	}
	
	public String getType()
	{
		return type;
	}
	public void setType(String vType)
	{
		type = vType;
	}
	
	public Vehicle(int vRegNum, String vManufacturer, int vNumWheels)
	{
		regNum = vRegNum;
		manufacturer = vManufacturer;
		numWheels = vNumWheels;
	}
	
}
