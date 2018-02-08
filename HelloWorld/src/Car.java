
public class Car extends Vehicle
{
	private String model;
	
	public String getModel()
	{
		return model;
	}
	
	public void setModel(String vModel)
	{
		model = vModel;
	}
	
	public Car(int regNum, String manufacturer, int numWheels, String cModel)
	{
		super(regNum, manufacturer, numWheels);
		setType("Car");
		model = cModel;
	}
}
