import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

import java.awt.FlowLayout;

public class Windows
{
	static double result = 0;
	//static double currentValue = 0;
	static Result currentValue = new Result(0);
	
	public static void main(String[] args)
	{
		Frame win = new Frame("My Calculator");
		Panel displayPanel = new Panel();
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
		TextField tDisplay = new TextField(30);

		Event0 e0 = new Event0(tDisplay);
		Event1 e1 = new Event1(tDisplay);
		Event2 e2 = new Event2(tDisplay);
		Event3 e3 = new Event3(tDisplay);
		Event4 e4 = new Event4(tDisplay);
		Event5 e5 = new Event5(tDisplay);
		Event6 e6 = new Event6(tDisplay);
		Event7 e7 = new Event7(tDisplay);
		Event8 e8 = new Event8(tDisplay);
		Event9 e9 = new Event9(tDisplay);
		EventClear eClear = new EventClear(tDisplay, currentValue);
		EventPlus ePlus = new EventPlus(tDisplay, currentValue);
		EventMinus eMinus = new EventMinus(tDisplay, currentValue);
		EventMultiply eMultiply = new EventMultiply(tDisplay, currentValue);
		EventDivide eDivide = new EventDivide(tDisplay, currentValue);
		EventEquals eEquals = new EventEquals(tDisplay, currentValue);

		win.add(displayPanel, "North");
		displayPanel.add(tDisplay);
		tDisplay.setText("0");
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
		
		b0.addActionListener(e0);
		b1.addActionListener(e1);
		b2.addActionListener(e2);
		b3.addActionListener(e3);
		b4.addActionListener(e4);
		b5.addActionListener(e5);
		b6.addActionListener(e6);
		b7.addActionListener(e7);
		b8.addActionListener(e8);
		b9.addActionListener(e9);
		bClear.addActionListener(eClear);
		bPlus.addActionListener(ePlus);
		bMinus.addActionListener(eMinus);
		bMultiply.addActionListener(eMultiply);
		bDivide.addActionListener(eDivide);
		bEquals.addActionListener(eEquals);
		
		win.setSize(300, 400);
		win.setVisible(true);

	}

}
