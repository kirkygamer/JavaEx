import java.util.Scanner;

public class Wizard
{
	static Scanner scanner = new Scanner(System.in);
	static int input = 0;
	static Paint paintC = new Paint("CheapoMax",20,10,19.99);
	static Paint paintA = new Paint("AverageJoes",15,11,17.99);
	static Paint paintD = new Paint("Duluxourous",10,20,25.00);
	
	public static void main(String[] args)
	{
		System.out.println("What area do you need to paint (in square metres)?: ");
		try
		{
			input = Integer.parseInt(scanner.nextLine());
		} catch (Exception exception)
		{
			System.out.print("Please enter a positive integer: " + exception);
		}
		//calculateWastePrice(input);
		calculateWastePrice(input, paintC);
		
		scanner.close();
	}
	
	
	public static void calculateWastePrice(int reqVolume)
	{
		double[] numTins = new double[3];
		numTins[0] = Math.ceil((double)input / paintC.tinCoverage());
		numTins[1] = Math.ceil((double)input / paintA.tinCoverage());
		numTins[2] = Math.ceil((double)input / paintD.tinCoverage());
		
		double[] wastedPaint = new double[3];
		wastedPaint[0] = ((paintC.tinCoverage() * numTins[0]) - (double)input) / paintC.coverage;
		wastedPaint[1] = ((paintA.tinCoverage() * numTins[1]) - (double)input) / paintA.coverage;
		wastedPaint[2] = ((paintD.tinCoverage() * numTins[2]) - (double)input) / paintD.coverage;
		
		System.out.println("The cost of painting " + input + "m^2 is: ");
		System.out.print("£" + (numTins[0]*paintC.price) + " with " + paintC.brand);
		System.out.println(", wasting " + wastedPaint[0] + " litres");
		System.out.print("£" + (numTins[1]*paintA.price) + " with " + paintA.brand);
		System.out.println(", wasting " + wastedPaint[1] + " litres");
		System.out.print("£" + (numTins[2]*paintD.price) + " with " + paintD.brand);
		System.out.println(", wasting " + wastedPaint[2] + " litres");
	}
	
	public static void calculateWastePrice(int reqVolume, Paint paint)
	{
		double numberTins = Math.ceil((double)reqVolume / paint.tinCoverage());
		double wastedPaintAmount = (paint.tinCoverage() * numberTins - (double)reqVolume) / paint.coverage;
		
		System.out.print("\nThe cost of painting " + reqVolume + "m^2 is with " + paint.brand);
		System.out.println(" is " + (numberTins*paint.price));
		System.out.println("This would waste " + wastedPaintAmount + " litres of paint.");
		System.out.printf("This would waste %.2f litres of paint.", wastedPaintAmount);
	}
	
}
