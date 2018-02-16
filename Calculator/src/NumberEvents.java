import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberEvents implements ActionListener
{
	TextField tf;
	
	public NumberEvents(TextField in)
	{
		tf = in;
	}

	public void actionPerformed(ActionEvent ae)
	{
		Button btn = (Button)ae.getSource();
		if (tf.getText().equals("0"))
			tf.setText(btn.getLabel());
		else
			tf.setText(tf.getText() + btn.getLabel());
	}
}
