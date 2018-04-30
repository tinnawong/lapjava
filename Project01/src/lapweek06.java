import java.util.Scanner;
public class lapweek06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//no 1		
	/*	float number=0.0f,check=0.0f;
			
			Scanner get = new Scanner(System.in);
			System.out.print("Enter your number:");
			number = get.nextFloat();
			check=number%2;
			if(check==0) {
				System.out.println("The number is Even");
			}
			else {
				System.out.println("he number is Odd");
			}
	}*/
		
		
		
		//No.2
		
		/*float point=0.0f;
		Scanner get = new Scanner(System.in);
		System.out.println("your point :");
		point=get.nextFloat();
		point=Math.round(point);
		if(point>=80 && point<=100) {
			System.out.println("Grat A");
		}
		else if(point>=70 && point<=79) {
			System.out.println("Grat B");
		}
		else if(point>=60 && point<=69) {
			System.out.println("Grat C");
		}
		else if(point>=50 && point<=59) {
			System.out.println("Grat D");
		}
		else if(point>=0 && point<=49) {
			System.out.println("Grat F");
		}
		else if(point>100 && point<0){
			System.out.println("Error please try again!!");
		}
		else{
			System.out.println("Error please try again!!");
		}
		*/
		
		
		//no 03
		
		float datin,htimeIn,mtimeIn,   datout,htimeOut,mtimeOut;
		float daym=0.0f,hourm=0.0f,minutm=0.0f;
		Scanner get = new Scanner(System.in);
		
		System.out.print("Date in :");
		datin=get.nextFloat();
		System.out.print("hour and minute in :");
		htimeIn=get.nextFloat();
		mtimeIn=get.nextFloat();
		
		System.out.print("Date out :");
		datout=get.nextFloat();
		System.out.print("hour and minute out :");
		htimeOut=get.nextFloat();
		mtimeOut=get.nextFloat();
		
		
		
		//hour
		if((datout-datin)==0) {
			if(mtimeIn>0) {
				hourm=htimeIn-htimeOut-1;
				minutm=(60-mtimeIn)+mtimeOut;
				if(minutm>60) {
					hourm+=minutm/60;
					//minutm= คิดต่อ....
				}
			}
			else
			{
				
			}
			
		}
		else if((datout-datin)>0) {
			float i;
			i=datout-datin;
			
			if(i==1) {
				hourm=(24-htimeIn)+(htimeOut);
				minutm=(60-mtimeIn)+mtimeOut;
				
				
			}
			else if(i>1)
			{
				daym=datout-datin-1;
				hourm=(24-htimeIn)+(htimeOut);
				minutm=(60-mtimeIn)+mtimeOut;
			}
			
			
		}
		else {
			System.out.print("Error..!!");
		}
		
		
		System.out.println(daym);
		System.out.println(hourm);
		System.out.println(minutm);
		
		
		
		
		//System.out.print(htimeIn+""+mtimeIn);
		
		
		
		
		
		
		
		
		
		
		
		}
		
}
