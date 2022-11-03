package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Die {
	private int numSides;
	
	public void setNumSides(int inputNumSides) {
		numSides = inputNumSides;
	}
	
	public int returnNumSides(){
		return numSides;
	}
	
	public int dieThrown() {
		return (int) Math.round(numSides * Math.random());
	}

	public static void main(String[] args) {
		Die d = new Die();
		d.setNumSides(4);
		d.dieThrown();
		
	}
}