import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event4 implements ActionListener
{
	TextField textBox;
	
	public Event4(TextField tDisplay)
	{
		textBox = tDisplay;
	}
	
	public void actionPerformed(ActionEvent x)
	{
		double i = Double.parseDouble(textBox.getText());
		if (i != 0)
			textBox.setText(textBox.getText() + "4");
		else
			textBox.setText("4");
	}

}
