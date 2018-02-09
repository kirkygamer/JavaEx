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
		calculateWastePrice(input);
		
		scanner.close();
	}
	
	public static void calculateWaste(int reqVolume)
	{
		
	}
	
	public static void calculateWastePrice(int reqVolume)
	{
		double[] numTins = new double[3];
		numTins[0] = Math.ceil((double)input / tinCoverage(paintC.volume, paintC.coverage));
		numTins[1] = Math.ceil((double)input / tinCoverage(paintA.volume, paintA.coverage));
		numTins[2] = Math.ceil((double)input / tinCoverage(paintD.volume, paintD.coverage));
		
		System.out.println("The cost of painting " + input + "m^2 is: ");
		System.out.println("£" + (numTins[0]*paintC.price) + " with " + paintC.brand);
		System.out.println("£" + (numTins[1]*paintA.price) + " with " + paintA.brand);
		System.out.println("£" + (numTins[2]*paintD.price) + " with " + paintD.brand);
		
		double[] wastedPaint = new double[3];
		wastedPaint[0] = (tinCoverage(paintC.coverage, paintC.coverage) * numTins[0]) - (double)input;
		wastedPaint[0] /= paintC.coverage;
		
		System.out.println("calc: " + wastedPaint[0]);
		wastedPaint[1] = Math.ceil((double)input / tinCoverage(paintA.volume, paintA.coverage));
		System.out.println("calc: " + (input / paintA.coverage));
		wastedPaint[1] -= (input / paintA.coverage);
		wastedPaint[2] = Math.ceil((double)input / tinCoverage(paintD.volume, paintD.coverage));
		System.out.println("calc: " + (input / paintD.coverage));
		wastedPaint[2] -= (input / paintD.coverage);
		
		System.out.println("wasted: " + wastedPaint[0] + ", " + wastedPaint[1] + ", " + wastedPaint[2]);
		
		
	}
	
	public static int tinCoverage(int tinVolume, int tinCoverage)
	{
		int coverage = tinVolume * tinCoverage;
		
		return coverage;
	}
	
	
}
