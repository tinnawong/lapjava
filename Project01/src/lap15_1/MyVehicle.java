package lap15_1;



import java.util.*;

import javax.swing.JOptionPane;

public abstract class MyVehicle implements vehicle2 {	
	public static void main(String[] args) {
		// abtract
		extend1 a = new extend1() {
			@Override
			float calFuel(float rate, float distance) {
				return rate*distance;
			}
		};
		
		// interface
		imple1 b = new imple1();
		
		Scanner get = new Scanner(System.in);
		
		float rate=0,curMile=0,newMile=0,distance,fuel;
		String getter;
		
		getter=JOptionPane.showInputDialog(null, "�ѵ�ҡ����������ԧ (rate) :");
		rate=Float.parseFloat(getter);
		
		getter=JOptionPane.showInputDialog(null, "�Ţ�������зҧ�Ѩ�غѹ (curMile) :");
		curMile=Float.parseFloat(getter);

		getter=JOptionPane.showInputDialog(null, "�Ţ�������зҧ���� (newMile) :");
		newMile=Float.parseFloat(getter);
		
		distance=b.calDistance(curMile, newMile);
		
		fuel = a.calFuel(rate,distance);
		
		JOptionPane.showMessageDialog(null,	"���зҧ : "+distance+"\n"+
											"������ԧ����� : "+fuel);
			
	}
}



class imple1 implements vehicle2{
	public float calDistance(float curMile, float newMile) {
		return newMile-curMile;
	}
}


abstract class  extend1 extends vehicle1 {
	abstract float calFuel(float rate, float distance);
}

