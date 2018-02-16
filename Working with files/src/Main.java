import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Main
{
	static ArrayList<Person> personList = new ArrayList<Person>();
	static ArrayList<Person> peopleList = new ArrayList<Person>();
	
	public static void main(String[] args) throws Exception
	{
		addPeople();
		writeToFile(personList);
		File readFile = new File("C:\\Users\\Admin\\Documents\\MyFile.txt");
		readFromFile(readFile);
	}
	
	public static void addPeople()
	{
		Person p1 = new Person("Joe",99,"Programmer");
		Person p2 = new Person("Lee",21,"Lazy");
		Person p3 = new Person("Fred",34,"Flintstone");
		Person p4 = new Person("Sam",69,"Bleugh");
		Person p5 = new Person("Morty",14,"AwwJeez");
		
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
	}
	
	public static void writeToFile(ArrayList<Person> pList)
	{
		BufferedWriter bw = null;
	    try
	    {
	         //Specify the file name and path here
	    	File file = new File("C:\\Users\\Admin\\Documents\\MyFile.txt");
	    	
	    	if (!file.exists())
	    	{
	    		file.createNewFile();
	    	}
	    	
	    	FileWriter fw = new FileWriter(file);
	    	bw = new BufferedWriter(fw);
	    	
	    	Iterator personItr = pList.iterator();
			
			while(personItr.hasNext())
			{
				bw.write(personItr.next().toString());
				bw.write("\r\n");
			}
	    	
	    	System.out.println("File written Successfully");
	    } catch (IOException ioEx)
	    {
	    	ioEx.printStackTrace();
	    }
	    finally
		{ 
		   try
		   {
			   if (bw != null)
				   bw.close();
		   } catch(Exception ex)
		   {
			   System.out.println("Error in closing the BufferedWriter" + ex);
		   }
		}
	}
	
	public static void readFromFile(File file) throws Exception
	{
		BufferedReader br = null;
		
		if (file.exists())
    	{
			StringBuffer contents = new StringBuffer();
		    BufferedReader reader = null;

		    reader = new BufferedReader(new FileReader(file));
		    String text = null;

		    // repeat until all lines is read
		    while ((text = reader.readLine()) != null)
		    {
		      contents.append(text).append(System.getProperty("line.separator"));
		      System.out.println("Text: " + text);
		      textToPerson(text);
		    }
		    reader.close();
		    System.out.println(contents.toString());
    	}
	}
	
	public static void textToPerson(String line)
	{
		String[] properties = line.split("\t");
		
		for (int i = 1; i <= properties.length - 1; i+=2)
		{
			System.out.println("Property:" + properties[i]);
			peopleList.add(new Person("Test",1,"TestOccupation"));
		}
		
		System.out.println(peopleList.indexOf(0));
	}
}
