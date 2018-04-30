package lap14_3;

public  class Animal4 extends Animal3 {
	protected String food;

	public String getFood() {
		return food;
	}

	public  void setFood(String food) {
		this.food = food;
	}
	
	public void showDetails4() {
		System.out.format("color : %s\nnumber  eye : %d",color,numEye);
		System.out.format("\nnumber  arm : %d\nnumber  leg : %d",numArm,numLeg);
		System.out.format("\nweight : %d kg.\nheight : %d cm.",weight,height);
		System.out.format("\nfood of animal : %s",food);
	}
}
