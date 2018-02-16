import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class CalDesign
{

	public static void main(String[] args)
	{
	
		//TextField display;
		//Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
		//Button bPlus,bMinus,bMultiply,bDivide,bEquals,bClear;
	
//	public CalDesign()
//	{
		Frame win = new Frame("My Calculator");
		Panel topPanel = new Panel();
		Panel buttonPanel = new Panel();
		GridLayout grid = new GridLayout(4,4);
		buttonPanel.setLayout(grid);
		
		Button b0 = new Button("0");
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		Button b7 = new Button("7");
		Button b8 = new Button("8");
		Button b9 = new Button("9");
		Button bPlus = new Button("+");
		Button bMinus = new Button("-");
		Button bMultiply = new Button("X");
		Button bDivide = new Button("/");
		Button bEquals = new Button("=");
		Button bClear = new Button("C");
		TextField display = new TextField(30);
		
		win.add(topPanel, "North");
		topPanel.add(display);
		display.setText("0");
		win.add(buttonPanel, "Center");
		buttonPanel.add(b7);
		buttonPanel.add(b8);
		buttonPanel.add(b9);
		buttonPanel.add(bPlus);
		buttonPanel.add(b4);
		buttonPanel.add(b5);
		buttonPanel.add(b6);
		buttonPanel.add(bMinus);
		buttonPanel.add(b1);
		buttonPanel.add(b2);
		buttonPanel.add(b3);
		buttonPanel.add(bMultiply);
		buttonPanel.add(bClear);
		buttonPanel.add(b0);
		buttonPanel.add(bEquals);
		buttonPanel.add(bDivide);
		
		WindowEvent w = new WindowEvent();
		Operations o = new Operations(display);
		NumberEvents e = new NumberEvents(display);
		
		win.addWindowListener(w);
		b0.addActionListener(e);
		b1.addActionListener(e);
		b2.addActionListener(e);
		b3.addActionListener(e);
		b4.addActionListener(e);
		b5.addActionListener(e);
		b6.addActionListener(e);
		b7.addActionListener(e);
		b8.addActionListener(e);
		b9.addActionListener(e);
		
		bPlus.addActionListener(o);
		bMinus.addActionListener(o);
		bMultiply.addActionListener(o);
		bDivide.addActionListener(o);
		bEquals.addActionListener(o);
		bClear.addActionListener(o);
		win.addWindowListener(w);
		
		win.setSize(300, 400);
		win.setVisible(true);
		
	}

}
