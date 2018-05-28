package Calculator;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.FlowLayout;

public class Main {
	
	public static void main(String...args) {
		initializeCalculator();
	}
	
	@SuppressWarnings("serial")
	static JFrame body = new JFrame("Calculator") {{
		setLayout(new FlowLayout());
		setSize(300,485);
		add(new JTextField(10));
		setVisible(true);
	}};
	
	private static void initializeCalculator() {
		
	}
}
