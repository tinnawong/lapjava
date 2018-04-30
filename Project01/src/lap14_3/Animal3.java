package lap14_3;

public class Animal3 extends Animal2{
	protected int weight,height;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void showDetails3() {
		System.out.format("color : %s\nnumber  eye : %d",color,numEye);
		System.out.format("\nnumber  arm : %d\nnumber  leg : %d",numArm,numLeg);
		System.out.format("\nweight : %d kg.\nheight : %d cm.",weight,height);
	}
	
}
