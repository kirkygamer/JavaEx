
public class Main
{
	static int numArray[] = null;
	static int numLength = 1;
	static String convertedNumber = null;
	
//	public static void main(String[] args)
//	{
//		System.out.println(digitsToWords(25));
//	}
	
	public static String digitsToWords(int num)
	{
		//System.out.println("digitsToWords: " + num);
		numArray = numToArray(num);
		System.out.println("FUCK: " +arrayToWords(numArray));
		convertedNumber = arrayToWords(numArray);
		
		return convertedNumber;
	}
	
	public static int[] numToArray(int num)
	{
		System.out.println("numToArray: " + num);
		int[] numArray = null;
		int numLengthTest = num;
		int numLengthTest2 = num;
		
		while (numLengthTest / 10 > 1)
		{
			numLength++;
			numLengthTest /= 10;	
		}
		
		numArray = new int[numLength];
		
		for (int i = 0; i < numLength; i++)
		{
			numArray[i] = numLengthTest2 % 10;
			numLengthTest2 /= 10;
		}
		
		return numArray;
	}
	
	public static String arrayToWords(int[] numArray)
	{
		for (int i = numLength - 1; i >= 0; i--)
		{
			if (i == 1)
			{
				i--;
				if (numArray[i] == 0)
					convertedNumber = numToUnit(numArray[i]) + convertedNumber;
				if (numArray[i] == 1)
					convertedNumber = numToTeen(numArray[i]) + convertedNumber;
				if (numArray[i] >= 2)
					convertedNumber = numToTen(numArray[i]) + convertedNumber;
			}	
		}
		return convertedNumber;
	}
	
	public static String numToUnit(int num)
	{
		switch(num)
		{
			case 0:
				return "zero";
			case 1:
				return "one";
			case 2:
				return "two";
			case 3:
				return "three";
			case 4:
				return "four";
			case 5:
				return "five";
			case 6:
				return "six";
			case 7:
				return "seven";
			case 8:
				return "eight";
			case 9:
				return "nine";
		}
		
		return "zero";
	}
	
	public static String numToTeen(int num)
	{
		switch(num)
		{
			case 10:
				return "ten";
			case 11:
				return "eleven";
			case 12:
				return "twelve";
			case 13:
				return "thirteen";
			case 14:
				return "fourteen";
			case 15:
				return "fifteen";
			case 16:
				return "sixteen";
			case 17:
				return "seventeen";
			case 18:
				return "eighteen";
			case 19:
				return "nineteen";
		}
		
		return "ten";
	}
	
	public static String numToTen(int num)
	{
		switch(num)
		{
			case 2:
				return "twenty";
			case 3:
				return "thirty";
			case 4:
				return "forty";
			case 5:
				return "fifty";
			case 6:
				return "sixty";
			case 7:
				return "seventy";
			case 8:
				return "eighty";
			case 9:
				return "ninety";
		}
		
		return "zero";
	}

}
