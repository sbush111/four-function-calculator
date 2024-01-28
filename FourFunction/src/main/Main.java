package main;

import calculatorState.CalculatorState;
import calculatorState.TestState;

public class Main {
	
	CalculatorState state;
	
	TestState testState;
	
	public Main() {
		testState = new TestState();
		state = testState;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		new Window(main);
	}

}