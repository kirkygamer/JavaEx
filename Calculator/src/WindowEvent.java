import java.awt.event.WindowAdapter;

public class WindowEvent extends WindowAdapter
{
	public void closing(WindowEvent we)
	{
		System.out.println("Trying to close");
	}
	
	public void closed(WindowEvent we)
	{
		System.exit(0);
	}
}
