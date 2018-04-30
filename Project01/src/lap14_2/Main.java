package lap14_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em = new Employee();
		
		em.setName("Tin saelao");
		em.setPosition("No.11");
		em.setSalary(15000);
		em.calBill(2, 50);
		
		em.showDetails();
	}

}
