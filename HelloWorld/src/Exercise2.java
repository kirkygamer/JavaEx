
public class Exercise2
{

	public static void main(String[] args)
	{
		// Blackjack
		System.out.println(blackJack(18,21));
		System.out.println(blackJack(20,18));
		System.out.println(blackJack(22,22));
		
		// Unique Sum
		System.out.println(uniqueSum(1,2,3));
		System.out.println(uniqueSum(3,3,3));
		System.out.println(uniqueSum(1,1,2));
		
		// Too Hot
		System.out.println(tooHot(80,true));
		System.out.println(tooHot(95,true));
		System.out.println(tooHot(95,false));

	}
	
	public static int blackJack(int num1, int num2)
	{
		if ((num1 > num2) && (num1 <= 22))
				return num1;
		if ((num1 < num2) && (num1 <= 22))
				return num2;
		
		return 0;
	}
	
	public static int uniqueSum(int num1, int num2, int num3)
	{
		int sum = 0;
		if (num2 != num1)
			sum = num1 + num2;
		if ((num3 != num1) && (num3 != num2))
			sum += num3;
		
		return sum;
	}
	
	public static boolean tooHot(int temperature, boolean isSummer)
	{
		if (!isSummer)
		{
			if (temperature >= 60 && temperature <= 90)
				return true;
		}
		else
		{
			if (temperature >= 60 && temperature <= 100)
				return true;
		}
		
		return false;
	}

}
