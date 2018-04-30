import java.util.Scanner;
public class lap08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner get =new Scanner(System.in);
		
		//No.1
		/*
		float a,b,c;
		System.out.print("Enter number a b and c :");
		a=get.nextFloat();
		b=get.nextFloat();
		c=get.nextFloat();
		if(a>=0 && b>=0 && c>=0) {
			float ans=(b*b)-(4*a*c);
			System.out.println("Answer :"+ans);
		}
		else {
			System.out.println("No answer!!");
		}
		*/
		
		
		
		//No.2
		/*
		float f;
		double c;
		System.out.println("This program converts Fahrenheit to Celsius");
		System.out.print("Enter Fahrenheit temperature: ");
		f=get.nextFloat();
		c=(5.0/9.0)*(f-32);
		System.out.println("Celsius equivalent = "+c);
		*/
		
		
		//No.3
		/*
		for(int i=0;i<=5;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+"\t");
			}
			System.out.println("\n");
		}
		*/
		
		
		
		
		//No.4
		/*
		int x;
		System.out.print("Enter number :");
		x=get.nextInt();
		for(int i=2;i<=x;i++)
		{
			for(int j=1;j<=12;j++)
			{
				System.out.println(i+"x"+j+"="+(i*j));
			}
			System.out.println("...\n");
		}
		
		*/
		
		
		
		
		//No.5
		/*
		int a[]=new int [5],n=5;
		int sum=0,min=0,max=0;
		float avg=0f;
		
		for(int i=0;i<n;i++) {
			System.out.format("number [%d] : ",i+1);
			a[i]=get.nextInt();
			
			sum+=a[i];
			if(i==0) {
				min=a[i];
				max=a[i];
			}
			else {
				if(a[i]>max) {
					max=a[i];
				}
				if(a[i]<min) {
					min=a[i];
				}
						
			}
			
		}
		avg=(float)sum/n;
		
		System.out.println("sum of number :"+sum);
		System.out.format("averag of number : %.2f\n",avg);
		System.out.println("max of number :"+max);
		System.out.println("min of number :"+min);
		
		
		*/
		
		
		
		
	}

}
