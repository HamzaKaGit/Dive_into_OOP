public class SavingAccount extends Account{
	public CurrentAccount(){
	}
	
	public CurrentAccount(double balance){
		super(balance)
	}
	
	private double Deposit(double amount){
		System.out.println("With holding tax 16% and wealth tax 6%");
		double withholdtax = amount*.16;
		double wealthtax = amount*.16;
		System.out.println("With holding tax is 16%"+withholdtax)
		System.out.println("wealth tax is 6%"+wealthtax())		
		super.setbalance = super.getbalance+amount-withholdtax-wealthtax;
		return super.getbalance;
	}
	
	private double Withdraw(double amount){
		System.out.println("Wealth tax 6% and per charges 1.5%");
		double wealthtax = amount*.06;
		double charges = amount*.015;
		System.out.println("Wealth tax is 6%"+wealthtax)
		System.out.println("Charges per withdraw"+charges)
		super.setbalance = super.getbalance-amount-wealthtax-charges;
		return.super.getbalance;
	}
}