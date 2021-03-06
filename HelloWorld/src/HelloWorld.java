public class HelloWorld
{

	public static void main(String[] args)
	{
		// Hello World
		System.out.println("Hello World!");
		
		// Assignment
		String MyString = "Hello World 2!";
		System.out.println(MyString);
		
		// Parameters
		printVar("Hello World 3!");
		
		// Return Types
		printRet();
		
		//Parameters/Operators
		System.out.println(addNumbers(1,2));
		
		// Conditionals
		System.out.println(conditionalAdd(3,4,true));
		System.out.println(conditionalAdd(3,4,false));
		
		// Conditionals 2
		System.out.println(conditionalAdd2(3,0,true));
		System.out.println(conditionalAdd2(0,4,false));
		
		// Iteration
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(conditionalAdd2(i,2,false));
		}
		
		// Arrays
		int[] intArray = new int[10];
		intArray[0] = 1;
		intArray[1] = 1;
		intArray[2] = 1;
		intArray[3] = 3;
		intArray[4] = 1;
		intArray[5] = 5;
		intArray[6] = 1;
		intArray[7] = 7;
		intArray[8] = 1;
		intArray[9] = 9;
		
		for (int i = 0; i < 10; i+=2)
		{
			System.out.println(conditionalAdd2(intArray[i],intArray[i+1],false));
		}
		
		//Iteration/Arrays
		for (int i = 0; i < 10; i++)
		{
			System.out.println(intArray[i]);
		}
		
		//Iteration/Arrays 2
		int[] intArray2 = new int[5];
		for (int i = 0; i < 5; i++)
		{
			intArray2[i] = i+1;
			System.out.println(intArray2[i]);
		}
		
		for (int i = 0; i < 5; i++)
		{
			intArray2[i] *= 10;
			System.out.println(intArray2[i]);
		}
		
	}
	
	static public void printVar (String inputString)
	{
		System.out.println(inputString);
	}
	
	static public void printRet()
	{
		System.out.println("Hello World 4!");
	}
	
	static public int addNumbers(int num1, int num2)
	{
		return num1 + num2;
	}
	
	static public int conditionalAdd(int num1, int num2, boolean bool)
	{
		if (bool)
			return num1 + num2;
		
		return num1 * num2;
	}
	
	static public int conditionalAdd2(int num1, int num2, boolean bool)
	{
		if (num1 == 0)
			return num2;
		if (num2 == 0)
			return num1;
		
		if (bool)
			return num1 + num2;
		
		return num1 * num2;
	}

}
