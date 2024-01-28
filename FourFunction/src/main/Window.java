package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Window extends JFrame {
	
	Main main;
	
	//Variables
	JPanel displayPanel = new JPanel();
	JLabel displayText = new JLabel();
	JPanel buttonPanel = new JPanel();
	
	JButton[] numberButtons = new JButton[10];
	
	JButton decimalButton = new JButton();
	JButton negativeButton = new JButton();
	JButton exponentButton = new JButton();
	
	JButton equalsButton = new JButton();
	JButton addButton = new JButton();
	JButton subtractButton = new JButton();
	JButton multiplyButton = new JButton();
	JButton divideButton = new JButton();

	JButton clearEntryButton = new JButton();
	JButton allClearButton = new JButton();
	
	//Constructors
	public Window(Main main) {
		
		this.main = main;
		
		//Window
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(400, 480);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		
		//Display Panel
		this.add(displayPanel);
		displayPanel.setBounds(10, 10, 365, 80);
		displayPanel.setLayout(new BorderLayout());
		displayPanel.setBackground(Color.CYAN);
		
		//Display Label
		displayPanel.add(displayText);
		displayText.setHorizontalAlignment(JLabel.RIGHT);
		displayText.setVerticalAlignment(JLabel.CENTER);
		displayText.setFont(new Font("Arial", Font.PLAIN, 40));
		displayText.setText("0");
		
		//Button Panel
		this.add(buttonPanel);
		buttonPanel.setLayout(null);
		buttonPanel.setBounds(10, 100, 365, 335);
		buttonPanel.setBackground(Color.BLACK);
		
		//Number buttons
		numberButtons[0] = new JButton();
		buttonPanel.add(numberButtons[0]);
		numberButtons[0].addActionListener(null); //TODO
		numberButtons[0].setText("0");
		numberButtons[0].setBounds(115, 265, 60, 60);
		
		for(int i = 1; i < 10; i++) {
			
			int mod3 = (i - 1) % 3;
			int div3 = (i - 1) / 3;
			
			numberButtons[i] = new JButton();
			buttonPanel.add(numberButtons[i]);
			numberButtons[i].addActionListener(null); //TODO
			numberButtons[i].setText(String.valueOf(i));
			numberButtons[i].setBounds(45 + 70 * mod3, 195 - 70 * div3, 60, 60);
			
		}
		
		buttonPanel.add(decimalButton);
		decimalButton.addActionListener(null); //TODO
		decimalButton.setText(".");
		decimalButton.setBounds(185, 265, 60, 60);
		
		buttonPanel.add(negativeButton);
		negativeButton.addActionListener(null); //TODO
		negativeButton.setText("+ / -");
		negativeButton.setBounds(45, 265, 60, 60);
		
		buttonPanel.add(exponentButton);
		exponentButton.addActionListener(null); //TODO
		exponentButton.setText("e");
		exponentButton.setBounds(185, 10, 60, 30);
		
		
		
		buttonPanel.add(equalsButton);
		equalsButton.addActionListener(null); //TODO
		equalsButton.setText("=");
		equalsButton.setBounds(290, 265, 60, 55);
		
		buttonPanel.add(addButton);
		addButton.addActionListener(null); //TODO
		addButton.setText("+");
		addButton.setBounds(290, 195, 60, 55);
		
		buttonPanel.add(subtractButton);
		subtractButton.addActionListener(null); //TODO
		subtractButton.setText("-");
		subtractButton.setBounds(290, 135, 60, 55);
		
		buttonPanel.add(multiplyButton);
		multiplyButton.addActionListener(null); //TODO
		multiplyButton.setText(String.valueOf((char)215));
		multiplyButton.setBounds(290, 75, 60, 55);
		
		buttonPanel.add(divideButton);
		divideButton.addActionListener(null); //TODO
		divideButton.setText(String.valueOf((char)247));
		divideButton.setBounds(290, 15, 60, 55);
		
		
		
		buttonPanel.add(clearEntryButton);
		clearEntryButton.addActionListener(null); //TODO
		clearEntryButton.setText("CE");
		clearEntryButton.setBounds(115, 10, 60, 30);
		
		buttonPanel.add(allClearButton);
		allClearButton.addActionListener(null); //TODO
		allClearButton.setText("AC");
		allClearButton.setBounds(45, 10, 60, 30);
		
	}
	
}
