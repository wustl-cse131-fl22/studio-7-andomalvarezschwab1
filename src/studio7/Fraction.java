package studio7;

public class Fraction {

private int numerator;
private int denominator;
	
	public void setFraction(int inputNumerator, int inputDenominator) {
		numerator = inputNumerator;
		denominator = inputDenominator;
	}
	
	public int returnNum() {
		return numerator;
	}
	
	public int returnDen() {
		return denominator;
	}
	
	public Fraction addition(int num1, int den1, int num2, int den2){
		Fraction f = new Fraction();
		f.setFraction(((num1*den2)+(num2*den1)), (den1*den2));
		return f;
	}

	public static void main(String[] args) {
		Fraction f = new Fraction();
		f.setFraction(4, 3);
		f.addition(3, 4, 1, 7);
		
	}
	
}
