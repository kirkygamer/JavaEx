import java.util.ArrayList;

public class Garage
{

	static ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	public static void main(String[] args)
	{
		Car car2 = new Car(12345,"Vauxhall",4,"Astra");
		car2.setModel("Astra");
		System.out.println(car2.getModel());
		System.out.println(car2.getType());
		
		Motorcycle bike1 = new Motorcycle(67890,"Harley",2,"Roadhog");
		bike1.setBikeType("Chopper");
		System.out.println(bike1.getBikeType());
		
		Lorry lorry1 = new Lorry(36012,"Mercedes",6,85);
		lorry1.setHornVolume(90);
		System.out.println(lorry1.getHornVolume());
		
		vehicleList.add(car2);
		vehicleList.add(bike1);
		vehicleList.add(lorry1);
		
		createBills();
		removeVehicle(12345);
		
	}
	
	public static void createBills()
	{
		for (Vehicle vehicles: vehicleList)
		{
			int bill = 0;
			System.out.print("For the " + vehicles.type + " with registration: "
							   + vehicles.regNum + "\nYour bill comes to: £");
			bill = vehicles.numWheels * 50;
			System.out.println(bill);
		}
	}
	
	public static void addVehicle()
	{
		// figure out how to do this
	}
	
	public static void removeVehicle(int regNum)
	{
		for (Vehicle vehicles: vehicleList)
		{
			//if ()
			System.out.println(vehicles);
			System.out.println("The " + vehicles.type + " with reg number "
							  + vehicles.regNum + " has been removed from the garage.");
		}
	}
	
	

}
