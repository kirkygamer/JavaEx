
public class Results
{
	private int phy, che, mat;
	private float total, per;
	public void showResults()
	{
		total = phy + che + mat;
		per = total * 100 / 450;
		System.out.println("Marks:" + total);
		System.out.println("Per:" + per);
	}
	
	public int getPhysics()
	{
		return phy;
	}
	
	public void setPhysics(int a)
	{
		if (a >= 0 && a <= 150)
			phy = a;
		else
			System.out.println("Invalid Physics Marks");
	}
	
	public int getChemistry()
	{
		return che;
	}
	
	public void setChemistry(int a)
	{
		if (a >= 0 && a <= 150)
			che = a;
		else
			System.out.println("Invalid Chemistry Marks");
	}
	
	public int getMaths()
	{
		return mat;
	}
	
	public void setMaths(int a)
	{
		if (a >= 0 && a <= 150)
			mat = a;
		else
			System.out.println("Invalid Maths Marks");
	}
	
	public void calculateResults()
	{
		int numFailed = 0;
		
		if (phy < 60)
			numFailed++;
		if (che < 60)
			numFailed++;
		if (mat < 60)
			numFailed++;
		
		if (numFailed == 0)
			showResults();
		if (numFailed == 1)
			System.out.println("Retake the exam");
		if (numFailed == 2)
			System.out.println("Repeat the course");
		if (numFailed == 3)
			System.out.println("Go home");
	}
	
	
	
}
