import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event5 implements ActionListener
{
	TextField textBox;
	
	public Event5(TextField tDisplay)
	{
		textBox = tDisplay;
	}
	
	public void actionPerformed(ActionEvent x)
	{
		double i = Double.parseDouble(textBox.getText());
		if (i != 0)
			textBox.setText(textBox.getText() + "5");
		else
			textBox.setText("5");
	}

}
