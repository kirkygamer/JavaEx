import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operations implements ActionListener
{
	TextField tf;
	//double prevNum[];
	double prevNum;
	String opt; // could be array later to do more operations
	
	public Operations(TextField in)
	{
		tf = in;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		Button btn = (Button)ae.getSource();
		String label = btn.getLabel();
		if (label.equals("C"))
			tf.setText("");
		else if (label.equals("="))
		{
			double a,b = 0;
			a = Double.parseDouble(tf.getText());
			if (opt.equals("+"))
				b = prevNum + a;
			if (opt.equals("-"))
				b = prevNum - a;
			if (opt.equals("X"))
				b = prevNum * a;
			if (opt.equals("/"))
				b = prevNum / a;
			tf.setText(Double.toString(b));
		}
		else
		{
			if (!tf.getText().toString().equals(""))
				prevNum = Double.parseDouble(tf.getText());
			opt = label;
			tf.setText("");
		}
		
	}
}
