package binConverter;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BinaryCalculation implements ActionListener
{
	//JFrame frame;
	JTextField firstNumField,secondNumField,firstBinField,secondBinField,resultField;
	JButton calcBtn, calcBtn2;
	JLabel firstNumLabel,secondNumLabel,emptyLabel,resultLabel;
	
	
	
	public BinaryCalculation()
	{
		JFrame frame = new JFrame("Binary Calculator");
		firstNumField = new JTextField(10);
		secondNumField = new JTextField(10);
		firstBinField = new JTextField(10);
		secondBinField = new JTextField(10);
		resultField = new JTextField(10);
		calcBtn = new JButton("B2D");
		calcBtn2 = new JButton("D2B");
		
		emptyLabel = new JLabel("");
		resultLabel = new JLabel("B2D");
		emptyLabel = new JLabel("");
		frame.setLayout(new GridLayout(3,2));
		calcBtn.addActionListener(this);
		calcBtn2.addActionListener(this);
		
		frame.add(firstNumField); frame.add(firstBinField);
		frame.add(calcBtn); frame.add(calcBtn2);
		frame.add(secondNumField); frame.add(secondBinField);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		int x,y;
		x = y = 0;
		double z = 0;
		String binaryText = "";
		JButton currentButton = (JButton)ae.getSource();
		
		try
		{
			System.out.println(currentButton.getText());
			
			if (currentButton.getText().equals("B2D"))
			{
				binaryText = firstNumField.getText();
				String[] binaryTextArray = binaryText.split("");
				for (int i = 0; i < binaryTextArray.length; i++)
				{
					x = binaryTextArray.length - 1 - i;
					y += Integer.parseInt(binaryTextArray[i]) * Math.pow(2, x);
				}
				secondNumField.setText(Integer.toString(y));
			}
			
			if (currentButton.getText().equals("D2B"))
			{
				System.out.println("Y:" + y);
				x = Integer.parseInt(firstBinField.getText());
				while (x > 0)
				{
					binaryText = (x % 2) + binaryText;
					System.out.println("binary:" + binaryText);
					x /= 2;
				}
				secondBinField.setText(binaryText);
				
			}
		} catch (Exception e)
		{
			System.out.println("Not a valid input");
		}
	}
}
