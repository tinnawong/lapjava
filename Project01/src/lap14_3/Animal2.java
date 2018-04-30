package lap14_3;

public class Animal2 extends Animal {
	protected int numArm,numLeg;

	public int getNumArm() {
		return numArm;
	}

	public void setNumArm(int numArm) {
		this.numArm = numArm;
	}

	public int getNumLeg() {
		return numLeg;
	}

	public void setNumLeg(int numLeg) {
		this.numLeg = numLeg;
	}

	public void showDetails2() {
		System.out.format("color : %s\nnumber  eye : %d",color,numEye);
		System.out.format("number  arm : %s\nnumber  leg : %d",numArm,numLeg);
	}
	

}
