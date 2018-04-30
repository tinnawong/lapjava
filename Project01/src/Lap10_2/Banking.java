package Lap10_2;

public class Banking {
	float money=0;
	void DepositMoney (float Deposit) {
		money+=Deposit;
		System.out.println("deposit deposit :"+Deposit);
		System.out.println("money total :"+money);
	}
	
	void WithdrawMoney (float withdraw) {
		money-=withdraw;
		System.out.println("money withdraw :"+withdraw);
		System.out.println("money  :"+money);
	}
	void CheckMoney () {
		System.out.println("Money now!! :"+money+" Baht.");
	}
}
