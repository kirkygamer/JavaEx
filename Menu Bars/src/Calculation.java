import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculation implements ActionListener
{
	JFrame frame;
	JTextField firstNumField,secondNumField,resultField;
	JButton calcBtn;
	JLabel firstNumLabel,secondNumLabel,emptyLabel,resultLabel;
	
	public Calculation()
	{
		frame = new JFrame();
		firstNumField = new JTextField(10);
		secondNumField = new JTextField(10);
		resultField = new JTextField(10);
		calcBtn = new JButton("Calculate");
		
		firstNumLabel = new JLabel("First Number:");
		secondNumLabel = new JLabel("Second Number:");
		emptyLabel = new JLabel("");
		resultLabel = new JLabel("Result:");
		frame.setLayout(new GridLayout(5,2));
		calcBtn.addActionListener(this);
		
		frame.add(firstNumLabel); frame.add(firstNumField);
		frame.add(secondNumLabel); frame.add(secondNumField);
		frame.add(emptyLabel); frame.add(calcBtn);
		frame.add(resultLabel); frame.add(resultField);
		frame.setSize(400, 400);
		
	}
	
	public void showWindow(String title)
	{
		frame.setTitle(title);
		frame.setVisible(true);
		
		firstNumField.setText("");
		secondNumField.setText("");
		resultField.setText("");
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		double x,y,z;
		x = y = z = 0;
		String text = "";
		try
		{
			x = Double.parseDouble(firstNumField.getText());
			y = Double.parseDouble(secondNumField.getText());
			text = frame.getTitle();
			if (text.equals("Addition"))
				z = x+y;
			else if (text.equals("Subtraction"))
				z = x-y;
			else if (text.equals("Multiplication"))
				z = x*y;
			else if (text.equals("Division"))
				z = x/y;
			
			resultField.setText(Double.toString(z));
		} catch (Exception e)
		{
			System.out.println("Not a valid input");
		}
		
		
	}
}
