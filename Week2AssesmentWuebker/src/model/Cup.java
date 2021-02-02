package model;

public class Cup {
	private String color;
	private int sizeOZ;
	private int howFull;
	
	
	//gets sets
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSizeOZ() {
		return sizeOZ;
	}
	public void setSizeOZ(int sizeOZ) {
		this.sizeOZ = sizeOZ;
	}
	public int getHowFull() {
		return howFull;
	}
	public void setHowFull(int howFull) {
		this.howFull = howFull;
	}
	
	
	//constructors
	
	Cup(){
		
	}
	
	public Cup(String _color){
		setColor(_color);
	}
	
	
}
