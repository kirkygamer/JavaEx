import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class WindowsXP implements ActionListener
{
	JMenuItem addition,subtraction,multiplication,division;
	Calculation calc;
	
	public WindowsXP()
	{
		JFrame win = new JFrame("Windows-XP");
		JMenuBar menuBar= new JMenuBar();
		JMenu menu1 = new JMenu("Maths-1");
		JMenu menu2 = new JMenu("Maths-2");
		addition = new JMenuItem("Addition");
		subtraction = new JMenuItem("Subtraction");
		multiplication = new JMenuItem("Multiplication");
		division = new JMenuItem("Division");
		
		addition.addActionListener(this);
		subtraction.addActionListener(this);
		multiplication.addActionListener(this);
		division.addActionListener(this);
		
		menu1.add(addition);
		menu1.add(subtraction);
		menu2.add(multiplication);
		menu2.add(division);
		menuBar.add(menu1);
		menuBar.add(menu2);
		win.setJMenuBar(menuBar);
		win.setSize(400,400);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc = new Calculation();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		JMenuItem menuItem = (JMenuItem)ae.getSource();
		
		if (menuItem == addition)
			calc.showWindow("Addition");
		else if (menuItem == subtraction)
			calc.showWindow("subtraction");
		else if (menuItem == multiplication)
			calc.showWindow("Multiplication");
		else if (menuItem == division)
			calc.showWindow("Division");
	}
}
