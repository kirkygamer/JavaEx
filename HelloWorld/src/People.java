import java.util.ArrayList;
import java.util.Iterator;

public class People
{
	static ArrayList<Person> peopleList = new ArrayList<Person>();
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Person p1 = new Person("Joe",99,"Programmer");
		Person p2 = new Person("Lee",21,"LazyBastard");
		Person p3 = new Person("Fred",34,"Flintstone");
		Person p4 = new Person("Ass",69,"Butt");
		Person p5 = new Person("Morty",14,"AwwJeez");
		
		peopleList.add(p1);
		peopleList.add(p2);
		peopleList.add(p3);
		peopleList.add(p4);
		peopleList.add(p5);		
		
		Iterator personItr = peopleList.iterator();
		
		/*while(personItr.hasNext())
		{
			System.out.println(personItr.next());
		}*/
		
		for (Person p: peopleList)
		{
			System.out.println(p);
		}
		
		System.out.println(nameSearch("Lee"));
		
	} // main
	
	public static Person nameSearch(String pName)
	{
		for (Person person : peopleList)
		{
			if (person.name.equals(pName))
				return person;
		}
		
		Person defaultP = new Person("Error", 404, "Person not found");
		return defaultP;
	}
	
}
