
public class Battleship
{
	int length;
	String type;
	int status[];
	
	public Battleship(int shipLength)
	{
		length = shipLength;
		
		type = "mini";
		status = new int[length];
		
		/*switch (length)
		{
			case 2:
				type = "mini";
				break;
			case 3:
				type = "scout";
				break;
			case 4:
				type = "destroyer";
				break;
			case 5:
				type = "aircraft carrier";
				break;
		}*/
	}
}
