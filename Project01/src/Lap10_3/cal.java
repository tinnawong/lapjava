package Lap10_3;

import java.util.Scanner;

public class cal {
	

	
	void Show () {
		float money=0,year=0,interest=0;
		Scanner get = new Scanner(System.in);
		
		System.out.print("Please enter your money : ");
		money = get.nextFloat();
		System.out.print("How many year for deposit : ");
		year = get.nextFloat();
		
		if(year>=1) {
			interest=(float) (money*0.05*year);
			money+=(float) (money*0.05*year);
			
			
		}
		else if(year>=5&&year<10) {
			interest=(float) (money*0.2*year);
			money+=(float) (money*0.2*year);
		}
		else if(year>=10) {
			interest=(float) (money*0.35*year);
			money+=(float) (money*0.35*year);
		}
		System.out.println("== Congratulation ==");
		System.out.println("Interest : "+interest);
		System.out.println("Your balance : "+money);
		
	}
	
	
}
