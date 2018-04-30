package lap14_3;

public class Animal {
	protected  String color;
	protected int numEye;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumEye() {
		return numEye;
	}
	public void setNumEye(int numEye) {
		this.numEye = numEye;
	}

	public void showDetails1() {
		System.out.format("color : %s\nnumber  eye : %d",color,numEye);
	}
	
	
}
