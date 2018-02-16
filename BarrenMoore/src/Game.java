import java.util.ArrayList;
import java.util.Scanner;

public class Game
{
	
	static ArrayList<Treasure> treasureList = new ArrayList<Treasure>();
	static Scanner scanner = new Scanner(System.in);
	static int numTreasures = 0;
	static int mapSize = 0;
	static int[] playerPos = {0,0};
	static int[][] mazeGrid;
	
	public static void main(String[] args)
	{
		drawMenu();
		Treasure t1 = new Treasure((int)Math.floor(Math.random() * mapSize),
								   (int)Math.floor(Math.random() * mapSize));
		treasureList.add(t1);
		createTreasure(3);
		drawMaze();
		
		do
		{
			showMap();
			System.out.print("The dial reads: ");
			System.out.printf("%.2f", locateTreasure());
			System.out.println("");
			takeInput();
		} while (locateTreasure() > 0);
		
	}
	
	public static void drawMenu()
	{
		System.out.println("d8888b.  .d8b.  d8888b. d8888b. d88888b d8b   db      .88b  d88.  .d88b.   .d88b.  d8888b. d88888b ");
		System.out.println("88  `8D d8' `8b 88  `8D 88  `8D 88'     888o  88      88'YbdP`88 .8P  Y8. .8P  Y8. 88  `8D 88'     ");
		System.out.println("88oooY' 88ooo88 88oobY' 88oobY' 88ooooo 88V8o 88      88  88  88 88    88 88    88 88oobY' 88ooooo ");
		System.out.println("88~~~b. 88~~~88 88`8b   88`8b   88~~~~~ 88 V8o88      88  88  88 88    88 88    88 88`8b   88~~~~~ ");
		System.out.println("88   8D 88   88 88 `88. 88 `88. 88.     88  V888      88  88  88 `8b  d8' `8b  d8' 88 `88. 88.     ");
		System.out.println("Y8888P' YP   YP 88   YD 88   YD Y88888P VP   V8P      YP  YP  YP  `Y88P'   `Y88P'  88   YD Y88888P \n");
		System.out.println("You awaken to find yourself in a barren moor"
						 + "\nGrey foggy clouds float oppressively close to you,"
						 + "\nreflected in the murky grey water which reaches up your shins."
						 + "\nSome black plants barely poke out of the shallow water."
						 + "\nYou notice a small watch-like device in your left hand." 
						 + "\nIt has hands like a watch, but the hands don't seem to tell time."
						 + "\n\nTry \"north\",\"south\",\"east\",or \"west\"\n");
		
	}
	
	public static void showPlayerPos()
	{
		System.out.println("Player position:   (" + playerPos[0] + ", " + playerPos[1] + ")");
	}
	
	public static void showTreasurePos()
	{
		for (Treasure t: treasureList)
		{
			System.out.println("Treasure position: (" + t.xPos + ", " + t.yPos + ")");
		}
	}
	
	public static void showMap()
	{
		
		for (int row = mapSize-1; row >= 0; row--)
		{
			System.out.print("[");
			for (int column = 0; column < mapSize; column++)
			{
				System.out.print(mazeGrid[column][row]);
				if (column != mapSize-1)
					System.out.print(", ");
			}
			System.out.println("]");
		}
	}
	
//	public static void drawMaze()
//	{	
//		numTreasures = 1;
//		mapSize = 10;
//		mazeGrid = new int[mapSize][mapSize];
//		for (int x = 0; x < mapSize; x++)
//		{
//			for (int y = 0; y < mapSize; y++)
//			{
//				mazeGrid[x][y] = 0;
//			}
//		}
//		
//		for (Treasure t: treasureList)
//		{
//		//Treasure currentTreasure = treasureList.get(0);
//		boolean playerOnTreasure = false;
//		do {
//			playerOnTreasure = false;
//			playerPos[0] = (int)Math.floor(Math.random() * mapSize);
//			playerPos[1] = (int)Math.floor(Math.random() * mapSize);
//			if ((playerPos[0] == t.xPos) && (playerPos[0] == t.xPos))
//				playerOnTreasure = true;	
//		} while (playerOnTreasure);
//		
//		
//		mazeGrid[playerPos[0]][playerPos[1]] = -1;
//		System.out.println("Treasure index: " + treasureList.indexOf(t));
//		mazeGrid[t.xPos][t.yPos] = treasureList.indexOf(t);
//		}
//	}
	
