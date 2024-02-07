package main;

import calculatorState.*;

public class Main {
	
	public Window window;
	
	public CalculatorState state;
	
	public TestState testState;
	public DefaultState defaultState;
	
	public int mainValue;
	public StringBuilder inputString;
	
	public Main() {
		
		testState = new TestState();
		defaultState = new DefaultState(this);
		
		state = defaultState;
		
		mainValue = 0;
		inputString = new StringBuilder();
		
		window = new Window(this);
		
	}
	
	public static void main(String[] args) {
		new Main();
	}

}