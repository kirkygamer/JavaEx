import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventClear implements ActionListener
{
	TextField textBox;
	Result number;
	
	public EventClear(TextField tDisplay, Result currentValue)
	{
		textBox = tDisplay;
		number = currentValue;
	}
	
	public void actionPerformed(ActionEvent x)
	{
		textBox.setText("0");
		number.setResult(0);
	}

}
