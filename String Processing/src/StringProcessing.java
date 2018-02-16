
public class StringProcessing
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String message = "I hate you it was on the news last night";
		//System.out.println(wordCount(message));
		//splitLines(message);
		//splitLinesReverse(message);
		System.out.println(findReplace(message, "as", "AS"));
	}
	
	public void PrintMessage1(String msg)
	{
		for (int i = 0; i < msg.length(); i++)
		{
			System.out.println(msg.substring(i, i+1));
		}
	}
	
	public static int wordCount(String msg)
	{
		int count = 1;
		
		for (int i = 0; i < msg.length(); i++)
			if (msg.substring(i, i+1).equals(" "))
				count++;
		
		return count;
	}
	
	public static void splitLines(String msg)
	{	
		for (int i = 0; i < msg.length(); i++)
		{
			System.out.print(msg.substring(i, i+1));
			if (msg.substring(i, i+1).equals(" "))
				System.out.println("");
		}
		System.out.println("");
	}
	
	public static void splitLinesReverse(String msg)
	{
		String sub = "";
		for (int i = msg.length() - 1; i >= 0; i--)
		{
			if (!msg.substring(i, i+1).equals(" "))
				sub = msg.substring(i, i+1) + sub;
			else
			{
				System.out.println(sub);
				sub = "";
			}
			if (i == 0)
				System.out.println(sub);
		}
	}
	
	public static String findReplace(String msg, String find, String replace)
	{
		String word = "";
		String newMessage = msg;
		for (int i = 0; i < (msg.length()-find.length()); i++)
		{
			word = "";
			for (int j = 0; j < find.length(); j++)
			{
				if (find.substring(j, j+1).equals(msg.substring(i, i+1)))
					word = find.substring(0,j+1);
				
				if (word.equals(find))
					newMessage = newMessage.substring(0,i-find.length()+1)
							   + replace
							   + newMessage.substring(i+1);
			}
		}
		
		return newMessage;
	}

}
