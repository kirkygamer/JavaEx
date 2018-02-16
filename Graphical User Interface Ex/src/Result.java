
public class Result
{
	double value;
	String operator;
	
	public Result(double x)
	{
		value = x;
		operator = "";
	}
	
	public double getResult()
	{
		return value;
	}
	
	public void setResult(double y)
	{
		value = y;
	}
	
	public String getOperator()
	{
		return operator;
	}
	
	public void setOperator(String n)
	{
		operator = n;
	}
}
