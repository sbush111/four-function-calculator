package calculatorState;

public interface CalculatorState {
	public void onNumberButtonPressed(int number);
	public void onDecimalButtonPressed();
	public void onNegativeButtonPressed();
	public void onExponentButtonPressed();
	public void onEqualsButtonPressed();
	public void onAddButtonPressed();
	public void onSubtractButtonPressed();
	public void onMultiplyButtonPressed();
	public void onDivideButtonPressed();
	public void onClearEntryButtonPressed();
	public void onAllClearEntryButtonPressed();
}
