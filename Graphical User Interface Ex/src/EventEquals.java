import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEquals implements ActionListener
{
	TextField textBox;
	Result number;
	String operator;
	
	public EventEquals(TextField tDisplay, Result currentValue)
	{
		textBox = tDisplay;
		number = currentValue;
	}
	
	public void actionPerformed(ActionEvent x)
	{
		operator = number.getOperator();
		switch (operator)
		{
			case ("+"):
				number.setResult(number.getResult() + Double.parseDouble(textBox.getText()));
				break;
			case ("-"):
				number.setResult(number.getResult() - Double.parseDouble(textBox.getText()));
				break;
			case ("*"):
				number.setResult(number.getResult() * Double.parseDouble(textBox.getText()));
				break;
			case ("/"):
				number.setResult(number.getResult() / Double.parseDouble(textBox.getText()));
				break;
			default:
				number.setResult(number.getResult() + Double.parseDouble(textBox.getText()));
		}
		number.setOperator("");
		
		textBox.setText(Double.toString(number.getResult()));
		System.out.println("The answer is: " + number.getResult());
	}

}
