public class Person
{
	
	public String name;
	public int age;
	public String jobTitle;
	
	public Person(String name, int age, String jobTitle)
	{
		this.age = age;
		this.name = name;
		this.jobTitle = jobTitle;
	}

	
	public String toString()
	{
		return "Name:        " + name +
			 "\nAge:         " + age +
			 "\nJob Title:   " + jobTitle;
	}


}