import java.util.Scanner;
import java.math.*;


public class lap09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner get = new Scanner(System.in);
		
		//---------------------------------- 1 -----------------------------
		/*
		int n=5;
		int num[] =new int[n];
		float avg=0,sum=0,max=0,mini=0;
		
		
		for(int i=0;i<n;i++) {
			System.out.format("Enter your number[%d] :",i+1);
			num[i] = get.nextInt();
			sum += num[i];
			if(i==0) {
				max=num[i];
				mini=num[i];
			}
			else {
				if(num[i]>max) {
					max = num[i];
				}
				if(num[i]<mini) {
					mini = num[i];
				}
			}
		}
		
		avg = sum/n;
		
		System.out.println("\n\naverang of number = " + avg);
		System.out.println("maximum of number = " + max);
		System.out.println("minimum of number = " + mini);
		System.out.println("sum of number = " + sum);
		   */
		
		
		
		//------------------------------------- 2 -------------------------------------------
		/*
		int a[]= {1,2,3,4,5,6,7},b[]= {8,9,10,11,12,13,14},ab[]=new int[a.length+b.length];
		int i=0;
		
		for(i=i;i<a.length;i++) {
			ab[i]=a[i];
		}
		for(i=a.length;i<a.length+b.length;i++) {
			ab[i]=b[i-a.length];
		}
		System.out.println("number of ab[] = "+(a.length+b.length));
		for(i=0;i<a.length+b.length;i++) {
			System.out.print(ab[i]+"\t");
			if((i+1)%3==0)
			{
				System.out.print("\n");
			}
		}
		*/
		
		
		
		//-------------------------------- 3 ---------------------------------
		
		int i,j;
		char start='a',alphabet[] = new char [26];
		
		for(int k=0;;k++) {
			System.out.print("Pleas enter your number : ");
			j = get.nextInt();
			if(j>0 && j<=26) {
				for(i=0;i<j;i++) {
					alphabet[i]=start;
					System.out.format("%c \n",alphabet[i]);
					start++;
				}
				
			}
			
		}
	
		
		
		
		
		
		//----------------------------- 4 ------------------------------
		/*
		int num,i;
		System.out.print("How number to calculate :");
		num = get.nextInt();
		float in[]=new float[num],out[]=new float[num],sum = 0,sqr=0;
		
		for(i=0;i<num;i++){
			System.out.format("number [%d]:",i+1);
			in[i]=get.nextFloat();
			
		}
		for(i=0;i<num;i++) {
			sum+=Math.pow(in[i], 2);
		}
		
		sqr=(float) Math.sqrt(sum);
		
		System.out.println("\n");
		for(i=0;i<num;i++)
		{
			out[i]=in[i]/sqr;
			System.out.format("out[%d] : %.6f\n",i,out[i]);
		}
		
		*/
		
	}

	

}
