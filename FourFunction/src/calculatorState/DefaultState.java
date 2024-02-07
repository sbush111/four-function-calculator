package calculatorState;

import main.Main;

public class DefaultState implements CalculatorState {

	Main main;
	
	public DefaultState(Main main) {
		this.main = main;
	}
	
	@Override
	public void onNumberButtonPressed(int number) {
		
		main.inputString.append(number);
		main.window.update();
		
	}

	@Override
	public void onDecimalButtonPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNegativeButtonPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onExponentButtonPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onEqualsButtonPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAddButtonPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSubtractButtonPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMultiplyButtonPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDivideButtonPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClearEntryButtonPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAllClearEntryButtonPressed() {
		// TODO Auto-generated method stub
		
	}

}
