import java.util.Scanner;

public class Game
{
	static String gameWord = "";
	static String guessedLetters = "";
	static String guessedWord = "";
	static int livesLeft = 1;
	static Scanner scanner = new Scanner(System.in);
	
	public static void clearScreen(int lines)
	{
		for (int i = 0; i < lines; i++)
			System.out.println("\n");
	}
	
	public static void drawMenu()
	{
		clearScreen(8);
		System.out.println("| |");
		System.out.println("| |__   __ _ _ __   __ _ _ __ ___   __ _ _ __");
		System.out.println("| '_ \\ / _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\");
		System.out.println("| | | | (_| | | | | (_| | | | | | | (_| | | | |"); 
		System.out.println("|_| |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|");
		System.out.println("                    __/ |");
		System.out.println("                   |___/");
		System.out.println("Welcome to Hangman - Please select a difficulty");
		System.out.println("1 - Easy | 2 - Easy | 3 - Easy");
	}
		
	public static int chooseDifficulty()
	{
		boolean badInput = true;
		int input = 0;
		
		do
		{
			drawMenu();
			try
			{
				input = Integer.parseInt(scanner.nextLine());
				badInput = false;
				if (input != 1)
					badInput = true;
			} catch (Exception difficultyException)
			{
				System.out.println("Could not read input: " + difficultyException);
			}
		} while (badInput);
		
		System.out.println("Difficulty selected: " + input);
		return input;
	}
	
	public static String chooseWord(int difficultyLevel)
	{
		
		return "hangman";
	}
	
	public static void drawGameStep()
	{
		
		clearScreen(8);
		
		// Current Word
		System.out.print("Current word: ");
		String [] guessedLetterArray = guessedWord.split("");
		for (String guessedLetter: guessedLetterArray)
			System.out.print(guessedLetter + " ");
		
		// Guessed Letters
		System.out.print("\nGuessed: ");
		if (guessedLetters != "")
		{
			String[] wrongLetterArray = guessedLetters.split("");
			for (String wrongLetter: wrongLetterArray)
			{
				System.out.print(wrongLetter);
				if (guessedLetters.length() > 1)
					System.out.print(", ");
			}
		}
		else
			System.out.println("[no wrong guesses yet!]");
		
		System.out.println("\nLives left: " + livesLeft);
		drawHangman();
	}
	
	public static void drawHangman()
	{
		int wrongGuesses = 10 - livesLeft;
		
		switch (wrongGuesses)
		{
			case 1 :
				System.out.println("\n    ");
				System.out.println("    ");
				System.out.println("    ");
				System.out.println("    ");
				System.out.println("    ");
				System.out.println("______\n\n");
				break;
			case 2 :
				System.out.println("\n    |");
				System.out.println("    |");
				System.out.println("    |");
				System.out.println("    |");
				System.out.println("    |");
				System.out.println("____|__\n\n");
				break;
			case 3 :
				System.out.println("\n    |");
				System.out.println("    |");
				System.out.println("    |");
				System.out.println("    |");
				System.out.println("    |");
				System.out.println("___/|__\n\n");
				break;
			case 4 :
				System.out.println("  -------------");
				System.out.println("    |");
				System.out.println("    |");
				System.out.println("    |");
				System.out.println("    |");
				System.out.println("    |");
				System.out.println("___/|__\n\n");
				break;
			case 5 :
				System.out.println("  -------------");
				System.out.println("    |      |");
				System.out.println("    |");
				System.out.println("    |");
				System.out.println("    |");
				System.out.println("    |");
				System.out.println("___/|__\n\n");
				break;
			case 6 :
				System.out.println("  -------------");
				System.out.println("    |      |");
				System.out.println("    |      O");
				System.out.println("    |");
				System.out.println("    |");
				System.out.println("    |");
				System.out.println("___/|__\n\n");
				break;
			case 7 :
				System.out.println("  -------------");
				System.out.println("    |      |");
				System.out.println("    |      O");
				System.out.println("    |      |");
				System.out.println("    |      |");
				System.out.println("    |");
				System.out.println("___/|__\n\n");
				break;
			case 8 :
				System.out.println("  -------------");
				System.out.println("    |      |");
				System.out.println("    |      O");
				System.out.println("    |     /|\\");
				System.out.println("    |      |");
				System.out.println("    |");
				System.out.println("___/|__\n\n");
				break;
			case 9 :
				System.out.println("  -------------");
				System.out.println("    |      |");
				System.out.println("    |      O");
				System.out.println("    |     /|\\");
				System.out.println("    |      |");
				System.out.println("    |     / ");
				System.out.println("___/|__\n\n");
				break;
			case 10 :
				System.out.println("  -------------");
				System.out.println("    |      |");
				System.out.println("    |      O");
				System.out.println("    |     /|\\");
				System.out.println("    |      |");
				System.out.println("    |     / \\");
				System.out.println("___/|__\n\n");
				break;
			default :
				clearScreen(4);
				break;
		}
	}
	
	public static void playGame()
	{
		guessedLetters = "";
		guessedWord = "";
		livesLeft = 10;
		for (int i = 0; i < gameWord.length(); i++)
			guessedWord += "_"; 
		
		do
		{
			drawGameStep();
			makeGuess();
		} while ((!guessedWord.equals(gameWord)) && (livesLeft >= 1));
		
		drawGameStep();
		if (guessedWord.equals(gameWord))
			System.out.println("Congrats, you won!");
		if (livesLeft <= 0)
			System.out.print("Sorry, you lost. The correct answer was: " + gameWord);
	}
	
	public static void makeGuess()
	{
		boolean badInput = true;
		boolean correctGuess = false;
		String guessInput = "";
		
		System.out.print("Enter a letter to guess: ");

		guessInput = scanner.nextLine();
		badInput = false;
		if (guessInput.length() > 1)
			badInput = true;
		if (guessedLetters.contains(guessInput))
		{
			badInput = true;
			System.out.println("You already guessed that letter");
		}

		if (gameWord.contains(guessInput))
		{
			correctGuess = true;
			String[] guessedWordArray = guessedWord.split("");
			String[] gameWordArray = gameWord.split("");
			for (int i = 0; i < gameWord.length(); i++)
			{
				if (gameWordArray[i].equals(guessInput))
					guessedWordArray[i] = guessInput;
				System.out.println("New Guessed Word[" + i + "]: " + guessedWordArray[i]);
			}
			System.out.println("You guessed a correct letter");
			
			String newGuessedWord = "";
			for (String newLetter: guessedWordArray)
				newGuessedWord += newLetter;
			guessedWord = newGuessedWord;
		}
		if ((!correctGuess) && (!badInput))
		{
			guessedLetters += guessInput;
			livesLeft--;
		}
				
	}
	
	
	public static String scanLine()
	{
		System.out.println("");
		//Scanner scanner = new Scanner(System.in);
		String valueRead = "";
		try {
			
			valueRead = scanner.next();
			System.out.println("###### " + valueRead);
		} catch (Exception difficultyException)
		{
			System.out.println("Could not read input");
			System.out.println(difficultyException);
//		} finally {
//			scanner.close();
//		}
		}
		return valueRead;
	}
	
	public static void main(String[] args)
	{		
		int difficultyLevel = chooseDifficulty();
		gameWord = chooseWord(difficultyLevel);
		playGame();
		scanner.close();
	}

}
