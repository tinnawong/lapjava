import java.util.Scanner;
public class lap02 {

	public static void main(String[] args) {
		
		// No.1
		/*int hour=1 ,minute=0 ,result=(hour*60)+minute;
		Syste.out.println(hour + "Hour and "+ minute +"minute = "+ result + " minute" );
		
		// No.2
		double r=5, area=((22/7)*r*r), line=(2*(22/7)*r);
		System.out.println("R= "+r + "area is" + area);		System.out.println("R= "+r + "line area is" + area);
		
		// No.3
		float price=100f,vatt=price*0.07f;
		System.out.println("Price is " + price + " VAT is " + vatt);*/
		
		
		// No.4
	/*	double p,v,use=28,hour=5,minute=15,time=(minute*100/60)/100+hour;
		p=450/use;
		v=450/time;
		System.out.println("time is "+time);
		System.out.println("p is "+p +" km/L");
		System.out.println("speed is " + v +" km/h");
		
		*/
		
		
		// No.5
		float price=0.0f,vatt=0.0f;
		Scanner get =new Scanner(System.in);
			System.out.println("Price : ");
			price =get.nextFloat();
			vatt=price*0.07f;
			
			System.out.println("Price is " + price + " VAT is " + vatt);
			System.out.println("total = " +(price+vatt));
	
		
	}

}
