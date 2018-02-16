
public class Person
{
	String name;
	String occupation;
	int age;
	
	public Person(String pName, int pAge, String pOccupation)
	{
		name = pName;
		occupation = pOccupation;
		age = pAge;
	}
	
	public String toString()
	{
		return "Name:\t" + name + "\tAge:\t" + age + "\tOccupation:\t" + occupation;
	}
}
