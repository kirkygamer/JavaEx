import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstTest
{

	@Test
	public void test_add()
	{	
		int a = 0;
		Maths math2 = new Maths();
		a = math2.add(5, 7);
		assertTrue(a==12);
	}
	
	@Test
	public void test_sub()
	{
		int a = 0;
		Maths math3 = new Maths();
		a = math3.sub(3, 3);
		assertEquals(a,0);
	}
	
	public void go()
	{
		System.out.println("hello");
	}
	
	@Before
	public void message()
	{
		System.out.println("A");
	}
	
	@After
	public void message1()
	{
		System.out.println("B");
	}

}
