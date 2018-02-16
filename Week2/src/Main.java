public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Results peter = new Results();
		peter.setPhysics(750);
		peter.setChemistry(10000000);
		peter.setMaths(-9);
		
		peter.setPhysics(75);
		peter.setChemistry(75);
		peter.setMaths(75);
		
		System.out.println(peter.getPhysics());
		System.out.println(peter.getChemistry());
		System.out.println(peter.getMaths());
		
		peter.calculateResults();
		
	}

}
