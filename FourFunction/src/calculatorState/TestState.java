package calculatorState;

public class TestState implements CalculatorState {

	@Override
	public void onNumberButtonPressed(int number) {
		System.out.println(number);
	}

	@Override
	public void onDecimalButtonPressed() {
		System.out.println(".");
	}

	@Override
	public void onNegativeButtonPressed() {
		System.out.println("-");
	}

	@Override
	public void onExponentButtonPressed() {
		System.out.println("e");
	}

	@Override
	public void onEqualsButtonPressed() {
		System.out.println("=");
	}

	@Override
	public void onAddButtonPressed() {
		System.out.println("+");
	}

	@Override
	public void onSubtractButtonPressed() {
		System.out.println("-");
	}

	@Override
	public void onMultiplyButtonPressed() {
		System.out.println((char) 215);
	}

	@Override
	public void onDivideButtonPressed() {
		System.out.println((char) 247);
	}

	@Override
	public void onClearEntryButtonPressed() {
		System.out.println("CE");
	}

	@Override
	public void onAllClearEntryButtonPressed() {
		System.out.println("AC");
	}

}
