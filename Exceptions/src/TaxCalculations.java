
public class TaxCalculations
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TaxCalculations t = new TaxCalculations();
		try
		{
			float netSalary = t.calculateNetSalary(2000, 15);
			System.out.println("Your net salary is: " + netSalary);
		}
		catch (MyException ex)
		{
			System.out.println("the exception was thrown");
		}
		
		//System.out.println("Your net salary is: " + netSalary);

	}
	
	public float calculateNetSalary(int salary, int absences) throws MyException
	{
		float netSalary = 0f;
		
		if (absences >= 14)
		{
			MyException ex = new MyException();
			throw ex;
		}
		netSalary = salary*20/100 - (salary/30*absences);
		
		return netSalary;
	}

}
