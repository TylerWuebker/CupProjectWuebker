package model;

public class CupLogic {
	
	public int fill(Cup cup, int fillAmt) {
		int currentOZF = cup.getHowFull() + fillAmt;
		
		return currentOZF;
	}
	
	public int empty(Cup cup, int emptyAmt) {
		int currentOZE = cup.getHowFull() - emptyAmt;
		
		return currentOZE;
	}
	
	public boolean isFull(Cup cup) {//function to check if the cup is above its sizeOZ amount
		boolean isFull;
		if(cup.getHowFull() >= cup.getSizeOZ()) {
			isFull = true;
		}
		else {
			isFull = false;
		}
		return isFull;
	}
	
}
