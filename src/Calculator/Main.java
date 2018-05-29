package Calculator;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Main {
	
	public static void main(String...args) {
		initializeButtons();
	}
	
	@SuppressWarnings("serial")
	static JFrame body = new JFrame("Calculator") {{
		setLayout(new FlowLayout());
		setSize(300,485);
		add(new JTextField(20));
		add(new JButton("hello"));
		setVisible(true);
	}};
	
	private static void initializeButtons() {
		for(int i = 7; i > 0; i++) {
			body.add(new JButton(new Integer(i).toString()));
			if(i % 3 == 0) i -= 6;
			
		}
	}
}
