
public class Treasure
{
	public String name;
	public int xPos;
	public int yPos;
	
	public Treasure(int xPos, int yPos)
	{
		this.name = chooseName();
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public static String chooseName()
	{
		double randomNum = Math.floor(Math.random() * 5);
		String treasureName = "";
		
		switch ((int)randomNum)
		{
		case 0 :
			treasureName = "large wooden chest";
			break;
		case 1 :
			treasureName = "silver pocket watch";
			break;
		case 2 :
			treasureName = "golden chalice";
			break;
		case 3 :
			treasureName = "ham and cheese toastie";
			break;
		case 4 :
			treasureName = "gaming PC";
			break;
		default :
			treasureName = "Excalibur";
			break;
		}
		
		return treasureName;
	}
}
