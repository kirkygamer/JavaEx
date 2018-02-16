import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventMinus implements ActionListener
{
	TextField textBox;
	Result number;
	
	public EventMinus(TextField tDisplay, Result currentValue)
	{
		textBox = tDisplay;
		number = currentValue;
	}
	
	public void actionPerformed(ActionEvent x)
	{
		number.setResult(number.getResult() + Double.parseDouble(textBox.getText()));
		number.setOperator("-");
		textBox.setText("0");
	}

}
