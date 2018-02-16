
public class Example
{

	public static void main(String[] args)
	{

		divideByZero();

	}
	
	public static void divideByZero()
	{
		try
		{
			int A;
			A = 4/0;
			System.out.println(A);
		}
		catch (ArithmeticException ex)
		{
			System.out.println("Cannot divide by zero");
		}
	}

}