	public static void drawMaze()
	{	
		numTreasures = 1;
		mapSize = 10;
		mazeGrid = new int[mapSize][mapSize];
		for (int x = 0; x < mapSize; x++)
		{
			for (int y = 0; y < mapSize; y++)
			{
				mazeGrid[x][y] = 0;
			}
		}
		

		Treasure currentTreasure = treasureList.get(0);
		boolean playerOnTreasure = false;
		do {
			playerOnTreasure = false;
			playerPos[0] = (int)Math.floor(Math.random() * mapSize);
			playerPos[1] = (int)Math.floor(Math.random() * mapSize);
			if ((playerPos[0] == currentTreasure.xPos) && (playerPos[0] == currentTreasure.xPos))
				playerOnTreasure = true;	
		} while (playerOnTreasure);
		
		
		mazeGrid[playerPos[0]][playerPos[1]] = -1;
		//System.out.println("Treasure index: " + treasureList.indexOf(currentTreasure));
		mazeGrid[currentTreasure.xPos][currentTreasure.yPos] = 1;
		
	}
	
	public static void createTreasure(int numberOfTreasures)
	{
		for (int i = 0; i < numberOfTreasures; i++)
		{
			treasureList.add(new Treasure((int)Math.floor(Math.random() * mapSize),
	   				   					  (int)Math.floor(Math.random() * mapSize)));
		}
	}
	
	public static double locateTreasure()
	{
		Treasure currentTreasure = treasureList.get(0);
		double xDistance = Math.abs((currentTreasure.xPos - playerPos[0])); // try removing abs
		double yDistance = Math.abs((currentTreasure.yPos - playerPos[1])); // probably not needed
		double treasureDistance = Math.hypot(xDistance, yDistance);
		
		return treasureDistance;
	}
	
	public static void takeInput()
	{
		System.out.print(">");
		String playerInput = "";
		playerInput = scanner.nextLine();
		
		switch(playerInput)
		{
			case "north":
				movePlayer("north");
				break;
			case "east":
				movePlayer("east");
				break;
			case "south":
				movePlayer("south");
				break;
			case "west":
				movePlayer("west");
				break;
			case "where am i":
				showPlayerPos();
				break;
			case "cheat":
				showTreasurePos();
				break;
			case "suicide":
				numTreasures = 0;
				System.out.println("You impale yourself on your own sword and die\nGAME OVER");
				System.exit(0);
				break;
			default:
				System.out.println("Not a valid command");
		}
		
	}
	
	public static void movePlayer(String direction)
	{
		int newPos[] = {playerPos[0],playerPos[1]};
		
		switch(direction)
		{
			case "north":
				newPos[1] = playerPos[1] + 1;
				break;
			case "east":
				newPos[0] = playerPos[0] + 1;
				break;
			case "south":
				newPos[1] = playerPos[1] - 1;
				break;
			case "west":
				newPos[0] = playerPos[0] - 1;
				break;
		}
		
		if ((newPos[0] < 0) || (newPos[0] >= mapSize))
			System.out.println("An impassable wall blocks your path");
		else if ((newPos[1] < 0) || (newPos[1] >= mapSize))
			System.out.println("An impassable wall blocks your path");
		else
		{
			// if new position is treasure
			if (mazeGrid[newPos[0]][newPos[1]] > 0)
			{
				numTreasures--;
				int treasureIndex = mazeGrid[newPos[0]][newPos[1]];
				Treasure foundTreasure = treasureList.get(treasureIndex-1);
				System.out.println("HOLY SHIT! You found a " + foundTreasure.name);
			}
			mazeGrid[playerPos[0]][playerPos[1]] = 0;
			mazeGrid[newPos[0]][newPos[1]] = -1;
			
			playerPos[0] = newPos[0];
			playerPos[1] = newPos[1];
			
		}
	}

}
