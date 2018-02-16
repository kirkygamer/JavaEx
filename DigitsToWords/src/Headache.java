
public class Headache
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		calculateLength(25);
	}
	
	public static void calculateLength(int num)
	{
		if (num >= 100)
		{
			//num %= 
		}
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

}
