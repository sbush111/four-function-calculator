package main;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Window extends JFrame {
	
	JPanel upperPanel;
	JPanel mainPanel;
	
	public Window(Main main) {
		
		this.setBounds(0, 0, 300, 500);
		this.setTitle("Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		upperPanel = new JPanel();
		upperPanel.setBackground(Color.RED);
		this.add(upperPanel, BorderLayout.NORTH);
		
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.BLUE);
		this.add(mainPanel, BorderLayout.CENTER);
		
		this.setVisible(true);
		
	}
	
}
