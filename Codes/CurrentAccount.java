public class CurrentAccount extends Account{
	public CurrentAccount(){
	}
	
	public CurrentAccount(double balance){
		super(balance);
	}
	
	public double Deposit(double amount){
		System.out.println("With holding tax 16");
		double tax = amount*.16;
		System.out.println("With holding tax amount"+tax);
		super.setbalance =(super.getbalance()+amount-tax);
		return super.getbalance();
	}
	
	public double Withdraw(double amount){
		System.out.println("Wealth tax 6%");
		double tax = amount*.06;
		System.out.println("Wealth tax amount"+tax);
		super.setbalance = (super.getbalance()-amount-tax);
		return super.getbalance();
	}
}
		